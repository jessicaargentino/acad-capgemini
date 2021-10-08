package modulo02.aula21.aula21_1;

import java.util.ArrayList;

public class TelaAluno {
    /* CRIAÇÃO DE ARRAYLIST DE ALUNOS ESTÁTICO PARA SER CRIADO UMA ÚNICA VEZ */
    static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

    public static void main(String[] args) {
        /*
         * CRIAÇÃO DE INSTÂNCIAS DA CLASSE ALUNO (OBJETO) E ATRIBUIÇÃO DE VALORES
         * UTILIZANDO O SETTER, ALÉM DA CHAMADA DOS MÉTODOS DO CRUD
         */
        Aluno a1 = new Aluno(1);
        a1.setNome("Laura Palmer");
        a1.setIdade(17);
        salvar(a1); /* SALVA O ALUNO1 NO ARRAYLIST */

        Aluno a2 = new Aluno(2);
        a2.setNome("Pure Vessel");
        a2.setIdade(24);
        salvar(a2); /* SALVA O ALUNO1 NO ARRAYLIST */

        Aluno a3 = new Aluno(2);
        a3.setNome("Luke Skywalker");
        a3.setIdade(53);
        alterar(a3); /* ALTERANDO O ELEMENTO ALUNO2 PARA O ELEMENTO ALUNO3 */
        deletar(a1); /* DELETA O ELEMENTO ALUNO1 */

        /* PERCORRENDO O ARRAYLIST DE ALUNOS E IMPRIMINDO OS DADOS */
        for (Aluno aluno : listar()) {
            System.out.printf("\nNome: %s - Idade: %d", aluno.getNome(), aluno.getIdade());
        }

    }

    /* CREATE */
    static void salvar(Aluno a) {
        listaAlunos.add(a);
    }

    /* READ */
    static ArrayList<Aluno> listar() {
        return listaAlunos;
    }

    /* UPDATE */
    static void alterar(Aluno a) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getCodigo() == a.getCodigo()) {
                deletar(aluno);
                salvar(a);
            }
        }
    }

    /* DELETE */
    static void deletar(Aluno a) {
        listaAlunos.remove(a);
    }
}
