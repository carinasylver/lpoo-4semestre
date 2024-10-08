package obj3Lista1.EmpresaFuncionario.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String cnpj, String razaoSocial, String nomeFantasia) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    public Empresa(String cnpj, String razaoSocial, String nomeFantasia, List<Funcionario> funcionarios) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.funcionarios = funcionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "\nEmpresa{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                '}';
    }
}
