package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month > 12 || month < 0) {
            System.out.println("invalid date");
        } else {
            boolean checkIsYearLeap = year % 4 == 0;
            boolean checkIsYearMultiple_100 = year % 100 == 0;
            boolean checkIsYearMultiple_400 = year % 400 == 0;
            if (checkIsYearMultiple_400) {
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
                    case 4, 6, 9, 11 -> System.out.println("30");
                    case 2 -> System.out.println("29");
                }
            } else {
                if (checkIsYearLeap && !checkIsYearMultiple_100) {
                    switch (month) {
                        case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
                        case 4, 6, 9, 11 -> System.out.println("30");
                        case 2 -> System.out.println("29");
                    }
                } else if (checkIsYearMultiple_100) {
                    switch (month) {
                        case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
                        case 4, 6, 9, 11 -> System.out.println("30");
                        case 2 -> System.out.println("28");
                    }
                } else {
                    switch (month) {
                        case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
                        case 4, 6, 9, 11 -> System.out.println("30");
                        case 2 -> System.out.println("28");
                    }
                }
            }
        }
    }
}
