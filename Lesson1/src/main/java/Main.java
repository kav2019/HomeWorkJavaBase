public class Main {
    public static void main(String[] args) {
        /* Задание 2 */
        byte a = 1;
        short b = 32000;
        int c = 2147483647;
        long d = 9223372036854775805L;
        float e = 1.25F;
        double f =3.14;
        boolean i = true;
        String g = "Hello World!";


        /* Задание 3
        Написать метод вычисляющий выражение a * (b + (c / d)) и
        возвращающий результат,где a, b, c, d – входные параметры этого метода */
        double x = math(1, 2, 3, 4);
        System.out.println(x);


        /* Задание 4
        Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
         в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false
         */
        System.out.println("\n");
        System.out.println("Переменные равны 5 и 5 - значение входит в диапозон от 10 до 20: " + twoNumber(5,5));
        System.out.println("Переменные равны 10 и 5 - значение входит в диапозон от 10 до 20: " + twoNumber(10,5));
        System.out.println("Переменные равны 10 и 15 - значение входит в диапозон от 10 до 20: " + twoNumber(10,15));


        /* Задание 5
        Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
        положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
         */
        System.out.println("\n");
        positivNumber(5);
        positivNumber(0);
        positivNumber(-3);


        /* Задание 6
        Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
        если число отрицательное;
         */
        System.out.println("\n");
        System.out.println("Возвращенное значение " + trueNumbers(5));
        System.out.println("Возвращенное значение " + trueNumbers(-5));


         /* Задание 7
         Написать метод, которому в качестве параметра передается строка, обозначающая имя,
         метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
          */
        System.out.println("\n");
        returnHello("Александр");
        returnHello("Павел");



        /* Задание 8
        Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
         */
        System.out.println("\n");
        isLeapYear(2020);
        isLeapYear(2000);
        isLeapYear(2068);
        isLeapYear(2021);
        isLeapYear(2019);





    }

    public static double math(int a, int b, int c, int d){
        return  (a * (b + c / (double)d));
    }


    public static boolean twoNumber(int a, int b){
        if (a + b > 10 && a + b <= 20){
            return true;
        }else {
            return false;
        }
    }

    public static void positivNumber(int a){
        if (a >= 0){
            System.out.println("Число " + a + " - является положительным!");
        }else {
            System.out.println("Число " + a + " - является отрицательным!");
        }
    }

    public static boolean trueNumbers(int a){
        if (a < 0){
            return true;
        }else {
            return false;
        }
    }


    public static void returnHello(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void isLeapYear(int year){
        if (year % 100 == 0 && year % 400 != 0){
            System.out.println( year + " - год НЕ високосный");
        }else if (year % 400 == 0 || year % 4 ==0){
            System.out.println( year + " - год високосный");
        }else {
            System.out.println( year + " - год Не високосный");
        }
    }


}
