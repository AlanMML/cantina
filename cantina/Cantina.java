import java.util.HashMap;
import java.util.Map;

class Cantina {
    private Map<String, ItemEstoque> estoque;

    public Cantina() {
        estoque = new HashMap<>();
    }

    public void adicionarItem(String nome, int quantidade, double preco) {
        ItemEstoque item = estoque.get(nome);
        if (item != null) {
            item.setQuantidade(item.getQuantidade() + quantidade);
            item.setPreco(item.getPreco() + preco);
        } else {
            item = new ItemEstoque(nome, quantidade, preco);
            estoque.put(nome, item);
        }
    }

    public void removerItem(String nome, int quantidade) {
        ItemEstoque item = estoque.get(nome);
        if (item != null) {
            int novaQuantidade = item.getQuantidade() - quantidade;
            if (novaQuantidade <= 0) {
                estoque.remove(nome);
            } else {
                item.setQuantidade(novaQuantidade);
            }
        }
    }

    public void imprimirEstoque() {
        System.out.println("Estoque da Cantina:");
        for (ItemEstoque item : estoque.values()) {
            System.out.println(item.getNome() + ": " + item.getQuantidade());
        }
    }

    public void alterarQuantidadeItem(String nome, int novaQuantidade) {
        ItemEstoque item = estoque.get(nome);
        if (item != null) {
            item.setQuantidade(novaQuantidade);
            System.out.println("Quantidade do item '" + nome + "' alterada para " + novaQuantidade);
        } else {
            System.out.println("O item '" + nome + "' não existe no estoque.");
        }
    }
}