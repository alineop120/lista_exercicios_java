package herancaAssociacaoPessoa;

public class Fornecedor {
    private String cnpj;
    private String nome;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Fornecedor(String cnpj, String nome) {
        this.cnpj=cnpj;
        this.nome=nome;
    }
    
    public String toString() {
        return "\nCNPJ: "+getCnpj()+
                "\nNome"+getNome();
    }
}
