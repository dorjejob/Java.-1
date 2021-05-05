public class HomeWorkApp {

    public static void main (String [] args) {

        // Создайте метод printThreeWords()
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");


        // Создайте метод checkSumSign()
        int a = -48652;
        int b = 12316;
        int summa;
        summa = a +b;

        if (summa > 0) {
            System.out.println("Сумма положительная");
        } else if (summa < 0) {
            System.out.println("Сумма отрицательная");
        }

        // Создайте метод printColor()
        int value = 101;

        if (value < 0) {
            System.out.println("“Красный”");
        } else if (value > 100) {
            System.out.println("“Зеленый”");
        } else System.out.println("“Желтый”");

        // Создайте метод compareNumbers()
        int q = 1;
        int z = 1;

        if (q < z) {
            System.out.println("q<z");
        } else System.out.println("q>=z");
    }
}
