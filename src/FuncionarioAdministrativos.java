public class FuncionarioAdministrativos extends Funcionarios {

    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionarioAdministrativos(String nome, Integer cpf, Integer numeroRegistro, String orgaoLotacao,
                                      double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public double calcularSalario() {
        return 0;
    }

    @Override
    public void exibirInformacoes () {
        super.exibirInformacoes();
        System.out.println("Função Administrativa: " + funcaoAdministrativa);
        System.out.println("Senioridade: " + senioridade);
    }

    @Override
    public void adicionaProfessor() {

    }
}
