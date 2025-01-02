package Main;
import Model.Usuario;
import Model.Curso;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario teste = new Usuario("Pedro", "123456");
		System.out.println(teste);
		Curso teste2 = new Curso("12345", "Ciência da Computação", "Ciências Exatas");
		System.out.println(teste2);
	}

}
