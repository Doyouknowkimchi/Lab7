package edu.handong.csee.java.lab07.prob3; // package name
import java.util.Random; // get the random class form the package java util

/**
 * 
 * this program can set student's information
 *
 */
public class Attendance_main //name of class
{

public static void main(String[] args) //set main method
{ 
Attendance s_1 = new Attendance(); //readies the program
Attendance s_2 = new Attendance(); //readies the program
Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0); //readies the program
Attendance s_4 = new Attendance("Martha", 2, "21733444", 0); //readies the program

s_1.set_name("Jess"); s_1.set_year(4); s_1.set_id("21400999"); s_1.set_missed(0); // set s_1's information
s_2.set_name("kent"); s_2.set_year(2); s_2.set_id("21700111"); s_2.set_missed(0); // set s_2's information

Random randomGenerator = new Random(); //readies the program

s_1.set_missed(randomGenerator.nextInt(10)); // s_1 get input
s_2.set_missed(randomGenerator.nextInt(10)); // s_2 get input
s_3.set_missed(randomGenerator.nextInt(10)); // s_3 get input
s_4.set_missed(randomGenerator.nextInt(10)); // s_4 get input

if(s_1.get_missed() > 6) // set condition of if method
{
System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course"); // send output to screen
System.out.println(s_1.get_name() + " - number of absence: "+ s_1.get_missed()); // send output to screen
}
else // not if case
System.out.println("We'll see about grade" + s_1.get_name()); // send output to screen
if(s_2.get_missed() > 6) // set condition of if method
{
System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course"); // send output to screen
System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed()); // send output to screen
}
else // not if case
System.out.println("We'll see about the grade, " + s_2.get_name()); // send output to screen
if(s_3.get_missed() > 6) // set condition of if method
{
System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course"); // send output to screen
System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed()); // send output to screen
}
else // not if case
System.out.println("We'll see about the grade, " + s_3.get_name()); // send output to screen
if(s_4.get_missed() > 6) // set condition of if method
{
System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course"); // send output to screen
System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed()); // send output to screen
}
else // not if case
System.out.println("We'll see about the grade, " + s_4.get_name()); // send output to screen
}
}
