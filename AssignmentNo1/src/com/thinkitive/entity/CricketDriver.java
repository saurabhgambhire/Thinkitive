package com.thinkitive.entity;

import java.util.Scanner;

public class CricketDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        do {
            System.out.println("Enter 1 to Update the Score Board and See updated the Score board");
            System.out.println("Enter 2 to Quite");
            System.out.println("Enter your Choice ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println(" Enter your Runs : ");
                    double runs = sc.nextDouble();
                    System.out.println("Enter your overs : ");
                    int overs = sc.nextInt();
                    System.out.println("Enter your Wickets : ");
                    int wickets = sc.nextInt();
                    CricketData cricketData = new CricketData(runs, wickets, overs, new CurrentScoreDisplay(), new AverageScoreDisplay());
                }
                break;

                case 2: {
                    status = false;
                }
            }
        } while (status);
    }
}
