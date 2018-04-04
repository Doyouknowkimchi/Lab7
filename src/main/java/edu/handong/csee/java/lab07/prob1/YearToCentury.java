package edu.handong.csee.java.lab07.prob1; //name of the package
/**
 * 
 * class for main, Storage of methods..?
 *
 */
public class YearToCentury { // get the scanner class form the package(library)java util
	
	int year; //say it is variable

	public YearToCentury() // set method1
	{
	year = 0; // initialize variable
	}

	public YearToCentury(int year) // set method1-1(overloading)
	{
	this.year = year; // make input value to year's value  
	}

	public int calc_century() // set method
	{
	if(year % 100 == 0) // set condition of if method
	year = year / 100; // set year's value
	else
	{
	year = (year / 100) + 1; // set year's value
	}
	return year; // return value
	}

}
