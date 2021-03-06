package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Alternativa;
import Models.Pergunta;

public class App {

	public static void main(String[] args) throws Exception {

		Scanner entrada = new Scanner(System.in);

		String menu;

		boolean errado = true;

		// Do para repetir o jogo ate a opcao de sair
		do {

			System.out.println(" -- MENU -- ");
			//
			System.out.println("<1> Instrucoes");
			//
			System.out.println("<2> Jogar");
			//
			System.out.println("<3> Creditos");
			//
			System.out.println("<4> Sair");

			menu = entrada.next();

			// Switch que verifica qual a opcao selecionada pelo usuario
			switch (menu) {

				case "1":
					System.out.println("Mecanismo e introducao do jogo: "
							+ "O jogo consiste em acerta perguntas, com cada acerto voce ganha pecas do robo. \n"
							+ "Seu objetivo e salvar a humanidade do controle dos Robos e vencer a CPU mae. \n"
							+ "Serao 5 perguntas voltadas aos componentes do PC, para montagem do robo. \r\n"
							+ "Cada pergunta respondida errada nesta fase, voce perdera o maximo de vida disponivel. \n"
							+ "E tera perguntas para enfrentar os inimigos.\r\n"
							+ "Cada resposta errada sera como um dano que o inimigo ira te dar. \n \n"

							+ "Niveis de dificuldades; \n"

							+ "- Facil - Perguntas faceis, perdendo 1 vida; \n"

							+ "- Medio - Perguntas medias, perdendo 1 vida; \n"

							+ "- Dificil - Perguntas dificeis, perdendo 2 vidas.");
					break;

				case "2":
					Jogar();
					break;

				case "3":
					System.out.println("SENAC:  \n\n"
							+ "Cleyton Silva \n"
							+ "Felipe Maia \n"
							+ "Felipe Santos \n"
							+ "Professor Eduardo Takeo \n"
							+ "Professor Andersson \n");
					break;

				case "4":
					System.out.println("Saiu.");
					errado = false;
					break;

				default:
					System.out.println("Resposta Invalida");
					break;

			}

		} while (errado);

	}

