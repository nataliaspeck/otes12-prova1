
public class UnionCorporation {

    public static void main(String[] args){

        Funcionario funcionario = new Funcionario("Natália", "Sul");
        funcionario.setCota("2020/2", 20.0, 20.0);
        funcionario.imprimirRelatorio();
        funcionario.updateProgresso(30.0);
        funcionario.imprimirRelatorio();

        // new Calculate(INITIAL_COST_VALUE).totalCalc(List.of(callingCost, mealCost, stayingCost));

    }

}