package Fila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	/*/Crie um programa em java para gerenciar uma playlist da sua festa em
casa de final de ano. Organize as m�sicas que dever�o ser todas na ordem e
insiram em uma fila.

a) Inserir musica //ok
b) Consultar m�sica
c) Remover m�sica //ok
d) Sair.          
/*/
	public static void main(String[] args) {
		
  Queue<String>Filamusica = new LinkedList<String>();	
  
		// verificando se a fila esta vazia
		if ( Filamusica.isEmpty()) {
			System.out.println("Sua fila de  esta vazia");
		} 
		else {
			System.out.println("Sua fila tem m�sicas na playlist");
		}
  
  //Acionando m�sicas playlist na fila
  System.out.println("Adicionando m�sicas na playlist da festa: Fila");
  Filamusica.add("Gospel");
  Filamusica.offer("Rap");
  Filamusica.add("Forr�");
  Filamusica.add("Samba");
  Filamusica.add("Pagode");
  Filamusica.add("Outro");

	//vamos ver o tamanho da fila de m�sicas
  System.out.println("verificando o tamanho da fila"); // Verificando o tamanho da fila
  System.out.println("O tamanho da fila � " + Filamusica.size());
		
		//Removendo m�sicas da fila
		System.out.println("Removendo m�sicas da fila");
		if (Filamusica.size() > 0) {
	    Filamusica.remove();
	    Filamusica.poll();
				}
       System.out.println("O tamanho da fila de m�sicas depois da remo��o � " +  Filamusica.size());
				
	   System.out.println("A primeira m�sica da fila � " +  Filamusica.peek());
	   
	   
				//vamos listar as m�sicas da fila
	 System.out.println("As m�sicas que ainda est�o na fila s�o: ");
	 Iterator<String> it =  Filamusica.iterator();
			    while (it.hasNext()) {
			    	System.out.println(it.next());
			    	
			    
	
	
	}
			
	}
	
}
	


	
	
	
	
	
	

