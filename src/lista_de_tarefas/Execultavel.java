package lista_de_tarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execultavel {
	public static void main(String [] args) {
			
			// Declaração de variáveis
			int opTarefa;
			String adTarefa;
			
			// Instanciando Classe Tarefas, Scanner 
			Tarefas tarefas = new Tarefas();	
			Scanner scanner = new Scanner(System.in);
			
			do {
				// Apresentando opções aos usuários 
				System.out.println("---------------- Lista de Tarefas ----------------");
				System.out.println("Selecione a opção abaixo: ");
				System.out.println("0. Excluir tarefas");
				System.out.println("1. Adicionar tarefa ");
				System.out.println("2. Listar tarefas ");
				System.out.println("3. Modificar tarefas");
				System.out.println("4. Excluir tarefas");
				
				// Pegando opções escolhidas pelo usuario 
				opTarefa = scanner.nextInt();
				
				
				if (opTarefa == 1) {
					tarefas.adicionarTarefas();
					tarefas.listarTarefas();
				}else if (opTarefa == 2) {
					tarefas.listarTarefas();
				}
			
			}while(opTarefa != 0);
			
		}
	}
