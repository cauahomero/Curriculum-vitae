public class Endereco {
    private int codEndereço;
    private String logradouro;
    private int numero;
    private String completo;
    private String bairro;
    private int cep;
    private String cidade;
    private String estado;
   
    public int getCodEndereço() {
        return codEndereço;
    }
    public void setCodEndereço(int codEndereço) {
        this.codEndereço = codEndereço;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCompleto() {
        return completo;
    }
    public void setCompleto(String completo) {
        this.completo = completo;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
   
}