package main;

import javax.swing.JOptionPane;

import entities.Escalacao;
import entities.Jogador;
import entities.Time;

public class EscalacaoTest {

	public static void main(String[] args) {

		Time time = new Time();
		Escalacao escalacao = new Escalacao();

		Jogador jogadores= new Jogador();

		Jogador jog1 = new Jogador();
		Jogador jog2 = new Jogador();
		Jogador jog3 = new Jogador();
		Jogador jog4 = new Jogador();
		Jogador jog5 = new Jogador();

		time.setNome(JOptionPane.showInputDialog("Digite o nome do time:"));
		escalacao.setData(JOptionPane.showInputDialog("Digite a data do jogo:"));

		jog1.setNome(JOptionPane.showInputDialog("Digite o nome do primeiro jogador:"));
		jog2.setNome(JOptionPane.showInputDialog("Digite o nome do segundo jogador:"));
		jog3.setNome(JOptionPane.showInputDialog("Digite o nome do terceiro jogador:"));
		jog4.setNome(JOptionPane.showInputDialog("Digite o nome do quarto jogador:"));
		jog5.setNome(JOptionPane.showInputDialog("Digite o nome do quinto jogador:"));

		System.out.println(escalacao.getImprimir(jogadores));

		System.out.println("" + time.getNome());
		System.out.println("Jogará no dia: " + escalacao.getData());
		
		System.out.println("Jogadores:");
		System.out.println("- " + jog1.getNome());
		System.out.println("- " + jog2.getNome());
		System.out.println("- " + jog3.getNome());
		System.out.println("- " + jog4.getNome());
		System.out.println("- " + jog5.getNome());
	}
}
