package modulo02.aula19;

/* CLASSE FILHA DE GARRAFA */
public class GarrafaTermica extends Garrafa {
    /* SOBRESCRITA DO MÉTODO FUNÇÃO EXISTENTE NA CLASSE PAI */
    @Override
    public void funcao() {
        System.out.println("Manter temperatura");
        super.funcao();
    }
}
