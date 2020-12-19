import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UnionCorporation {

    public static void main(String[] args){
        List<Funcionario> funcionarioList = new ArrayList<>();

        Funcionario funcionario1 = new Funcionario("Natália", "Sul");
        funcionario1.setCota("2020/2", 20.0, 10.0);

        Funcionario funcionario2 = new Funcionario("William Castaneda", "Sudeste");
        funcionario2.setCota("2020/2", 45.0, 45.0);

        funcionarioList.add(funcionario1);
        funcionarioList.add(funcionario2);

        funcionarioList.forEach(funcionario -> funcionario.imprimirRelatorio());

        funcionario1.updateProgresso(20.0);

        funcionarioList.forEach(funcionario -> funcionario.imprimirRelatorio());
    }

}