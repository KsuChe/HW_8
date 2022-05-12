import java.time.LocalDate;

public class Main {


//    public static void task1 (isYearLeap(2020)) {
//        public static void task1(); {
//            isYearLeap(2020);
//            public static void isYearLeap(int year) {
//                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//                    System.out.println(year + " год является високосным");
//                }else {
//                    System.out.println(year + " год не является високосным");
//                }
//            }}
//
//    }



    public static void main (int clientOS, int currentYear) {
        checkDevice(0,2022);
    }
    public static void checkDevice(int clientOS, int currentYear) {
        if (clientOS == 0 && currentYear == LocalDate.now().getYear()) {
            System.out.println("Установите мобильную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && currentYear < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && currentYear >= LocalDate.now().getYear()) {
            System.out.println("Установите мобильную версию приложения для Android по ссылке");
        }else System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }

}