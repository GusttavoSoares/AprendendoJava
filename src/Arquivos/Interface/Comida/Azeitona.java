package Arquivos.Interface.Comida;

public class Azeitona extends Alimento implements AlimentoEmConserva, NaoPerecivel {
    @Override
    public int estragarLentamente() {
        return getFabricacao() + 15;
    }

    @Override
    public void conservarEmPotes(){
        // TODO
    }
}
