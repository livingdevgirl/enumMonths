package com;
import com.example.common.Month;

import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("choose a month out of the year!");
        String userMonth = scanner.nextLine().toUpperCase();


        //get the value of the user input and compare it to the value of the month get

        //user month == month in month array?

        //case statement
        for (Month month : Month.values()) {
            if (!userMonth.equals(month.getEnglishName().toUpperCase())) {

            } else {
                System.out.println("you have selected " + userMonth);
            }

        }
    }

    private List<Month> monthList;

    public List<Month> getMonths(){
        return monthList;
    }
}