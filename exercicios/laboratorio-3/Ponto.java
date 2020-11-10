public class Ponto extends Figura
{
	private float x;
	private float y;
	private Cor cor = Cor.branco;

	public Ponto(float x, float y)
	{
		this.x = x;
		this.y = y;
	}

	public float getX()
	{
		return x;
	}

	public float getY()
	{
		return y;
	}

	@Override
	public Cor getCor()
	{
		return cor;
	}

	@Override
	public void setCor(Cor cor)
	{
		this.cor = cor;
	}

	public String toString()
	{
		return "(" + x + "," + y + ")";
	}

	public String desenhar()
	{
		return toString();
	}

	public void mover(float dx, float dy)
	{
		if(dx != 0 || dy != 0)
		{
			x = x + dx;
			y = y + dy;
		}
	}

	public float calcularArea()
	{
		return 1;
	}
}