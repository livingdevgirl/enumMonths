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


           months.add(month.getEnglishName());
        }
        System.out.println(months);
        System.out.println("choose a month out of the year!");
        String userMonth = scanner.nextLine().toUpperCase();
        for (Month month : Month.values()) {
            if (!userMonth.equals(month.getEnglishName().toUpperCase())) {
            } else {
                System.out.println("you have selected " + userMonth);
                break;
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
    }
}