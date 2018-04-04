package edu.handong.csee.java.lab07.prob2; //name of the package
/**
 * 
 * this class can set chicken name,price,stars
 *
 */
public class Chicken_main //name of the class
{

public static void main(String[] args) // set main method
{
		// TODO Auto-generated method stub
Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5); // setting menu
Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5); // setting menu
Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1); // setting menu

menu1.set_stars(3); //set menu1's star
menu2.set_stars(4); //set menu2's star
menu3.set_stars(1); //set menu3's star

System.out.println(menu1.get_name() + "'s raring is " + menu1.get_stars()); //send output to screen
System.out.println(menu2.get_name() + "'s raring is " + menu2.get_stars()); //send output to screen
System.out.println(menu3.get_name() + "'s raring is " + menu3.get_stars()); //send output to screen
	}
}
