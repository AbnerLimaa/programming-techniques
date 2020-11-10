public class Variavel implements IFormula
{
    private double valor;

    public Variavel(double valor)
    {
        this.valor = valor;
    }

    public double calcular()
    {
        return valor;
    }
}