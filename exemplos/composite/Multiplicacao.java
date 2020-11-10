public class Multiplicacao implements IFormula
{
    IFormula esquerda, direita;

    public Multiplicacao(IFormula esquerda, IFormula direita)
    {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public double calcular()
    {
        return esquerda.calcular() * direita.calcular();
    }
}