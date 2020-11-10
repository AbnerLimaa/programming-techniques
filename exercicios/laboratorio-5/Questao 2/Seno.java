public class Seno extends Operacao
{
	public Seno(IExpressao expressao)
	{
		super.expressao = expressao;
	}

	public String toString()
	{
		return "sin(" + super.expressao.toString() + ")";
	}

	@Override
	public double calcular()
	{
		return seno(super.calcular());
	} 

	private double seno(double valor)
	{
		return Math.sin(Math.toRadians(valor));
	}
}