package com;
import com.example.common.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> months = new ArrayList<>();

        for (Month month : Month.values()
                ) {


            months.add(month.getEnglishName().toUpperCase());
        }
        for (int i = 0; i < months.indexOf(i); i++) {
            System.out.println(months.indexOf(i));
        }

        System.out.println(months);
        System.out.println("choose a month out of the year!");
        String userMonth = scanner.nextLine().toUpperCase();
        for (Month month : Month.values()) {
            if (!userMonth.equals(month.getEnglishName().toUpperCase())) {
            } else {

                System.out.println(Month.valueOf(userMonth));
                System.out.println("you have selected " + userMonth);

                    switch (month) {
                        case JANUARY:
                            System.out.println(" February, March, April, May, June, July, September, October, November and December are left in this current year.");
                            break;
                        case FEBRUARY:
                            System.out.println(" March, April, May, June, July, September, October, November and December are left in this current year.");
                            break;
                        case MARCH:
                            System.out.println(" April, May, June, July, September, October, November and December are left in this current year.");
                            break;
                        case APRIL:
                            System.out.println(" May, June, July, September, October, November and December are left in this current year.");
                            break;
                        case MAY:
                            System.out.println(" June, July, September, October, November and December are left in this current year.");
                            break;
                        case JUNE:
                            System.out.println(" July, September, October, November and December are left in this current year.");
                            break;
                        case JULY:
                            System.out.println(" August, September, October, November and December are left in this current year.");
                            break;
                        case AUGUST:
                            System.out.println(" September, October, November and December are left in this current year.");
                            break;
                        case SEPTEMBER:
                            System.out.println(" October, November and December are left in this current year.");
                            break;
                        case OCTOBER:
                            System.out.println(" November and December are left in this current year.");
                            break;
                        case NOVEMBER:
                            System.out.println(" December is the only month left in the current year.");
                            break;
                        case DECEMBER:
                            System.out.println("this is the last month of the year");
                            break;
                    default:
                        System.out.println("not a month");
                    }
                    }
                }

                //add the months for given month and use a switch statement to return that month and the months following in the year.
            }

        }


        //get the value of the user input and compare it to the value of the month get

        //user month == month in month array?

        //case statement
//        for (Month month : Month.values()) {
//
//
////           String userMonth = scanner.nextLine().toUpperCase();
//
//    }
//
//        private List<Month> monthList;
//
//        public List<Month> getMonths () {
//            return monthList;
//        }