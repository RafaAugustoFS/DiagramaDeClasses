package models;

public class Funcionario {
	private String nome;
	private int anoNascimento;
	private double salario;

	public Funcionario(String nome, int anoNascimento, double salario) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void trabalhar() {
		System.out.println("Trabalhando ;)");

	}

	public void solicitarFerias() {
		System.out.println("Quero Férias :(( ");
	}
}
