package expressoes;

public class Soma extends Expressao
{
	private Expressao esquerda, direita;

	public Soma(Expressao esquerda, Expressao direita)
	{
		this.esquerda = esquerda;
		this.direita = direita;
	}

	public String toString()
	{
		return "(" + esquerda.toString() + " + " + direita.toString() + ")";
	}

	public double calcular()
	{
		super.setresultado(esquerda.calcular() + direita.calcular());
		return super.getresultado();
	}
}