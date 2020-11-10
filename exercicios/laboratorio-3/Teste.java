import java.lang.*;

public class Teste
{
    public static void main(String[] args)
    {
        testeQuestao3();
        testeQuestao5();        
    }

    private static void testeQuestao3()
    {
        float area1, area2, area3, area4;

        System.out.println("Teste da questao 3");

        Quadrado q1 = new Quadrado(4);
        Quadrado q2 = new Quadrado(6);
        Circulo c1 = new Circulo(10);
        Circulo c2 = new Circulo(15);

        //Teste de mover() e calcularArea() para Quadrados
        area1 = q1.calcularArea();
        area2 = q2.calcularArea();
        q1.mover(6,2);
        q2.mover(20,-1);
        area3 = q1.calcularArea();
        area4 = q2.calcularArea();
        if(area1 == area3 && area2 == area4)
            System.out.println("mover e calcularArea funcionam para Quadrados");
        else
            System.out.println("mover e calcularArea nao funcionam para Quadrados");

        //Teste de mover() e calcularArea() para Circulos
        area1 = c1.calcularArea();
        area2 = c2.calcularArea();
        c1.mover(6,2);
        c2.mover(20,-1);
        area3 = c1.calcularArea();
        area4 = c2.calcularArea();
        if(area1 == area3 && area2 == area4)
            System.out.println("mover e calcularArea funcionam para Circulos");
        else
            System.out.println("mover e calcularArea nao funcionam para Circulos");
    }

    private static void testeQuestao5()
    {
        //Teste da questao 5
        System.out.println("\nTeste da questao 5");
        Figura[] figuras = new Figura[10];
        figuras[0] = new Quadrado(3);
        figuras[1] = new Circulo(13);
        figuras[2] = new Circulo(17);
        figuras[3] = new Quadrado(7);
        figuras[4] = new Quadrado(10);
        figuras[5] = new Quadrado(23);        
        figuras[6] = new Quadrado(18);
        figuras[7] = new Circulo(2);
        figuras[8] = new Circulo(9);
        figuras[9] = new Quadrado(38);

        for(int i = 0; i < 10; i++)
            if(figuras[i] instanceof IColorida)
            {
                IColorida figColorida = (IColorida)figuras[i];
                if(i % 2 == 0)
                    figColorida.preencher(Cor.preto);
                else
                    figColorida.preencher(Cor.azul);
                System.out.println(String.format("%d: %s %s", i, figColorida, figColorida.getCor()));  
            }
                
    }
}