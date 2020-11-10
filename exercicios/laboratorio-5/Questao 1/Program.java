public class Program
{
	public static void main(String[] args)
	{
		IExpressao a = new Variavel(4);
		IExpressao b = new Variavel(4);
		IExpressao c = new Variavel(2);
		IExpressao mult = new Multiplicacao(a, b);
		IExpressao div = new Divisao(mult, c);
		System.out.printf(div.toString() + " = %.2f\n", div.calcular());
	}
}