	// Funcao para executar o jogo
	public static void Jogar() throws Exception {
		Utilitarios.LimparTela();

		// Declaracao de variaveis
		String nome;
		int dificuldade;
		int vidas = 5;
		Scanner reader = new Scanner(System.in);
		String resposta = null;
		Alternativa alt = null;
		Pergunta pergunta = null;
		ArrayList<Pergunta> perguntasFase1 = Utilitarios.ObterPerguntasFase(1);
		ArrayList<Pergunta> perguntasFase2 = Utilitarios.ObterPerguntasFase(2);
		boolean valido = false;

		System.out.println("Digite o seu nome: ");
		nome = reader.nextLine();

		do {
			System.out.println("Selecione a dificuldade");
			System.out.println("1 - F??cil");
			System.out.println("2 - M??dio");
			System.out.println("3 - Dif??cil");
			dificuldade = reader.nextInt();

			if (dificuldade < 1 || dificuldade > 3) {
				System.out.println("Digite um valor valido");
			} else {
				valido = true;
			}

		} while (!valido);

		Utilitarios.LimparTela();

		// #region Exibicao da Historia

		Utilitarios.ExibirTexto("Seu recome??o se inicia em 2100, em um mundo devastado e controlado pelas \n"
				+ "maquinas que utilizam os seres humanos que restaram como fonte de energia e os rejeitados \n"
				+ "eram tratados como gados, tudo ocorreu depois de um grande acontecimento no ano de 2085 um forte \n"
				+ "impacto foi sentindo ao sul do Brasil, algo vindo do espa??o em uma caixa misteriosa selada com \n"
				+ "s??mbolos estranhos e uma forte luz que se emitia da mesma. \n \n");

		Utilitarios.LimparEAguardar();

		Utilitarios.ExibirTexto("Um senhor de certa idade, pegou o objeto n??o identificado e o levou para a casa, \n"
				+ "curioso com a caixa e com a luz que ela emitia pegou um p?? de cabra e tentou abri-la, com sucesso, \n"
				+ "foi a partir desse momento o caos come??ou na Terra. Micro maquinas se juntaram formando uma  criatura \n"
				+ "estranha que pulou em seu rosto e apoderou-se do seu c??rebro entrando em suas vias respirat??rias, disso \n"
				+ "surgiu o primeiro ser humano controlado pelas nano cpu-s eles utilizavam os corpos controlados para \n"
				+ "sua pr??pria reprodu????o, diante disso iniciou-se a domina????o mundial. \n \n");

		Utilitarios.LimparEAguardar();

		Utilitarios.ExibirTexto("Apesar disso haviam seres humanos que eram rejeitados e n??o podiam ser controlados \n"
				+ "por conta de seu tipo sangu??neo -O (Por conta do seu tipo raro de sangue e por sua aus??ncia de ant??genos), \n"
				+ "esses ser humanos eram usados como gados para reprodu????o da pr??pria popula????o, taxados como Divergentes. \n \n");

		Utilitarios.LimparEAguardar();

		Utilitarios.ExibirTexto("Voc??, isso mesmo voc?? que est?? lendo essa introdu????o, voc?? ?? um divergente,\n"
				+ "depois de uma grande fuga de uma das fazendas, por acidente voc?? encontra um dos GENESIS (s??o os Rob??s) \n"
				+ "defeituoso que foi descartado, com medo voc?? acerta o rob?? com um peda??o de madeira e o derruba, achando \n"
				+ "que o matou voc?? come??a a vasculhar o mesmo com a esperan??a de descobrir uma vulnerabilidade no Rob??, voc?? \n"
				+ "utiliza seus conhecimentos em Conceitos da Computa????o e come??a estudar as pe??as do Rob??. \n \n");

		Utilitarios.LimparEAguardar();

		Utilitarios.ExibirTexto("Descobrindo uma falha no sistema desse Rob??, voc?? se aproveita disso \n"
				+ "para reconstruir seu pr??prio Rob?? utilizando as pe??as do mesmo e as aprimorando. Com a ??ltima \n"
				+ "esperan??a da humanidade constru??da, voc?? parte em busca de libertar todos os humanos controlados \n"
				+ "pelas nano cpu-s. Por??m algo inacredit??vel te aguarda... \n \n");

		Utilitarios.LimparEAguardar();

		Utilitarios.ExibirTexto("Com a descoberta da falha dos Rob??s, voc?? se aproveita disso e parte em \n"
				+ "busca de mais pe??as tentando localizar mais rob??s defeituosos descartados. Nesse caminho voc?? \n"
				+ "ir?? enfrentar desafios e ir?? tentar supera-los, e cada falha ser?? problem??tico para seu rob??, \n"
				+ "mas n??o desista todos n??s precisaremos de voc??.2");

		Utilitarios.LimparEAguardar();

		// #endregion

		System.out.println("\n \n");

		// For que realiza a primeira fase de perguntas
		for (int i = 0; i < 5; i++) {
			pergunta = perguntasFase1.get(i);

			System.out.println((i + 1) + " - " + pergunta.pergunta);

			// For para exibir as alternativas
			for (int j = 0; j < pergunta.alternativas.size(); j++) {
				alt = pergunta.alternativas.get(j);

				System.out.println(alt.letra + ") " + alt.texto);
			}

			resposta = reader.next();

			Utilitarios.LimparTela();

			// If que verifica se a resposta digitada foi correta
			// Se nao diminui as vidas restantes
			if (pergunta.RespostaCorreta(resposta.toUpperCase())) {
				System.out.println("Parabens!!! Resposta Correta!! \n");
			} else {
				System.out.println("Ops!! Resposta Errada \n");
				vidas = vidas - dificuldade;

				// Valida se ainda possui vidas para continuar no jogo para
				// Se nao encerra o jogo
				if (!PossuiVidas(vidas)) {
					Utilitarios.LimparTela();

					Utilitarios.ExibirTexto(
							"N??o, seu Rob?? foi destru??do, corra, fuja, se esconda. Voc?? ?? nossa ??nica esperan??a tente novamente, mas n??o desista. \n \n");

					// System.in.read();

					return;
				}

				System.out.printf("Ainda restam %d vidas \n \n", vidas);
			}
		}

		System.out.println('-');

		Utilitarios.ExibirTexto("Ap??s esses desafios, voc?? finalmente consegue montar seu pr??prio Rob??, \n"
				+ "uma m??quina mort??fera que ir?? te ajudar na sua vingan??a assim por dizer. Por??m teste lhe aguardam \n"
				+ "para alcan??ar o n??cleo de todo esse caos no planeta terra, v?? divergente use sua intelig??ncia e enfrente seus inimigos. \n");

		Utilitarios.LimparEAguardar();

		System.out.println(" \n Fase 2 \n \n");

		Utilitarios
				.ExibirTexto("Agora com seu sua m??quina pronta voc?? parte em dire????o ao centro de controle do inimigo \n "
						+ "onde suas for??as est??o concentradas e onde voc?? dever?? enfrentrar seu primeiro inimigo na busca de seu objetivo");

		// For que realiza a segunda fase de perguntas
		for (int i = 1; i <= 3; i++) {
			pergunta = perguntasFase2.get(i);

			System.out.println(i + " - " + pergunta.pergunta);

			// For para exibir as alternativas
			for (int j = 0; j < pergunta.alternativas.size(); j++) {
				alt = pergunta.alternativas.get(j);

				System.out.println(alt.letra + ") " + alt.texto);
			}

			resposta = reader.next();

			Utilitarios.LimparTela();

			// If que verifica se a resposta digitada foi correta
			// Se nao diminui as vidas restantes
			if (pergunta.RespostaCorreta(resposta.toUpperCase())) {
				// Funcao que exibe a mensagem de vitoria de acordo com o inimigio enfrentado
				ExibirTextoFases(i, true);
			} else {
				System.out.println("Ops!! Resposta Errada \n");
				vidas = vidas - dificuldade;

				// Regressa o i para repetir a mesma pergunta
				i--;

				// Valida se ainda possui vidas para continuar no jogo para
				// Se nao encerra o jogo
				if (!PossuiVidas(vidas)) {
					Utilitarios.LimparTela();

					// Funcao que exibe a mensagem de vitoria de acordo com o inimigio enfrentado
					ExibirTextoFases(i, false);

					return;
				}

				System.out.printf("Ainda restam %d vidas \n \n", vidas);
			}
		}
	}

