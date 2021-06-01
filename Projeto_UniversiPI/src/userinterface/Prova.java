package userinterface;

import java.util.Scanner;

import core.QuestaoComDica;
import core.QuestaoMultiplaEscolha;
import core.QuestaoSimples;

public class Prova {

	public static void main(String[] args) {		
		Scanner teclado = new Scanner(System.in);
		String resposta;
		QuestaoSimples questoes[]; // declarei um VETOR de quest�es
		
		questoes = new QuestaoSimples[5];  // aqui eu defino que o vetor quest�es tem exatamente 5 posi��es
		
		questoes[0] = new QuestaoComDica("Qual a linguagem do curso?","JAVA","Come�a com JA e termina com VA");
		questoes[1] = new QuestaoSimples("Quem descobriu o Brasil?", "Pedrao Cabral");
		questoes[2] = new QuestaoMultiplaEscolha("Quanto vale 2+2","4","dois","2","cuatro","4");
		questoes[3] = new QuestaoComDica("Qual a cor do cavalo Branco do Napole�o?","marrom","N�o pense na cor");
		questoes[4] = new QuestaoSimples("Qual a formula da �gua", "H2O");
		
		for (int pos=0 ; pos < 5 ; pos++) {
			System.out.println(questoes[pos].aplicarQuestao());
			resposta = teclado.nextLine();
			if (questoes[pos].corrigir(resposta)) {
				System.out.println("Parab�ns vc acertou!!!");
			}
			else {
				System.out.println("Errooooooouuuuu (imagine Fausto Silva dizendo...)");
			}
		}
	    
		
		teclado.close();
	}
}
