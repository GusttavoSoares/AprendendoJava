package Arquivos.Interface.Comida;

public class Sal extends Alimento implements NaoPerecivel{
    @Override
    public int estragarLentamente(){
        return getFabricacao() + 365;
    }
}
