 class Print {
        static int i;
        public  String line;
        public int lineA;
        public int lineB;
        public void A() {
            String A = "AAAAAAA";
            System.out.println(line);
            for (i = 1; i <= lineA; i++) {
                System.out.println(A);
            }
        }
        public void B (){
            String B = "BBBBBBB";
            System.out.println(line);
            for (i = 1; i <= lineB; i++) {
                System.out.println(B);
            }
        }
    }