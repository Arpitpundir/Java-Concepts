package JavaMethods;

import java.util.Scanner;

public class PrintCalendar {
    public static void printCalendar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full year: ");
        int year = input.nextInt();

        System.out.println("Enter year: ");
        int month =  input.nextInt();

        printMonth(year, month);
    }

    private static void printMonth(int year, int month){
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    private static void printMonthTitle(int year, int month){
        System.out.println("     " + getMonthName(month) + " " + year);
        System.out.println("-------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    private static String getMonthName(int month){
        String monthName = "";
        switch (month){
            case 1: monthName = "January"; break;
            case 2: monthName = "Feburary"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }

        return monthName;
    }

    private static void printMonthBody(int year, int month){

        // Get start day of the week for the first date in the month
        int startDay = getStartDay(year, month);

        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
        for(int i = 0; i < startDay; i++){
            System.out.print("    ");
        }

        for(int i = 1; i <= numberOfDaysInMonth; i++){
            System.out.printf("%4d", i);
            if((i + startDay - 1) % 7 == 0){
                System.out.println();
            }
        }

        System.out.println();
    }

    private static int getStartDay(int year, int month){
        final int START_DAY_FOR_JAN_1_1800 = 3;

        // Get total number of days inbetween
        int totalNumberOfDays = getTotalNumberfDays(year, month);

        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800)%7;
    }

    private static int getTotalNumberfDays(int year, int month){
        int total = 0;

        for(int i=1800; i<year; i++){
            if(isLeapYear(i)){
                total += 365;
            }else{
                total += 364;
            }
        }

        for(int i=1;i<month;i++){
            total = total + getNumberOfDaysInMonth(year, month);
        }
        return total;
    }

    private static int getNumberOfDaysInMonth(int year, int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8
         || month == 10 || month == 12){
            return 31;
        }

        if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }

        if(month == 2) return isLeapYear(year) ? 29:28;

        return 0;
    }

    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
