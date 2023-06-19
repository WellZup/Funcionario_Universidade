import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {

    private List<Professores> professoresSupervisionados;

    public Coordenadores(String nome, Integer cpf, Integer numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = new ArrayList<>();
    }



    public List<Professores> getProfessoresSupervisores() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisores(List<Professores> professoresSupervisores) {
        this.professoresSupervisionados = professoresSupervisores;
    }


    @Override
    public double calcularSalario() {
        return getSalario();
    }

//    public void adicionaProfessor(Professores professor) {
//        professoresSupervisionados.add(professor);
//    }



    public void exibirInformacoes () {
        super.exibirInformacoes();
        System.out.println("Professores Supervisionados: ");

        for (Professores professores: professoresSupervisionados) {
            System.out.println("- " + professores.getNome());
        }


    }

    @Override
    public void adicionaProfessor() {

    }


    public void adicionaProfessor(Professores professores) {

        professoresSupervisionados.add(professores);

    }

}
