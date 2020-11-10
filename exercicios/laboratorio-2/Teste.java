import java.util.Scanner;

public class Teste
{
	public static void main(String[] args)
	{
		System.out.println("Teste do conjunto com inteiros");
		int i;
		Conjunto dezNaturais = new Conjunto(10);
		Conjunto cincoPares = new Conjunto(5);
		Conjunto cincoImpares = new Conjunto(5);
		Conjunto dezPrimos = new Conjunto(10);

		for(int j = 1; j < 11; j++)
			dezNaturais.inserir(j);

		for(int j = 2; j < 11; j = j + 2)
			cincoPares.inserir(j);

		for(int j = 1; j < 10; j = j + 2)
			cincoImpares.inserir(j);

		dezPrimos.inserir(2);
		dezPrimos.inserir(3);
		dezPrimos.inserir(5);
		dezPrimos.inserir(7);
		dezPrimos.inserir(11);
		dezPrimos.inserir(13);
		dezPrimos.inserir(17);
		dezPrimos.inserir(19);
		dezPrimos.inserir(23);
		dezPrimos.inserir(29);

		//Teste a)
		System.out.println("\nTeste a)");
		if(dezPrimos.eSubConjunto(dezPrimos))
			System.out.println("Conjunto 4 e subconjunto de si mesmo");
		else
			System.out.println("erro");

		//Teste b)
		System.out.println("\nTeste b)");
		for(int j = 0; j < 10; j++)
		{
			int numPrimo = dezPrimos.elemPosicao(j);
			int numPar;
			int numImpar;
			if(j < 5)
			{
				numPar = cincoPares.elemPosicao(j);
				numImpar = cincoImpares.elemPosicao(j);
			}
			else
			{
				numPar = -1;
				numImpar = -1;
			}
			if(dezNaturais.pertence(numPrimo))
				System.out.println(String.format("%d pertence a 1", numPrimo));
			if(numPar >= 0 && dezNaturais.pertence(numPar))
				System.out.println(String.format("%d pertence a 1", numPar));
			if(numImpar >= 0 && dezNaturais.pertence(numImpar))
				System.out.println(String.format("%d pertence a 1", numImpar));
		}

		//Teste c)
		i = 0;
		System.out.println("\nTeste c)");
		Conjunto uniao = cincoPares.uniao(cincoImpares);
		while(i < uniao.tamanho() && dezNaturais.pertence(uniao.elemPosicao(i)))
			i++;
		if(i == 10)
			System.out.println("Uniao de 2 e 3 e igual a 1");
		else
			System.out.println("erro");

		//Teste d)
		System.out.println("\nTeste d)");
		Conjunto intersecao = dezNaturais.intersecao(cincoPares);
		if(!intersecao.vazio())
			System.out.println("Intersecao nao nula");
		else
			System.out.println("Intersecao nula");

		//Teste e)
		System.out.println("\nTeste e)");
		Conjunto diferenca = dezNaturais.diferenca(cincoPares);
		if(diferenca.vazio())
			System.out.println("Nao ha diferenca");
		else
		{
			System.out.println("Diferenca:");
			for(int j = 0; j < diferenca.tamanho(); j++)
				System.out.println(String.format("%d", diferenca.elemPosicao(j)));
		}
	}
}