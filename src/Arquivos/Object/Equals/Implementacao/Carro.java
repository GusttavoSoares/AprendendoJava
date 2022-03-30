package Arquivos.Object.Equals.Implementacao;

public class Carro {
    String modelo;

     Carro(String modelo){
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Carro other = (Carro) obj;

        if (modelo == null) {
            if (other.modelo != null)
                return false;
        }
        else if (!modelo.equals(other.modelo))
            return false;

        return true;
    }
}
