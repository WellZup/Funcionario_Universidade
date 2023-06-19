public abstract class Funcionarios {
    String nome;
    Integer cpf;
    Integer numeroRegistro;
    String orgaoLotacao;
    double salario;

    public Funcionarios(String nome, Integer cpf, Integer numeroRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(Integer numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();

    public void aumentoSalario() {
        if (this instanceof Coordenadores) {
            // Aumento de 5% para coordenadores
            double novoSalario = getSalario() * 1.05;
            setSalario(novoSalario);
        } else {
            // Aumento de 10% para outros funcionários
            double novoSalario = getSalario() * 1.1;
            setSalario(novoSalario);
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Número de Registro: " + numeroRegistro);
        System.out.println("Órgão de Lotação: " + orgaoLotacao);
        System.out.println("Salário: " + salario);
    }

    public abstract void adicionaProfessor();
}