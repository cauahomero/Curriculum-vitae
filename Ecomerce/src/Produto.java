public class Produto {
    private int codProduto;
    private String nomeProduto;
    private double valorProduto;
    private int quantidade;
    private static int quantidadeTotal = 0;
    private static final int ESTOQUEMINIMO = 5;

    public int getCodProduto() {
        return codProduto;
    }
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int qtde) {
        this.quantidade = qtde;
    }

    public boolean decrementaQuantidade(int x){
        if(this.getQuantidade() >= 1){
            if (this.getQuantidade() > x){
                this.quantidade-= x;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean incrementaQuantidade(int x){
        if(this.getQuantidade() >= 0){
            this.quantidade += x;
            return true;
        } else {
            return false;
        }
    }

    public boolean validaEstoque(int quantidade){
        return this.getQuantidade() > 0;
    }
}
