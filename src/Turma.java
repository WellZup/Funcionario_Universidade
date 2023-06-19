public class Turma {
    private String nome;
    private String disciplina;
    private String horario;
    private int quantidadeAlunos;

    public Turma(String nome, String disciplina, String horario, int quantidadeAlunos) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.horario = horario;
        this.quantidadeAlunos = quantidadeAlunos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }


}
