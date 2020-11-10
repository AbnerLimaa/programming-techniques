public class Quadrado extends Figura implements IColorida
{
	private Ponto a1;
	private Ponto b1;
	private Ponto a2;
	private Ponto b2;
	private int tamanho;
	private Cor cor = Cor.branco;

	public Quadrado(int tamanho) 
	{
		if(tamanho > 0)
		{
			this.tamanho = tamanho;
			a1 = new Ponto(0,0);
			a2 = new Ponto(tamanho, 0);
			b1 = new Ponto(0, tamanho);
			b2 = new Ponto(tamanho, tamanho);
		}
	}

	public Cor getCor()
	{
		return cor;
	}

	public void setCor(Cor cor)
	{
		this.cor = cor;
	}

	public String toString()
	{
		return "Quadrado";
	}

	public String desenhar()
	{
		return toString();
	}

	public void mover(float dx, float dy)
	{
		if(a1 != null && b1 != null && a2 != null && b2 != null)
		{
			a1.mover(dx, dy);
			a2.mover(dx, dy);
			b1.mover(dx, dy);
			b2.mover(dx, dy);
		}	
	}

	public float calcularArea()
	{
		return (float)Math.pow(tamanho,2);
	}

	public void preencher(Cor cor)
	{
		if(cor != null)
		{
			setCor(cor);
			a1.setCor(cor);
			a2.setCor(cor);
			b1.setCor(cor);
			b2.setCor(cor);
		}
	}
}