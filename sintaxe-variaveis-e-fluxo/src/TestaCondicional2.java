
public class TestaCondicional2 {
	
	public static void main(String[] args) {		
		System.out.println("Testando condicionais:");
		
		int idade = 16;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if(idade>= 18 || acompanhado) {
			System.out.println("Voce pode entrar!");
		}else {
			System.out.println("Voce nao pode entrar!");				
		}
		
	}
}
