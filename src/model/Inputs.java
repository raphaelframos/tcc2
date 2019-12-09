package model;

public class Inputs {
	
	private String nomeAluno1;
	private String nomeAluno2 = "";
	private String tituloDoTrabalho;
	private String data;
	private String nomeOrientador;
	
	public Inputs(String titulo, String data, String orientador, String aluno) {
		setTituloDoTrabalho(titulo);
		setData(data);
		setNomeOrientador(orientador);
		setNomeAluno1(aluno);
	}
	
	public Inputs() {}
	
	public Inputs addTitulo(String titulo) {
		setTituloDoTrabalho(titulo);
		return this;
	}
	
	public Inputs addOrientador(String orientador) {
		setNomeOrientador(orientador);
		return this;
	}
	
	public Inputs addData(String data) {
		setData(data);
		return this;
	}
	
	public Inputs addAluno1(String aluno) {
		setNomeAluno1(aluno);
		return this;
	}
	
	public Inputs addAluno2(String aluno) {
		setNomeAluno2(aluno);
		return this;
	}
	
	public String getNomeAluno1() {
		return nomeAluno1;
	}
	public void setNomeAluno1(String nomeAluno1) {
		this.nomeAluno1 = nomeAluno1;
	}
	public String getNomeAluno2() {
		return nomeAluno2;
	}
	public void setNomeAluno2(String nomeAluno2) {
		this.nomeAluno2 = nomeAluno2;
	}
	public String getTituloDoTrabalho() {
		return tituloDoTrabalho;
	}
	public void setTituloDoTrabalho(String tituloDoTrabalho) {
		this.tituloDoTrabalho = tituloDoTrabalho;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNomeOrientador() {
		return nomeOrientador;
	}
	public void setNomeOrientador(String nomeOrientador) {
		this.nomeOrientador = nomeOrientador;
	}

	public static Inputs newInstance() {
		return new Inputs();
	}
	
	

}
