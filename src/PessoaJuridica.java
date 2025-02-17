import java.util.Date;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private int numFuncionarios;
    private String setor;

    public PessoaJuridica(String nome, String endereco, String cnpj, int numFuncionarios, String setor) {
        setNome(nome);
        setEndereco(endereco);
        setData(new Date());
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void imprimirDadosCliente() {
        System.out.println(">> Dados pessoa juridica ");
        System.out.println("\nNome: " + this.getNome() +
                           "\nCNPJ: " + this.getCnpj() +
                            "\nFuncionarios: " + this.getNumFuncionarios() +
                            "\nSetor: " + this.getSetor() +
                            "\nEndereco: " + this.getEndereco() +
                            "\nData: " + this.getData());
    }
}
