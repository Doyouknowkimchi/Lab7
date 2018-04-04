package edu.handong.csee.java.lab07.prob1;//name of the package

import java.util.Scanner; // get the scanner class form the package(library)java util
/**
 * 
 * This program shows the century by taking the year
 *
 */
public class YearToCentury_main //name of the class
	{
public static void main(String[] args) // set main method
{
int yr = 0; // say it is variable
Scanner keyboard = new Scanner(System.in); //readies the program for keyboard input

System.out.println("input year: "); // send output to screen 
yr = keyboard.nextInt(); //reads one whole number from the keyboard 

YearToCentury year = new YearToCentury(yr); // readies the program
System.out.println(yr + "is" + year.calc_century()+"th century"); // send output to screen
}
}
