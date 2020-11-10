public class Subtracao implements IFormula
{
    IFormula esquerda, direita;

    public Subtracao(IFormula esquerda, IFormula direita)
    {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public double calcular()
    {
        return esquerda.calcular() - direita.calcular();
    }
}