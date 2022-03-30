package Arquivos.Object.Hashcode;

public class Comida {

    private String categoria;

    public Comida(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria (){
        return categoria;
    }
    public void setCategoria (String categoria){
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        return result;
    }
}
