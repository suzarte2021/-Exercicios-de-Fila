package Fila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	/*/Crie um programa em java para gerenciar uma playlist da sua festa em
casa de final de ano. Organize as músicas que deverão ser todas na ordem e
insiram em uma fila.

a) Inserir musica //ok
b) Consultar música
c) Remover música //ok
d) Sair.          
/*/
	public static void main(String[] args) {
		
  Queue<String>Filamusica = new LinkedList<String>();	
  
		// verificando se a fila esta vazia
		if ( Filamusica.isEmpty()) {
			System.out.println("Sua fila de  esta vazia");
		} 
		else {
			System.out.println("Sua fila tem músicas na playlist");
		}
  
  //Acionando músicas playlist na fila
  System.out.println("Adicionando músicas na playlist da festa: Fila");
  Filamusica.add("Gospel");
  Filamusica.offer("Rap");
  Filamusica.add("Forró");
  Filamusica.add("Samba");
  Filamusica.add("Pagode");
  Filamusica.add("Outro");

	//vamos ver o tamanho da fila de músicas
  System.out.println("verificando o tamanho da fila"); // Verificando o tamanho da fila
  System.out.println("O tamanho da fila é " + Filamusica.size());
		
		//Removendo músicas da fila
		System.out.println("Removendo músicas da fila");
		if (Filamusica.size() > 0) {
	    Filamusica.remove();
	    Filamusica.poll();
				}
       System.out.println("O tamanho da fila de músicas depois da remoção é " +  Filamusica.size());
				
	   System.out.println("A primeira música da fila é " +  Filamusica.peek());
	   
	   
				//vamos listar as músicas da fila
	 System.out.println("As músicas que ainda estão na fila são: ");
	 Iterator<String> it =  Filamusica.iterator();
			    while (it.hasNext()) {
			    	System.out.println(it.next());
			    	
			    
	
	
	}
			
	}
	
}
	


	
	
	
	
	
	

