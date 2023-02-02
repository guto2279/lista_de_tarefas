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
		System.out.print("Qual tarefa deseja adicionar? ");
		tarefa = scanner.next();
		listaTarefas.add(tarefa);
	}
	
	public void listarTarefas(){
		int cont = 1;
		for (int i = 0; i < listaTarefas.size(); i++) {
			System.out.println(cont + " - " +listaTarefas.get(i));
			cont +=1;
		} 
	}
	
	public void modificarTarefas(){
		int posTarefa;
		String novaTarefa;
		
		System.out.print("Digite a posição da tarefa que deseja modificar: ");
		posTarefa = scanner.nextInt();
		System.out.print("Digite a nova tarefa: ");
		novaTarefa = scanner.next();
		listaTarefas.add(posTarefa - 1, novaTarefa);
		listaTarefas.remove(posTarefa);
	}

	public void excluirTarefas(){
		int posTarefa;
		System.out.println("Digite o número da tarefa que deseja excluir");
		posTarefa = scanner.nextInt();
		listaTarefas.remove(posTarefa-1);
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
