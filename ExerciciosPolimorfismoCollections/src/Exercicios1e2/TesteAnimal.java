package Exercicios1e2;

public class TesteAnimal {
	public static void main(String[] args) 
	{
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Doge");
		cachorro.setIdade(7);
		cachorro.setEmiteSom("Late");
		cachorro.setCorre("Corre, a velocidade muda dependendo do tamanho e raça");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Pegasus");
		cavalo.setIdade(14);
		cavalo.setEmiteSom("Relincha");
		cavalo.setCorre("Corre até 70km/h");
		
		Preguica preguica = new Preguica();
		preguica.setNome("Sloth");
		preguica.setIdade(20);
		preguica.setEmiteSom("Boceja");
		preguica.setsobeArvore("Sobe em árvores");
		
		Animal[] animais = new Animal[3];
		animais[0] = cachorro;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for(Animal animal:animais)
		{
			System.out.println(animal.getInfo());
		}
	}

}
