package lista_de_tarefas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {
	
	Execultavel execultavel = new Execultavel();
	private List <String> listaTarefas = new ArrayList<String>();
	
	String tarefa;
	Scanner scanner = new Scanner (System.in);
	
	public void adicionarTarefas(){
		System.out.println("Qual tarefa deseja adicionar? ");
		tarefa = scanner.nextLine();
		listaTarefas.add(tarefa);
	}
	
	public void listarTarefas(){
		for (String tarefas : this.listaTarefas) {
			System.out.println(tarefas);
		}
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public List<String> getListaTarefas() {
		return listaTarefas;
	}

	public void setListaTarefas(List<String> listaTarefas) {
		this.listaTarefas = listaTarefas;
	}
	
	
	
	
	
}
