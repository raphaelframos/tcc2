package model;

public class Inputs {
	
	private String nomeAluno1;
	private String nomeAluno2 = "";
	private String tituloDoTrabalho;
	private String data;
	private String nomeOrientador;
	private String prof1;
	private String prof2;
	private String dataCompleta;
	
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
	
	public Inputs addProf2(String prof) {
		setProf2(prof);
		return this;
	}
	
	public Inputs addProf1(String prof) {
		setProf1(prof);
		return this;
	}
	
	public Inputs addDataCompleta(String data) {
		setDataCompleta(data);
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

	public String getProf1() {
		return prof1;
	}

	public void setProf1(String prof1) {
		this.prof1 = prof1;
	}

	public String getProf2() {
		return prof2;
	}

	public void setProf2(String prof2) {
		this.prof2 = prof2;
	}

	public String getDataCompleta() {
		return dataCompleta;
	}

	public void setDataCompleta(String dataCompleta) {
		this.dataCompleta = dataCompleta;
	}

	public boolean possuiDoisAlunos() {
		return !getNomeAluno1().isEmpty() && !getNomeAluno2().isEmpty();
	}
	
	

}
