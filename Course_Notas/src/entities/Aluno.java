package entities;

public class Aluno {	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public void avaliacao() {
		if (notaFinal() >= 60.0) {
			System.out.printf("Nota Final = %.2f%n", notaFinal());
			System.out.println("APROVADO");
		}
	}
	
	
}
