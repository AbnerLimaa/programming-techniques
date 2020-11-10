import java.util.*;

class Teste_Hash2 
{
    public static void main(String args[])
    {
        Set<String> mesesHash = new HashSet<>();
        mesesHash.add("Janeiro");
        mesesHash.add("Fevereiro");
        mesesHash.add("Março");
        mesesHash.add("Abril");
        mesesHash.add("Maio");
        mesesHash.add("Fevereiro");
        System.out.println("HashSet:");
        Teste_Hash2.listar(mesesHash);
        Teste_Hash2.listar2(mesesHash);
    }

    private static void listar(Collection c)
    {
        System.out.println(c);
    }

    private static void listar2(Collection c)
    {
        System.out.println("*** Listar 2 ****");
        for(Object o : c)
            System.out.println(o);
    }
}