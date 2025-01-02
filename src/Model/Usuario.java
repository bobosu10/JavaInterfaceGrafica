package Model;

public class Usuario {
	private String nomeUsuario;
	private String senha;
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Usuario(String nU, String s) {
		this.nomeUsuario = nU;
		this.senha = s;
	}
	
	public String toString() {
		return ("\nUsuário: " + this.nomeUsuario +
				"\nSenha: " + this.senha);
	}
	
	
	
}
