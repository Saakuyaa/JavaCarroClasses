public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;


    public void buzinar() {
        System.out.println("Buzinando: Beep! Beep!");
    }
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
}