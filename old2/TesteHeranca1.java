import AlunoDeGraduacao;

package old2;
public class TesteHeranca1 {
    public static void main(String[] args) {
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.nome = "João";
        aluno.idade = 17;
        System.out.printf("nome: %s, idade: %d\n", aluno.nome, aluno.idade);
    }
}