package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Carro> hasSetCarros = new HashSet<>();
		
		hasSetCarros.add(new Carro("Ford"));
		hasSetCarros.add(new Carro("Fiat"));
		hasSetCarros.add(new Carro("Chevrolet"));
		hasSetCarros.add(new Carro("Peugeot"));
		hasSetCarros.add(new Carro("Zip"));
		hasSetCarros.add(new Carro("Alfa Romeo"));
		
		
		System.out.println(hasSetCarros);
		
		Set<Carro> treSetCarro = new TreeSet<>();
		
		treSetCarro.add(new Carro("Ford"));
		treSetCarro.add(new Carro("Fiat"));
		treSetCarro.add(new Carro("Chevrolet"));
		treSetCarro.add(new Carro("Peugeot"));
		treSetCarro.add(new Carro("Zip"));
		treSetCarro.add(new Carro("Alfa Romeo"));
		
		System.out.println(treSetCarro);
	}

}
