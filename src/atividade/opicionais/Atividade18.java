package atividade.opicionais;

import java.util.Scanner;

public class Atividade18 {

	public static void main(String[] args) {
		/// Active Keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//Input Data
		System.out.print("Enter the sizer of file (in MB): ");
		double fileMb = keyboard.nextInt();
		
		System.out.print("Enter the value of internet link speed (in MBps): ");
		double linkInternet = keyboard.nextInt();
		//Structure logical 
				
		double speedDownload =  fileMb / (linkInternet / 8);
		
		//Output Data
		System.out.printf("Time to download the file was: %.0f Seconds",speedDownload);
		
		keyboard.close();

	}

}
