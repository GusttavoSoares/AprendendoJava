package Arquivos.Interface.IntroducaoInterface;

//criando a interface
public interface Alerta extends Mensagem {
    public String demora = "está demorando";
    public String cautela = "tenha cautela";

    // criando o metodo showMsg
    public void showMsg(String texto, int icone);
}
