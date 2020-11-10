public class Circulo extends Figura
{
	private Ponto centro;
	private int raio;

	public Circulo(int raio)
	{
		if(raio > 0)
		{
			this.raio = raio;
			centro = new Ponto(0,0);
		}
	}

	public String toString()
	{
		return "Circulo";
	}

	public String desenhar()
	{
		return toString();
	}

	public void mover(float dx, float dy)
	{
		if(centro != null)
			centro.mover(dx, dy);
	}

	public float calcularArea()
	{
		return (float)(Math.PI * Math.pow(raio, 2));
	}
}