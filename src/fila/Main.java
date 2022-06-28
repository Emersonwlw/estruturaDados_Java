package fila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fila<String> minhaFila = new fila<>();
		
		minhaFila.enqueue("Primeiro");
		minhaFila.enqueue("Segundo");
		minhaFila.enqueue("Terceiro");
		minhaFila.enqueue("Quarto");
		
		System.out.println(minhaFila);

		System.out.println(minhaFila.dequeue());
		
		System.out.println(minhaFila);
		
		minhaFila.enqueue("Ultimo");
		
		System.out.println(minhaFila);
		
		

		System.out.println(minhaFila.first());
		
		System.out.println(minhaFila);
		
	}

}
