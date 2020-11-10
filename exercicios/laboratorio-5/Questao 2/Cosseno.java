public class Cosseno extends Operacao
{
	public Cosseno(IExpressao expressao)
	{
		super.expressao = expressao;
	}

	public String toString()
	{
		return "cos(" + super.expressao.toString() + ")";
	}

	@Override
	public double calcular()
	{
		return cosseno(super.calcular());
	} 

	private double cosseno(double valor)
	{
		return Math.cos(Math.toRadians(valor));
	}
}