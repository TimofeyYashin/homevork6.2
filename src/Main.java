public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void yearCalculation(int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " год високосный.");
        else {
            System.out.println(year + " год невисокосный.");
        }
    }

    public static void task1() {
        int year = 2028;
        yearCalculation(year);
    }

    public static void parameterFeed(int year, int clientsOS) {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (year > clientDeviceYear && clientsOS == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");}
        else if (year > clientDeviceYear && clientsOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");}
        else if (year <= clientDeviceYear && clientsOS == 0){
            System.out.println("Установите версию приложения для IOS по ссылке.");}
        else if (year <= clientDeviceYear && clientsOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке.");}
    }

    public static void task2() {
        int clientOS = 1;
        int year = 2015;
        parameterFeed(year, clientOS);
    }

    public static String amountOfDays(int distance) {
        System.out.println("Задача 3 ");
        int days = 1;
        if (distance < 20);
         else if (distance > 20 && distance <= 60) {
            days++;
        }
        if (distance > 60 && distance <= 100) {
            days = days + 2;
        } else if (distance > 100) {
            return "Не возможно рассчитать срок доставки.";
        }
        return "Потребуется дней: " + days;
    }

    public static void task3() {
        System.out.println(amountOfDays(109));
    }
}
