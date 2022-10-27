import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class dinnerMenu {
    static String[] menus = new String[99];
    static int menuNum = 0;
    static int yesterDayMenu = 0;

        public static void main(String[] args) throws IOException {
            mainMenu();
        }
        static void mainMenu() throws IOException{
            readMenuList();
            readYesterDayMenu();
            if(menuNum ==0){
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "메뉴가 비어있어요! 메뉴를 먼저 등록해 주세요!");
                addMenu();
            }
            JFrame jFrame = new JFrame();

            JDialog jd = new JDialog(jFrame);

            jd.setLayout(new FlowLayout());

            jd.setBounds(500, 300, 400, 300);

            JLabel jLabel = new JLabel("메뉴를 추천 받으시려면 버튼을 눌러주세요");
            JLabel jLabel2 = new JLabel("메뉴를 추가 하시려면 버튼을 눌러주세요");
            JLabel jLabel3 = new JLabel("메뉴를 삭제 하시려면 버튼을 눌러주세요");
            JLabel jLabel5 = new JLabel("메뉴목록을 보시려면 버튼을 눌러주세요");
            JButton jButton = new JButton("메뉴 추천받기");
            JButton jButton2 = new JButton("메뉴 추가하기");
            JButton jButton3 = new JButton("메뉴 삭제하기");
            JButton jButton5 = new JButton("메뉴 목록보기");
            JButton jButton6 = new JButton("종료");
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jd.setVisible(false);
                    try {
                        suggestMenu();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        mainMenu();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }

            });
            jButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jd.setVisible(false);
                    try {
                        addMenu();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        mainMenu();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
            jButton3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jd.setVisible(false);
                    try {
                        deleteMenu();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        mainMenu();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                                       }
            );
            jButton5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jd.setVisible(false);
                    JFrame jFrame = new JFrame();
                    JOptionPane.showMessageDialog(jFrame, showMenu());
                    try {
                        mainMenu();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }

            });
            jButton6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jd.setVisible(false);
                    System.exit(0);
                }

            });
            jd.add(jLabel);
            jd.add(jButton);
            jd.add(jLabel2);
            jd.add(jButton2);
            jd.add(jLabel3);
            jd.add(jButton3);
            jd.add(jLabel5);
            jd.add(jButton5);
            jd.add(jButton6);
            jd.setVisible(true);

        }
    static void readMenuList() throws IOException {
            try {
                BufferedReader br = new BufferedReader(new FileReader("dinnerMenuList.txt"));
                String str;
                menuNum = 0;
                while ((str = br.readLine()) != null) {
                    menus[menuNum] = str;
                    menuNum++;
                }
                br.close();
            }catch (FileNotFoundException e){
                FileWriter fw = new FileWriter("dinnerMenuList.txt");
                fw.write("");
                fw.close();
                readMenuList();
            }
    }
    static void readYesterDayMenu() throws IOException{
        try {
            BufferedReader br = new BufferedReader(new FileReader("yesterDayMenu.txt"));
            yesterDayMenu = Integer.parseInt(br.readLine());
            br.close();
        }catch (FileNotFoundException f){
            FileWriter fw = new FileWriter("yesterDayMenu.txt");
            fw.write("100");
            fw.close();
            readYesterDayMenu();
        }
    }

    static void suggestMenu() throws IOException {
        boolean status = false;
        int menu =0;
        while (!status) {
            int Winner = (int)(Math.random()*100);
            if(Winner<menuNum&&yesterDayMenu!=Winner){
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "오늘 저녁은 "+menus[Winner]);
                menu = Winner;
                status = true;
            }
        }
        FileWriter fw2 = new FileWriter("yesterDayMenu.txt");
        fw2.write(""+menu);
        fw2.close();
    }
    static void addMenu() throws IOException {
        FileWriter fw = new FileWriter("dinnerMenuList.txt");
        if(menuNum!=0) {
            for (int i = 0; i < menuNum; i++) {
                fw.write(menus[i] + "\n");
            }
        }
        JFrame jFrame = new JFrame();
        String getMessage = JOptionPane.showInputDialog(jFrame, "추가하실 음식을 입력해주세요.");
        if (getMessage.isEmpty()||getMessage.equals(" ")||getMessage.equals("  ")){
            JOptionPane.showMessageDialog(jFrame,  "음식 추가를 취소합니다.");
        } else if(getMessage!=null) {
            fw.write(getMessage + "\n");
            JOptionPane.showMessageDialog(jFrame, getMessage + "을 추가 했습니다.");
        }else {
            JOptionPane.showMessageDialog(jFrame,  "음식 추가를 취소합니다.");
        }
        fw.close();
        readMenuList();
    }
    static void deleteMenu() throws IOException {
        JFrame jFrame = new JFrame();
        String getMessage = JOptionPane.showInputDialog(jFrame, showMenu()+
                "===============\n"+"삭제하실 음식의 이름을 입력해주세요.");
        try {
            if (getMessage.isEmpty() || getMessage.equals(" ") || getMessage.equals("  ") || getMessage == null) {
                JOptionPane.showMessageDialog(jFrame, "음식 삭제를 취소합니다.");
            } else if (getMessage != null) {
                boolean status = false;
                for (int i = 0; i < menuNum; i++) {
                    if (menus[i].equals(getMessage)) {
                        delete(i);
                        status = true;
                        break;
                    }
                }
                if (status) {
                    JOptionPane.showMessageDialog(jFrame, getMessage + "을 삭제 했습니다.");
                } else {
                    JOptionPane.showMessageDialog(jFrame, "해당 음식이 존재하지 않습니다.");
                }
            } else {
                JOptionPane.showMessageDialog(jFrame, "음식 삭제를 취소합니다.");
            }
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(jFrame, "음식 삭제를 취소합니다.");
        }
    }
    static void delete(int target) throws IOException {
        FileWriter fw = new FileWriter("dinnerMenuList.txt");
        for (int i = 0; i < target; i++) {
            fw.write(menus[i] + "\n");
        }
        for (int i = target+1; i < menuNum; i++) {
            fw.write(menus[i] + "\n");
        }
        fw.close();
        if(target<yesterDayMenu){
            yesterDayMenu--;
        }else if(target == yesterDayMenu){
            yesterDayMenu = 100;
        }

    }

    static String showMenu(){
            String str="";
            for(int i=0;i<menuNum;i++){
                str+=(menus[i]+"\n");
            }
            return str;
    }

}
