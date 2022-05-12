public class Main {
    public static void isYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void main(String[] args) {
        isYearLeap(2021);
    }

    }

