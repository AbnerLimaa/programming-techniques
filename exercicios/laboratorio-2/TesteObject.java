import java.util.Scanner;

public class TesteObject
{
	public static void main(String[] args)
	{
		System.out.println("Teste do conjunto com object");
		int i;
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5, num6 = 6, num7 = 7, num8 = 8;
		int num9 = 9, num10 = 10, num11 = 11, num13 = 13, num17 = 17, num19 = 19, num23 = 23;
		int num29 = 29;
		ConjuntoObject dezNaturais = new ConjuntoObject(10);
		ConjuntoObject cincoPares = new ConjuntoObject(5);
		ConjuntoObject cincoImpares = new ConjuntoObject(5);
		ConjuntoObject dezPrimos = new ConjuntoObject(10);

		dezNaturais.inserir(num1);
		dezNaturais.inserir(num2);
		dezNaturais.inserir(num3);
		dezNaturais.inserir(num4);
		dezNaturais.inserir(num5);
		dezNaturais.inserir(num6);
		dezNaturais.inserir(num7);
		dezNaturais.inserir(num8);
		dezNaturais.inserir(num9);
		dezNaturais.inserir(num10);

		cincoPares.inserir(num2);
		cincoPares.inserir(num4);
		cincoPares.inserir(num6);
		cincoPares.inserir(num8);
		cincoPares.inserir(num10);
		
		cincoImpares.inserir(num1);
		cincoImpares.inserir(num3);
		cincoImpares.inserir(num5);
		cincoImpares.inserir(num7);
		cincoImpares.inserir(num9);

		dezPrimos.inserir(num2);
		dezPrimos.inserir(num3);
		dezPrimos.inserir(num5);
		dezPrimos.inserir(num7);
		dezPrimos.inserir(num11);
		dezPrimos.inserir(num13);
		dezPrimos.inserir(num17);
		dezPrimos.inserir(num19);
		dezPrimos.inserir(num23);
		dezPrimos.inserir(num29);

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
			Object numPrimo = dezPrimos.elemPosicao(j);
			Object numPar;
			Object numImpar;
			if(j < 5)
			{
				numPar = cincoPares.elemPosicao(j);
				numImpar = cincoImpares.elemPosicao(j);
			}
			else
			{
				numPar = null;
				numImpar = null;
			}
			if(dezNaturais.pertence(numPrimo))
				System.out.println(String.format("%d pertence a 1", (int)numPrimo));
			if(numPar != null && dezNaturais.pertence(numPar))
				System.out.println(String.format("%d pertence a 1", (int)numPar));
			if(numImpar != null && dezNaturais.pertence(numImpar))
				System.out.println(String.format("%d pertence a 1", (int)numImpar));
		}

		//Teste c)
		i = 0;
		System.out.println("\nTeste c)");
		ConjuntoObject uniao = cincoPares.uniao(cincoImpares);
		while(i < uniao.tamanho() && dezNaturais.pertence(uniao.elemPosicao(i)))
			i++;
		if(i == 10)
			System.out.println("Uniao de 2 e 3 e igual a 1");
		else
			System.out.println("erro");

		//Teste d)
		System.out.println("\nTeste d)");
		ConjuntoObject intersecao = dezNaturais.intersecao(cincoPares);
		if(intersecao != null)
			System.out.println("Intersecao nao nula");
		else
			System.out.println("Intersecao nula");

		//Teste e)
		System.out.println("\nTeste e)");
		ConjuntoObject diferenca = dezNaturais.diferenca(cincoPares);
		if(diferenca == null)
			System.out.println("Nao ha diferenca");
		else
		{
			System.out.println("Diferenca:");
			for(int j = 0; j < diferenca.tamanho(); j++)
				System.out.println(String.format("%d", (int)diferenca.elemPosicao(j)));
		}

		//Teste Produto Cartesiano
		System.out.println("\nTeste Produto Cartesiano");
		ConjuntoObject prodCartesiano = dezNaturais.prodCartesiano(dezPrimos);
		if(prodCartesiano == null)
			System.out.println("erro");
		if(prodCartesiano.tamanho() == 0)
			System.out.println("Conjuntos vazios");
		else
			for(int j = 0; j < prodCartesiano.tamanho(); j++)
			{
				ConjuntoObject tupla = (ConjuntoObject)prodCartesiano.elemPosicao(j);
				System.out.println(String.format("(%d,%d)", (int)tupla.elemPosicao(0), (int)tupla.elemPosicao(1)));
			}

		//Teste Conjunto das Partes
		System.out.println("\nTeste Conjunto das Partes");

		System.out.println("\nTeste conjunto 2");
		ConjuntoObject conj2 = cincoPares.potencia();
		for(int j = 0; j < conj2.tamanho(); j++)
			System.out.print(String.format("%s, ",conj2.elemPosicao(j).toString()));
		System.out.println();

		System.out.println("\nTeste conjunto 3");
		ConjuntoObject conj3 = cincoImpares.potencia();
		for(int j = 0; j < conj3.tamanho(); j++)
			System.out.print(String.format("%s, ",conj3.elemPosicao(j).toString()));
		System.out.println();

		//Teste das leis de De Morgan
		System.out.println("\nTeste das leis de De Morgan");
		ConjuntoObject universo = new ConjuntoObject(50);
		ConjuntoObject conjA = new ConjuntoObject(20);
		ConjuntoObject conjB = new ConjuntoObject(10);
		for(int j = 0; j < 50; j++)
		{	
			universo.inserir(j);
			if(j < 20)
				conjA.inserir(j);
			if(j >= 20 && j < 30)
				conjB.inserir(j);
		}
			
		ConjuntoObject complementoDeA = universo.diferenca(conjA);
		ConjuntoObject complementoDeB = universo.diferenca(conjB);
		ConjuntoObject complementoDaUniao = universo.diferenca(conjA.uniao(conjB));
		ConjuntoObject complementoDaIntersecao = universo.diferenca(conjA.intersecao(conjB));
		ConjuntoObject uniaoDoComplemento = complementoDeA.uniao(complementoDeB);
		ConjuntoObject intersecaoDoComplemento = complementoDeA.intersecao(complementoDeB);

		System.out.println("Lei 1:");
		i = 0;
		while(i < complementoDaUniao.tamanho() && intersecaoDoComplemento.pertence(complementoDaUniao.elemPosicao(i)))
			i++;
		if(i == complementoDaUniao.tamanho())
			System.out.println("Verdade");
		else
			System.out.println("Elementos diferentes");

		System.out.println("Lei 2:");
		i = 0;
		while(i < complementoDaIntersecao.tamanho() && uniaoDoComplemento.pertence(complementoDaIntersecao.elemPosicao(i)))
			i++;
		if(i == complementoDaIntersecao.tamanho())
			System.out.println("Verdade");
		else
			System.out.println("Elementos diferentes");
	}
}