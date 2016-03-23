package model;

public class Voce {
	private String nome;
	private String mail;
	private String telefono;
	
	public Voce(String nome, String mail, String telefono) {
		super();
		this.nome = nome;
		this.mail = mail;
		this.telefono = telefono;
	}

	public String getNome() {
		return nome;
	}

	public String getMail() {
		return mail;
	}

	public String getTelefono() {
		return telefono;
	}
	

}
