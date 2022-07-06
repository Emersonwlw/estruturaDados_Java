package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Carro> listCarro = new ArrayList<>();
		
		listCarro.add(new Carro("Ford"));
		listCarro.add(new Carro("Chevrolet"));
		listCarro.add(new Carro("Fiat"));
		listCarro.add(new Carro("Peugeot"));
		
		System.out.println(listCarro.contains(new Carro("Ford")));
		
		System.out.println(listCarro.get(2));
		
		System.out.println(listCarro.indexOf(new Carro("Fiat")));
		
		System.out.println(listCarro.remove(2));
		
		System.out.println(listCarro);
	}

}
