public class ItemDeOrcamento {
    private int quantidade;

    public int getItemDeOrcamento(){
        return quantidade;
    }

    public void itemDeOrcamento(Produto produt, int quantidade){
        this.quantidade -= quantidade;
    }
}