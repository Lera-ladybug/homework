public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a1 = 5;
        int b1 = 7;
        int c = a1 + b1;
        System.out.println(c);
        if (c >= 0) {
            System.out.println("Сумма положительная,c >= 0");
        } else {
            System.out.println("Сумма отрицательная,c < 0");
        }

        public static void printColor () {
            int color_r = -10;
            if (color_r <= 0) ;
            System.out.println("Красный color_r <= 0");
                int color_y = 10;
                if (color_y > 0 && color_y >= 100) ;
                System.out.println("Желтый color_y >= 100");
                int color_g = 120;
                if (color_g > 100) ;
                System.out.println("Зеленый color_g > 100");
            }

            // public static void compareNumbers () {
            int a = 5;
            int b = 7;
            if (a >= b && a < b) ;
            System.out.println(a >= b);
            System.out.println(a < b);

        }
    }