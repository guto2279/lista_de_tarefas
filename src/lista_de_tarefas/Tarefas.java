package lista_de_tarefas;
import java.util.Scanner;

public class Tarefas {
	
	
	String tarefa;
	Scanner scanner = new Scanner (System.in);
	
	public String adicionarTarefas(){
		System.out.println("Qual tarefa deseja adicionar? ");
		tarefa = scanner.nextLine();
		return tarefa;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
	
	
	
}
