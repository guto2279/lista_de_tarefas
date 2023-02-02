package lista_de_tarefas;
import java.util.ArrayList;
import java.util.Iterator;
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
		int i=0;
		int cont = 1;
		int f = listaTarefas.size();
		do {
			i++;
			for (String tarefas: listaTarefas) {
				System.out.println(cont + " " +tarefas);
			}
			cont +=1;
			
		} while (i < f);	
		}

	
			

	
	public void modificarTarefas(){
		int posTarefa;
		String novaTarefa;
		
		System.out.println("Digite a posição da tarefa que deseja modificar: ");
		posTarefa = scanner.nextInt();
		System.out.println("Digite a nova tarefa: ");
		novaTarefa = scanner.nextLine();
		getListaTarefas().add(posTarefa - 1, novaTarefa);
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
