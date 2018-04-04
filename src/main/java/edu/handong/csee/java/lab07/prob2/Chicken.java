package edu.handong.csee.java.lab07.prob2;

public class Chicken //name of class
{
private String name; //set variable
private double price;//set variable
private int stars;//set variable

public Chicken() // name of method
{
this.name = ""; // set
this.price = 0.0;// 
this.stars = 0;// 
}

public Chicken(String name, double price, int stars)//name of method(overloading)
{
this.name = name; //make input value to name's value  
this.price = price; // make input value to price's value  
this.stars = stars; // make input value to star's value  
}

public String get_name() // name of method
{
return this.name;  // return value
}

public double get_price() // name of method(overloading)
{
return this.price; // return value
}

public int get_stars() //name of method
{
return this.stars; // return value
}

public void set_name(String name) //name of method
{
this.name = name; // make input value to name's value
}

public void set_price(double price) //name of method
{
this.price = price; // make input value to price's value
}

public void set_stars(int stars) //name of method
{
this.stars = stars;	// make input value to star's value
}

}
