package lp;

import static java.lang.System.out;

import java.util.Scanner;

public class AverageCalculate {

	public static void main(String[] args) {
			//Keyboard Capture
			Scanner keyboard = new Scanner(System.in);
			
			// Header 
			out.println("------- Average exams for the year -----");
			
			//Input data
			out.print("Enter ther student`s name: ");
			String name = keyboard.next();
			out.print("Enter the 1° exam result: ");
			double exam1 = keyboard.nextDouble();
			out.print("Enter the 2° exam result: ");
			double exam2 = keyboard.nextDouble();
			out.print("Enter the 3° exam result: ");
			double exam3 = keyboard.nextDouble();
			out.print("Enter the 4° exam result: ");
			double exam4 = keyboard.nextDouble();
			out.println("----------------------------");
			
			//Method for Calculate Average
			double average = (exam1 + exam2 + exam3 + exam4)/ 4;
		
			//Output data
			out.printf("Student %s`s exam average was: %.2f\n", name , average);
			keyboard.close();
			out.println("-----------END-------------");
		}

	}

