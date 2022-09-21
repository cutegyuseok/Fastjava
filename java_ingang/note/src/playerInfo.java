public class playerInfo {
    public static void main(String[] args) {
        Player playerHyun = new Player();
        playerHyun.playerName = "슈퍼울트라천사망고";
        playerHyun.playerCard = "남겨진 바람의 절벽 30각";
        playerHyun.playerLevel = 1590.83;
        playerHyun.playerClass = "바드";

        Player playerLee = new Player();
        playerLee.playerName = "봉인이풀려버린치킨";
        playerLee.playerLevel = 1595.83;
        playerLee.playerClass = "블래스터";
        playerLee.playerCard = "세상을 구하는 빛 30각";

        playerLee.playerInfo();
        playerHyun.playerInfo();
    }
}
