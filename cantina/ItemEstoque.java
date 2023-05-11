
class ItemEstoque {
    private String nome;
    private int quantidade;
    private double preco;

    public ItemEstoque(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double d) {
        this.preco = d;
    }
}
