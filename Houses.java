public enum Houses {
        House1(55000),House2(40000),
        House3(70000),House4(50000),
        House5(65000);


        private int value;
        Houses(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    class App {
        public static void main(String[] args) {
            System.out.println("House1 value is "+ Houses.House1.getValue());
            System.out.println("House2 value is "+ Houses.House2.getValue());
            System.out.println("House3 value is "+ Houses.House3.getValue());
            System.out.println("House4 value is "+ Houses.House4.getValue());
            System.out.println("House5 value is "+ Houses.House5.getValue());
        }
    }
