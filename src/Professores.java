import java.util.ArrayList;
import java.util.List;

public class Professores extends Funcionarios{

    String  niveldeGraduacao;
    String disciplinaMinistrada;
    int qtdAlunos;
    int qtdTurmas;

    private List<Turma> turmas;

    public Professores(String nome, Integer cpf, Integer numeroRegistro, String orgaoLotacao, double salario,
                       String niveldeGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);

        turmas = new ArrayList<>();

        this.niveldeGraduacao = niveldeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }

    public String getNiveldeGraduacao() {
        return niveldeGraduacao;
    }

    public void setNiveldeGraduacao(String niveldeGraduacao) {
        this.niveldeGraduacao = niveldeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    public void adicionaTurma (Turma turma) {
        turmas.add(turma);
    }

    @Override
    public double calcularSalario(){
        return getSalario();
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();

        System.out.println("Nível de Graduação: " + niveldeGraduacao);
        System.out.println("Disciplina Ministrada: " + disciplinaMinistrada);
        System.out.println("Quantidade de Alunos: " + qtdAlunos);
        System.out.println("Quantidade de Turmas: " + qtdTurmas);
    }

    @Override
    public void adicionaProfessor() {

    }

}
