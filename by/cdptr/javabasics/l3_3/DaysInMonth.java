package by.cdptr.javabasics.l3_3;

import java.util.Scanner;

public class DaysInMonth {

    static int enterNumber() {

        Scanner sc = new Scanner(System.in);

        int c = 0;

        if (sc.hasNextInt()) {

            c = sc.nextInt();

        }

        return c;
    }

    static int countDaysQuantity(int d, int e) {

        int daysQTY = 0;

        switch (d) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                daysQTY = 31;
                break;

            case 2:
                if (e % 4 == 0 && e % 100 != 0 || e % 400 == 0) {

                    daysQTY = 29;

                } else {

                    daysQTY = 28;

                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                daysQTY = 30;
                break;

        }

        return daysQTY;

    }

    static String nameMonth(int z) {

        String monthName = "";

        switch (z) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "Novermber";
                break;
            case 12:
                monthName = "December";
                break;

        }

        return monthName;


    }

}
