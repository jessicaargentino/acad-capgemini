package modulo02.aula21.aula21_camadas.repository;

import java.util.ArrayList;

/* IMPORT DA CLASSE PESSOA DO PACKAGE MODEL */
import modulo02.aula21.aula21_camadas.model.Pessoa;

public class PessoaRepository {
    /* ARRAYLIST DE PESSOA PRIVADO PARA ARMAZENAMENTO DE OBJETOS DO TIPO PESSOA */
    private ArrayList<Pessoa> lista;

    /* CONSTRUTOR DA CLASSE CRIANDO UM ARRAYLIST */
    public PessoaRepository() {
        lista = new ArrayList<>();
    }

    /* CRUD - MÉTODO CREATE/CRIAR UM OBJETO PESSOA */
    public void create(Pessoa p) {
        lista.add(p);
    }

    /* CRUD - MÉTODO READ/LER UM OBJETO PESSOA */
    public ArrayList<Pessoa> read() {
        return lista;
    }

    /*
     * CRUD - MÉTODO UPDATE/RECEBER UM OBJETO PESSOA, BUSCAR ATRAVÉS DO FOR SE
     * EXISTE UMA PESSOA NO ARRAYLIST COM O ID DA PESSOA INFORMADO, SE SIM, DELETAR
     * ESSA PESSOA E CRIAR UMA NOVA COM O MESMO ID/INSERIR NA MESMA POSIÇÃO DO
     * OBJETO ANTERIOR
     */
    public void update(Pessoa p) {
        for (Pessoa pessoa : lista) {
            if (pessoa.getId() == p.getId()) {
                delete(pessoa);
                create(p);
            }
        }
    }

    /* CRUD - MÉTODO DELETE/DELETAR UM OBJETO PESSOA */
    public void delete(Pessoa p) {
        lista.remove(p);
    }
}
