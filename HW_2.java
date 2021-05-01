import java.sql.SQLOutput;

public class HW_2 {

    public static void main(String[] args) {

//        1. Написать метод, принимающий на вход два целых числа и проверяющий,
//         что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//         в противном случае – false.
        System.out.println("Задание 1:");
        {
            int a = 12;
            int b = 5;
            int result = a + b;

            if (result > 9 & result < 21) {
                System.out.println("true 10<" + result + "<20");
            } else System.out.println("false");
        }
        System.out.println();
        System.out.println("Задание 2:");
        {
            int a = 5;
            boolean result = a > -1;


            if (result) {
                System.out.println("Положительное");
            } else
                System.out.println("Отрицательное");


        }
        System.out.println();
        System.out.println("Задание 3:");
        // 3. Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        {
            int a = -1;

            boolean result = a > -1;
            if (result) {
                System.out.println("false");
            } else
                System.out.println("true");

        }
// 4. Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;
        {

            System.out.println();
            System.out.println("Задание 4:");

            String value = "Укачанная строка";
            int i = 15; //указанное количество раз
            for (int a = 0; a < i; a++) {
                System.out.println(value);
            }
        }
//  5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
//  (високосный - true, не високосный - false).
//  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        {


            System.out.println();
            System.out.println("Задание 5:");

            int a = 1905;
            if (a %100==0 && a %400 ==0 )
                System.out.println("true");

            else if (a % 4 == 0 && a % 100 > 0)
                System.out.println("true");

            else if (a % 100 == 0)
                System.out.println("false");

            else
                System.out.println("false");


        }
    }

}
