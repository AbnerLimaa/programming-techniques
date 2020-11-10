public class Program
{
    public static void main(String[] args)
    {
        Variavel a = new Variavel(10);
        Variavel b = new Variavel(7);
        Variavel c = new Variavel(-1);
        Soma soma1 = new Soma(a, b);
        Soma soma2 = new Soma(soma1, c);
        Subtracao sub = new Subtracao(soma1, soma2);
        Multiplicacao mult = new Multiplicacao(soma2, sub);
        System.out.println("Formula: (10 + 7 - ((10 + 7) - 1)) * ((10 + 7) - 1)");
        System.out.printf("Resultado: %f", mult.calcular());
    }
}