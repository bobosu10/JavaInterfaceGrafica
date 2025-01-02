package Model;

public class Curso {
	private String codigo;
	private String curso;
	private String area;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public Curso(String cod, String curso, String a) {
		this.codigo = cod;
		this.curso = curso;
		this.area = a;
	}
	
	public String toString() {
		return ("\nCódigo: " + this.codigo +
				"\nCurso: " + this.curso +
				"\nÁrea: " + this.area);
	}
}
