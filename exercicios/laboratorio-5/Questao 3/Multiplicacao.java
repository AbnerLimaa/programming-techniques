package expressoes;

public class Multiplicacao extends Expressao
{
	private Expressao esquerda, direita;

	public Multiplicacao(Expressao esquerda, Expressao direita)
	{
		this.esquerda = esquerda;
		this.direita = direita;
	}

	public String toString()
	{
		return "(" + esquerda.toString() + " * " + direita.toString() + ")";
	}

	public double calcular()
	{
		super.setresultado(esquerda.calcular() * direita.calcular());
		return super.getresultado();
	}
}