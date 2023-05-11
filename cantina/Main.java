public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();

        cantina.adicionarItem("Salgado", 10, 2.5);
        cantina.adicionarItem("Refrigerante", 20, 3.0);
        cantina.adicionarItem("Suco", 15, 2.0);
        cantina.adicionarItem("Salgado", 5, 2.5);

        cantina.imprimirEstoque();

        cantina.alterarQuantidadeItem("Salgado", 8);
        cantina.alterarQuantidadeItem("Refrigerante", 25);
        cantina.alterarQuantidadeItem("Bolo", 5);

        cantina.imprimirEstoque();
    }
}