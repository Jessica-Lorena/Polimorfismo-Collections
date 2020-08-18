package Exercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Estoque {
	public static void main(String[] args) 
	{
		Collection <String> estoque = new ArrayList <String>();
		estoque.add("Notebook");
		estoque.add("Celular");
		estoque.add("Placa de Vídeo");
		estoque.add("Monitor");
		estoque.add("Mouse");
		estoque.add("WebCam");
		System.out.println("Estoque: " +estoque);
		
		estoque.remove("Celular");
		estoque.remove("Mouse");
		System.out.println("\nEstoque: " +estoque);
		
		System.out.println("\nContém Placa de Vídeo? "+estoque.contains("Placa de Vídeo")); 
		System.out.println("Estoque: " +estoque);
		
		System.out.println("\nEstoque: ");
		for (String itens:estoque)
		{
			System.out.println(itens);
		}
		
		estoque.clear(); //limpar estoque
		System.out.println("\nEstoque: " +estoque);
	}

}
