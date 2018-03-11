/* Name: Nicholas Keen
 * Course: Computer Science - CIS I
 * Section: 003
 * Assignment: 8
*/ 
import java.util.*;

//Asks for a seven digit student ID
//and checks to see if the ID entered
//is valid.
public class CheckDigit {

    //Sets up a scanner for user input
    //and calls the studentID method.
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      studentID(sc);
    }
    
    //Prompts the user for input, reads
    //said input and then calculates each
    //digit in the ID, then displays the 
    //whole ID, calculates the check
    //integer and then displays valid/invalid
    //depending on if the check and seventh 
    //digits are equal.
    public static void studentID(Scanner num) {
	System.out.print("Enter your student ID (7 digits): ");
	int id = num.nextInt();
	int first = (id - id % 1000000) / 1000000;
	int second = ((id - id % 100000) / 100000) - first * 10;
	int third = ((id - id % 10000) / 10000) - 
		    (first * 100 + second * 10);
	int fourth = ((id - id % 1000) / 1000) - 
		     (first * 1000 + second * 100 + third * 10);
	int fifth = ((id - id % 100) / 100) - 
		    (first * 10000 + second * 1000 + third * 100 + 
		    fourth * 10);
	int sixth = ((id - id % 10) / 10) - (first * 100000 + 
		    second * 10000 + third * 1000 + fourth * 100 +
		    fifth * 10);
	int seventh = (id - id % 1)- (first * 1000000 + 
		      second * 100000 + third * 10000 + 
		      fourth * 1000 + fifth * 100 + sixth * 10);
		      System.out.println("ID entered = " + id);
	int check = (1 *(first) + 2 *(second) + 3 *(third) + 
		    4 *(fourth) + 5 *(fifth) + 6 *(sixth)) % 10;
	System.out.println("check digit calculated = " + check);
	if(check == seventh) {
	    System.out.println("Valid ID");
	}else {
	    System.out.println("Invalid ID");
	}	
    }
}