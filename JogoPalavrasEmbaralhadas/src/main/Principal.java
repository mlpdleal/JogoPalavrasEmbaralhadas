package main;

import java.util.Scanner;

import regrasJogo.FabricaMecanicaDoJogo;
import regrasJogo.Jogo;
import regrasJogo.MecanicaDoJogo;

public class Principal {

	public static void main(String[] args) {
		FabricaMecanicaDoJogo fabricaJogo = new FabricaMecanicaDoJogo();
		Scanner input = new Scanner(System.in);
		
		System.out.println("--------------Jogo das Palavras Embaralhadas --------------------");
		System.out.println("Dificuldades: ");
		System.out.println("1 - Fácil");
		System.out.println("2 - Normal");
		System.out.println("3 - Difícil");
		System.out.println("Obs: Para qualquer tecla diferente clicada será selecionado a dificuldade Normal");
		System.out.println("Informe a dificuldade: ");
		int opcao = input.nextInt();
		MecanicaDoJogo jogo = (Jogo) fabricaJogo.selecionarDificuldade(opcao);
		System.out.println("Iniciando o Jogo...");

		do {
			Scanner inputPalavra = new Scanner(System.in);
			System.out.println("A palavra embaralhada é: " + jogo.mostraPalavra());
			System.out.println("Digite a palavra correta: ");
			String palavra = inputPalavra.nextLine();
			jogo.verificaResposta(palavra);
			System.out.println("Você ainda possui " + jogo.getVidas() + " vidas");
			System.out.println("Faltam " + jogo.getRodadas() + " perguntas");
		} while (jogo.encerraJogo());
		
		if(jogo.getVidas() == 0) {
			System.out.println("Suas vidas acabaram! Você perdeu o jogo! Tente novamente!");
		} else {
			System.out.println("Você terminou o Jogo! Parabens!");
		}
		
		System.out.println("Sua pontuação total foi : " + jogo.getPontuacao());
	}

}
