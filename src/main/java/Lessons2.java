public class Lessons2 {
    public static void main(String[] args) {
        System.out.println("Результат задания 1 " + looking (1,10));
    }
        public static boolean looking (int a,int b ){
            int sum = a + b;
            return (sum <= 20) && (sum >= 10);

        }
    }

         // 1 Написать метод, принимающий на вход два целых числа и проверяющий,
        //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
       // в противном случае – false.