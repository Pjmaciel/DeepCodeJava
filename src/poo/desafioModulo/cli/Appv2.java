package poo.desafioModulo.cli;

import static java.lang.System.out;

import java.util.Scanner;

import poo.desafioModulo.listas.Alocacoes;
import poo.desafioModulo.listas.Cursos;
import poo.desafioModulo.listas.Departamentos;
import poo.desafioModulo.listas.Professores;
import poo.desafioModulo.model.Alocacao;
import poo.desafioModulo.model.Professor;

public class Appv2 {
	static Scanner input = new Scanner(System.in);
	private static Departamentos listaDepartamentos = new Departamentos();
	private static Professores listaProfessores = new Professores();
	private static Cursos listaCursos = new Cursos();
	private static Alocacoes listaAlocacoes = new Alocacoes();

	public static void main(String[] args) {
		try {
			allocationApp();
		} finally {
			input.close();
		}
		
		
	}

	public static void allocationApp() {//menu principal 
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

	public static void register() {//tela de registro

		System.out.println("-----------------------------------------------");
		System.out.println("******** Selec which operation you want *******");
		System.out.println("-----------------------------------------------");
		System.out.println("|   Option 1 - Register Departament            |");
		System.out.println("|   Option 2 - Register Teacher                |");
		System.out.println("|   Option 3 - Register course                 |");
		System.out.println("|   Option 4 - Register Alocation              |");
		System.out.println("|   Option 5 - Back To Menu                    |");
		System.out.println("");
		System.out.print("Choice: ");

		int choice = input.nextInt();

		switch (choice) {
		case 1: {
			listaDepartamentos.addDepartamentoFromUserInput(input);
			register();

		}
			break;

		case 2: {
//				listaProfessores.addProfessorFromUserInput(input);
			out.print("\nEnter the Professor`s name: ");
			String name = input.next();
			out.print("\nEnter the Professor`s CPF: ");
			String cpf = input.next();

			listaDepartamentos.listarDepartamentos();

			out.print("\nEnter the Departaments ID: ");
			int id = input.nextInt();

			Professor newProfessor = new Professor(name, 
					                               cpf, 
					                               listaDepartamentos.getDepartamentosByID(id));
			listaProfessores.addProfessor(newProfessor);

			System.out.println("Professor added Successfully");

			listaProfessores.listarProfessores();
			register();

		}
			break;

		case 3: {
//				listaCursos.addDepartamentoFromUserInput(input);
			listaCursos.addDepartamentoFromUserInput(input);
			register();

		}
			break;

		case 4: {
			listaProfessores.listarProfessores();
			out.print("\n Enter the Professor`s ID: ");
			int idCurso = input.nextInt();

			listaCursos.listarCursos();

			out.print("\n Enter the Course`s ID: ");
			int idProfessor = input.nextInt();
			out.print("\n Enter the day of weak for alocation: ");
			String diaDaSemana = input.next();
			out.print("\n Enter the hours for alocation: ");
			String hora = input.next();

			Alocacao newAlocacao = new Alocacao(listaProfessores.getProfessorByID(idProfessor),
					                            listaCursos.getDepartamentosByID(idCurso),
					                            diaDaSemana, 
					                            hora);
			listaAlocacoes.addAlocacao(newAlocacao);

			System.out.println("Alocation added Successfully");

			listaAlocacoes.listarAlocacoes();

			register();

		}
			break;

		case 5: {
			allocationApp();
		}
			break;

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
		System.out.println("|   Option 3 - Exhibit Courses Registred       |");
		System.out.println("|   Option 4 - Exhibit Alocations Registred    |");
		System.out.println("|   Option 5 - Back To Menu                    |");
		System.out.println("");
		System.out.print("Choice: ");

		int choice = input.nextInt();

		switch (choice) {
		case 1: {
			listaDepartamentos.listarDepartamentos();
			showRegister();

		}
			break;

		case 2: {
			listaProfessores.listarProfessores();
			showRegister();

		}
			break;

		case 3: {
			listaCursos.listarCursos();
			showRegister();

		}
			break;

		case 4: {
			listaAlocacoes.listarAlocacoes();
			showRegister();

		}
			break;

		case 5: {
			allocationApp();
		}
			break;

		default:
			System.out.println("Invalid Option, please try again...");
			showRegister();
			break;
		}

	}

}
