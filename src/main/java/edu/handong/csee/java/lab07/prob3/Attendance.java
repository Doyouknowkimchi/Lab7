package edu.handong.csee.java.lab07.prob3; // name of package
import java.util.*; // get the class form the package java util

public class Attendance //class name
{ 
private String name = ""; //set variable
private int year = 0; //set variable
private String student_id = ""; //set variable
private int missed = 0;//set variable

//Constructors	
public Attendance() // name of method
{
this.name = "Null"; //set variable
this.year = 0; //set variable
this.student_id = "Null"; //set variable
this.missed = 0; //set variable
}

public Attendance(String name, int year, String student_id, int missed) //name of method(overloading)
{
this.name = name; //set variable
this.year = year; //set variable
this.student_id = student_id; //set variable
this.missed = missed; //set variable
}

//Getters
public String get_name() //method name
{
return name;	// return value
}
public int get_year() //method name
{
return year;	//return value
}
public int get_missed() //method name
{
return missed; //return value
}

//Setters
public void set_name(String name) //name of method
{
this.name = name; //return value
}
public void set_year(int year) //name of method
{
this.year = year; //return value
}
public void set_id(String student_id) // name of method
{
this.student_id = student_id;	//return value
}
public void set_missed(int missed) //name of method
{
this.missed = missed;	//return value
}
}