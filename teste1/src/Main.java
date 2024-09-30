public class Main {
    public static void main(String[] args) {
        // Instância do Fox
        Caminhao caminhao = new Caminhao();
        caminhao.marca = "Volkswagen";
        caminhao.modelo = "Fox";
        caminhao.ano = 2008;
        caminhao.cor = "Prata";
        caminhao.exibirDetalhes();
        caminhao.buzinar();

        // Instância do Mustang
        Mustang mustang = new Mustang();
        mustang.marca = "Ford";
        mustang.modelo = "Mustang";
        mustang.ano = 2021;
        mustang.cor = "Vermelho";
        mustang.exibirDetalhes();
        mustang.buzinar();

        // Instância do Civic
        Civic civic = new Civic();
        civic.marca = "Honda";
        civic.modelo = "Civic";
        civic.ano = 2019;
        civic.cor = "Branco";
        civic.exibirDetalhes();
        civic.buzinar();
    }
}