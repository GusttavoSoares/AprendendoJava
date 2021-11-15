package Arquivos.TryCatch.Excecoes;

class TryCatch1
{
    public static void main (String args[])
    {
        try
        {
            System.out.print("Como aprender ");
            throw new Exception("MinhaExcecao");
        }
        catch (Exception MinhaExcecao)
        {
            System.out.print("a linguagem Java?");
        }
    }
}
