package sistemas;

import models.Funcionario;
import models.Jogador;
import models.Tecnico;

public class Instanciamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario Roupeiro = new Funcionario("Roberto",1958, 3500);
		
		Jogador j1 = new Jogador("Yuri Alberto ",2001,1000000,"Atacante", 9, "Corinthians");
		
		Tecnico t1 = new Tecnico("Tite",1961,10000.0,"Libertadores e Mundial", "Corinthians");
		
		System.out.println(j1.getNome());
		System.out.println(j1.getAnoNascimento());
		System.out.println("--------------------");
		System.out.println(Roupeiro.getNome());
		System.out.println(Roupeiro.getSalario());
		System.out.println("--------------------");
		System.out.println(t1.getNome());
		System.out.println(t1.getTitulos());
		

	}

}
