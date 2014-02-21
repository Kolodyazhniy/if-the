package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      boolean andreySleep = true;
      int hisProductivity = 100;
       int percentWorkingTime = 0;


              // it-then statement


            if (percentWorkingTime>=90) {
               int workingRate = percentWorkingTime - 10;
                System.out.println( + workingRate);
            }
            else if (percentWorkingTime>=80) {

              int workingRate = percentWorkingTime - 20;
                System.out.println( + workingRate);
            }
            else if (percentWorkingTime>=70) {
                int workingRate = percentWorkingTime - 30;
                System.out.println("Andrey almost sleep");
               System.out.println( + workingRate);
            }



           else System.out.println("Andrey sleep");


    }





















    }

