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
        //int c = a1 + b1;
        if ((a1 + b1) >= 0) {
            System.out.println("Сумма положительная,c >= 0");
        } else {
            System.out.println("Сумма отрицательная,c < 0");
        }
    }

        public static void printColor () {
            int color_r = -10;
            // if (color_r <= 0) ;
            System.out.println("color_r <= 0");
            int color_y = 10;
            //if (color_y > 0 && color_y >= 100) ;
            System.out.println("color_y > 0 && color_y >= 100");
            int color_g = 123;
           //if (color_g > 100) ;
            System.out.println("color_g > 100");
        }


        public static void compareNumbers () {
            int a = 5;
            int b = 7;
            if (a >= b && a < b) ;
            System.out.println(a >= b);
            System.out.println(a < b);

        }
    }



   // 1 Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
   // 2 Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple. Orange Banana Apple
   // 3 Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
   // 4 Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
   // 5 Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
   // 6 Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.

