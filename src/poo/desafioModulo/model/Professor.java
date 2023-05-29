package poo.desafioModulo.model;


public class Professor {
	private int counterId;	
	private String nome;
	private String cpf;
	private Departamento departamento;

	public Professor() {

	}

	public Professor(String nome, String cpf, Departamento departamento) {
		this.nome = nome;
		this.cpf = cpf;
		this.departamento = departamento;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartament(Departamento departament) {
		this.departamento = departament;
	}

	@Override
	public String toString() {
		return "Professor ↴" +
			   "\n → Nome: " + getNome() + 
			   "\n → Cpf: " + getCpf() + 
			   getDepartamento();
	}

	public void setCounterId(int counterId) {
		this.counterId = counterId;
	}
	
	public int getCounterId() {
		return counterId;
	}

}
