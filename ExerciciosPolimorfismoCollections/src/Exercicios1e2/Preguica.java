package Exercicios1e2;

public class Preguica extends Animal{
	private String sobeArvore;

	public String getsobeArvore() {
		return sobeArvore;
	}

	public void setsobeArvore(String sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	public String getInfo()
	{
		return super.getNome()+"\t"+super.getIdade()+"\t"+super.getEmiteSom()+"\t"+this.getsobeArvore();
	}

}
