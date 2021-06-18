public class Lessons2 {
    public static void main(String[] args) {
        System.out.println("Результат задания 1 " + looking(1, 10));
        isPositive(10);
        String result = (isPossitive1(-1)) ? "Number is positive" : "Number is negative";
        System.out.println(result);
        methodArgumentStringNumber("Lera", 10);
        int Year = 2008;
        System.out.println("Year " + Year + " is leap? > " + yearGood(Year));

    }

    public static boolean looking(int a, int b) {
        int sum = a + b;
        return (sum <= 20) && (sum >= 10);
    }

    public static void isPositive(int result) {
        if (result >= 0) {
            System.out.println(result + "positive");
        } else {
            System.out.println(result + " negative");
        }
    }

    public static boolean isPossitive1(int result) {
        return result <= 0;
    }

    public static void methodArgumentStringNumber(String value, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Number " + i + " : " + value);
        }
    }

    public static boolean yearGood(int year) {
        return (year %4 == 0) && (year %100 != 0) || (year % 400 == 0);
    }
}














         // 1 Написать метод, принимающий на вход два целых числа и проверяющий,
        //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
       // в противном случае – false.

         //2. Написать метод, которому в качестве параметра передается целое число,
        //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
       // Замечание: ноль считаем положительным числом.

       //3. Написать метод, которому в качестве параметра передается целое число.
       // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    //4. Написать метод, которому в качестве аргументов передается строка и число,
   // метод должен отпечатать в консоль указанную строку, указанное количество раз;

    //5*. Написать метод, который определяет, является ли год високосным,
       // и возвращает boolean (високосный - true, не високосный - false).
       // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.