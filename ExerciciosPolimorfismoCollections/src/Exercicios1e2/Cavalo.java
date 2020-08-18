package Exercicios1e2;

public class Cavalo extends Animal{
	private String corre;

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	public String getInfo()
	{
		return super.getNome()+"\t"+super.getIdade()+"\t"+super.getEmiteSom()+"\t"+this.getCorre();
	}

}
