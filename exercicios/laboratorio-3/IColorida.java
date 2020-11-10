public interface IColorida
{
    public Cor getCor();

    public void setCor(Cor cor);
    
    public void preencher(Cor cor);
}

enum Cor
{
    vermelho,
    verde,
    azul,
    amarelo,
    marrom,
    laranja,
    preto,
    branco
}