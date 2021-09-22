

/*
//Ask the user to input 3 whole numbers. Print out which of these numbers is the biggest. For example, user enters 5, -1, and 100. You print out 100.

//Problem 1: 

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    //create a scanner object
    Scanner s = new Scanner(System.in);
    //take the input
    System.out.println("Put Three Whole Numbers: ");
    
    System.out.println("First Number :");
    int num1 = s.nextInt();

    System.out.println("Second Number :");
    int num2 = s.nextInt();

    System.out.println("Third Number :");
    int num3 = s.nextInt();

    if (num1>num2)
    if (num1>num3)
    System.out.println("Biggest : " + num1);

    if (num2>num1)
    if (num2>num2)
    System.out.println("Biggest : " + num2);

    if (num3>num2)
    if (num3>num1)
    System.out.println("Biggest : " + num3);
    */
    
  
  /*
    Practice Problem 2:
    Ask the user to input 2 whole numbers. Count up from the smaller of the numbers to the larger of the numbers (inclusive). For example, user enters -5 and 10. You print out -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.   
  
 import java.util.Scanner;

  class Main {
  public static void main(String[] args) {
    
    //create a scanner object
    Scanner s = new Scanner(System.in);
    //take the input
    System.out.println("Start : ");
    int start = s.nextInt();

    System.out.println("End : ");

    int end = s.nextInt();

    int i;
    for (i=start ; i<=end; i++)
    {
    System.out.println(i + "");
    }
    */
  
  
// Practice Problem 3:
  //Ask the user to input a year (as 4 digits, like 2021). Print out whether or not that year is a leap year. (PS. You will want to make sure what the user enters is actually a year...4 digits, not negative.) Hint for determining leap years: if the year is divisible by 4 AND the year is either not divisible by 100 or is divisible by both 100 and 400, then it's a leap year.
  
  import java.util.Scanner;

  class Main {
  public static void main(String[] args) {
    
    //create a scanner object
    Scanner s = new Scanner(System.in);

    System.out.println("Enter four digit number : ");
    int year;
    year= s.nextInt();

    if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
    {
      System.out.println("It is a leap year");
    }
    else
    {
      System.out.println("It is not a leap year");
    }


  }
}