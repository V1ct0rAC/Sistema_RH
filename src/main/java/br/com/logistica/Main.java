package br.com.logistica;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Alice", "TI", 7500.0),
                new Funcionario("Bob", "RH", 4000.0),
                new Funcionario("Carlos", "TI", 12000.0),
                new Funcionario("Diana", "Financeiro", 6000.0),
                new Funcionario("Eva", "TI", 5000.0),
                new Funcionario("Fernando", "RH", 4500.0));

       // funcionarios.stream().filter(p->p.getDepartamento().
        // equalsIgnoreCase("TI")).filter(m->m.getSalario()>6000.00).
        // forEach(System.out::println);
        //Nesee stream para funcionar minha classe precisa do toString para eu visualizar

        List<String> TIaltaRenda = funcionarios.stream().filter(p->p.getDepartamento().
                        equalsIgnoreCase("TI")).
                filter(m->m.getSalario()>6000.00).map(Funcionario::getNome).toList();
        System.out.println(TIaltaRenda);
        //obs aqui eu selecionei os dados e tranferir para outra lista q depois eu imprimi


        Double somaSalarios = funcionarios.stream().mapToDouble(funcionario -> funcionario.getSalario()).sum();
        System.out.println(somaSalarios);

        boolean verificarSalario = funcionarios.stream().anyMatch(p->p.getSalario()<3000.00);
        System.out.println(verificarSalario);





    }
    }

