package poo.desafioModulo.cli;

import java.util.Scanner;


public class Appv2 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
			allocationApp();

		}

		public static void allocationApp() {
			System.out.println("-----------------------------------------------");
			System.out.println("---------Wellcome To The Allocation APP -------");
			System.out.println("-----------------------------------------------");
			System.out.println("******** Selec which operation you want *******");
			System.out.println("-----------------------------------------------");
			System.out.println("|         Option 1 - Register                  |");
			System.out.println("|         Option 2 - List records              |");
			System.out.println("|         Option 3 - Exit                      |");
			System.out.println("");
			System.out.print("Choice: ");

			int choice = input.nextInt();

			switch (choice) {
			case 1: {
				register();
			}
				break;

			case 2: {
				showRegister();
			}
				break;

			case 3: {
				System.out.println("------------- Programa Encerrado ---------- ");
				System.exit(0);
			}
			
			default:
				System.out.println("Invalid Option, please try again...");
				allocationApp();
				break;

			}

		}
		
		public static void register() {
			
			System.out.println("-----------------------------------------------");
			System.out.println("******** Selec which operation you want *******");
			System.out.println("-----------------------------------------------");
			System.out.println("|   Option 1 - Register Departament            |");
			System.out.println("|   Option 2 - Register Teacher                |");
			System.out.println("|   Option 3 - Register Coordenator            |");
			System.out.println("|   Option 4 - Register Course                 |");
			System.out.println("|   Option 5 - Register Alocation              |");
			System.out.println("|   Option 6 - Back To Menu                    |");
			System.out.println("");
			System.out.print("Choice: ");
			
			int choice = input.nextInt();

			switch (choice) {
			case 1: {
				register();

			}break;

			case 2: {

			}break;
			
			case 3: {

			}break;
			
			case 4: {

			}break;
			
			case 5: {

			}break;

			case 6: {
				allocationApp();
			}break;
			
			default:
				System.out.println("Invalid Option, please try again...");
				register();
				break;

			}

		}

		public static void showRegister() {
			


			System.out.println("-----------------------------------------------");
			System.out.println("******** Selec which operation you want *******");
			System.out.println("-----------------------------------------------");
			System.out.println("|   Option 1 - Exhibit Departaments Registred  |");
			System.out.println("|   Option 2 - Exhibit Teachers Registred      |");
			System.out.println("|   Option 3 - Exhibit Coordenators Registred  |");
			System.out.println("|   Option 4 - Exhibit Courses Registred       |");
			System.out.println("|   Option 5 - Exhibit Alocations Registred    |");
			System.out.println("|   Option 6 - Back To Menu                    |");
			System.out.println("");
			System.out.print("Choice: ");

			int choice = input.nextInt();

			switch (choice) {
			case 1: {
				showRegister();

			}break;

			case 2: {

			}break;
			
			case 3: {

			}break;
			
			case 4: {

			}break;
			
			case 5: {

			}break;

			case 6: {
				allocationApp();
			}break;
			
			default:
				System.out.println("Invalid Option, please try again...");
				showRegister();
				break;
			}

		}

}