	public static boolean PossuiVidas(int vidas) {
		return vidas > 0;
	}

	public static void ExibirTextoFases(int fase, boolean correto) throws Exception {
		// Switch que determina qual a mensagem que ser?? exibida de acorod com a fase
		switch (fase) {
			case 1:
				if (correto) {
					Utilitarios.ExibirTexto("Bravo Divergente, falta pouco continue assim e logo alcan??ara seu objetivo. \n"
							+ "Seu rob?? est?? cada vez mais forte enfrente mais rob??s e pegue suas pe??as.");

				} else {
					Utilitarios.ExibirTexto("N??o, seu Rob?? foi destru??do, corra, fuja, se esconda. \n"
							+ "Voc?? ?? nossa ??nica esperan??a tente novamente, mas n??o desista.");
				}
				break;

			case 2:
				if (correto) {
					Utilitarios.ExibirTexto(
							"Ap??s uma ??rdua batalha, finalmente o guardi??o cai e todas suas pe??as come??am a entrar em curto circuito, afirmando sua derrota. \n"
									+ "Seu pr??ximo desafio o aguarda e est?? muito pr??ximo, continue divergente.");

				} else {
					Utilitarios.ExibirTexto("Seu Rob?? foi destru??do, mesmo que voc?? corra n??o ir?? conseguir fugir, \n"
							+ "n??o tem como fugir do guardi??o, n??o tem como se esconder dele. E nossa ??ltima esperan??a est?? perdida... \n"
							+ "Ou ser?? que n??o (Tente novamente) ...");
				}
				break;

			case 3:
				if (correto) {
					Utilitarios.ExibirTexto(
							"Voc?? cai de joelhos, perante o grande rob?? a sua frente, depois da long??nqua batalha voc?? ver um ??nico rob?? em p??, \n"
									+ "esse rob?? ?? a salva????o de toda humanidade. Voc?? come??a a gritar, um grito que ecoa em toda torre, o alivio se estende em todo seu corpo a liberta????o est?? pr??xima, \n"
									+ "finalmente voc?? pega o chip da m??quina m??e e usa para liberta todos os seres humanos que estavam na torre. Finalmente, todos est??o livres, voc?? que est?? no controle \n"
									+ "central e passa um aviso para todos os habitantes que estavam nas fazendas atrav??s dos rob??s. ???Voc??s est??o livres, irei desligar todos os rob??s, essa ?? nossa vit??ria.??? \n"
									+ "E ent??o todos os rob??s come??am a cair no ch??o e agora parece que tudo vai d?? certo, parece... \n \n \n"
									+ "FIM... (ser??) ...");

				} else {
					Utilitarios.ExibirTexto(
							"Voc?? cai de joelhos, perante o grande rob?? a sua frente, a condena????o para humanidade est?? pr??xima, "
									+ "a esperan??a est?? morta. N??o temos mais salva????o, a m??quina m??e ?? muito forte n??o tem como ven??a-la, voc?? ver o grande rob?? "
									+ "trucidar o seu rob?? em meros peda??os e voc?? sente que o seu fim ser?? o mesmo...");
				}
				break;
		}

		Utilitarios.LimparEAguardar();
	}
}
