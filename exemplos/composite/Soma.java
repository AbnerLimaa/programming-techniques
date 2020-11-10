public class Soma implements IFormula
{
    IFormula esquerda, direita;

    public Soma(IFormula esquerda, IFormula direita)
    {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public double calcular()
    {
        return esquerda.calcular() + direita.calcular();
    }
}