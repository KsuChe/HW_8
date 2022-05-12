import java.time.LocalDate;

public class Homework {
    public static void main(String[] args) {

        task1(2020);


        task2(0,2022);

        task3(95);
    }

    private static void task1(int year) {
        isYearLeap(year);
    }
    private static void isYearLeap (int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void task2(int clientOS, int currentYear) {
        checkPhone(clientOS, currentYear);
    }

    private static void checkPhone(int clientOS, int currentYear) {
        if (clientOS == 0 && currentYear == LocalDate.now().getYear()) {
            System.out.println("Установите мобильную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && currentYear < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && currentYear >= LocalDate.now().getYear()) {
            System.out.println("Установите мобильную версию приложения для Android по ссылке");
        }else System.out.println("Установите облегченную версию приложения для Android по ссылке");

    }

    private static void task3(int deliveryDistance) {
        calculateDaysDistance(deliveryDistance);
        }

    private static void calculateDaysDistance(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (days+1));
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (days+2));
        } else System.out.println("Потребуется дней: " + days);
    }
    }







