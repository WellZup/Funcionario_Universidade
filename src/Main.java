public class Main {
    public static void main(String[] args) {

        // Criando um professor
        Professores professor1 = new Professores("John Doe", 123456789, 001,
                "Departamento de Ciências", 5000.0, "Mestrado",
                "Matemática", 30, 2);
        Professores professor2 = new Professores("Maria", 987654321, 002,
                "Departamento de Física", 5000.0,
                "Doutorado", "Física", 40, 2);

        // Criando uma turma
        Turma turma1 = new Turma("Turma A", "Cálculo", "Segunda-feira, 8h-10h", 40);

        // Adicionando a turma ao professor
        professor1.adicionaTurma(turma1);
        professor2.adicionaTurma(turma1);

        // Exemplo de cálculo de salário
        double salarioProfessor = professor1.calcularSalario();

        // Exibindo informações do professor
        System.out.println();
        professor1.exibirInformacoes();
        System.out.println();
        professor2.exibirInformacoes();
        System.out.println();


        FuncionarioAdministrativos funcionarioAdmin1 = new FuncionarioAdministrativos("Sarah Johnson",
                456789123, 003, "Reitoria", 4000.0,
                "Assistente Administrativo", "Pleno");


        double salarioFuncionarioAdmin = funcionarioAdmin1.calcularSalario();


        funcionarioAdmin1.exibirInformacoes();
        System.out.println();

        // Criando um coordenador
        Coordenadores coordenador1 = new Coordenadores("Jane Smith", 987654321, 002,
                "Departamento de Engenharia", 7000.0);


        coordenador1.adicionaProfessor(professor1);
        coordenador1.adicionaProfessor(professor2);


        double salarioCoordenador = coordenador1.calcularSalario();


        coordenador1.exibirInformacoes();


        professor1.aumentoSalario();
        funcionarioAdmin1.aumentoSalario();
        coordenador1.aumentoSalario();
    }
}
