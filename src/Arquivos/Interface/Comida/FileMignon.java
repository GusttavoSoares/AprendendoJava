package Arquivos.Interface.Comida;

public class FileMignon extends Alimento implements Perecivel {
    @Override
    public int estragarRapidamente(){
        return getFabricacao() + 5;
    }
}
