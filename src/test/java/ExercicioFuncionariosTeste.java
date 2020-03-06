package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FuncionariosTeste {
    @Test
    public void criacaoFuncionarios(){
        Funcionarios f1 = new Funcionarios();
        assertNotNull(f1);
    }

    @Test
    public void presencaAtributosFuncionarios(){
        Funcionarios f1 = new Funcionarios();
        f1.nome = "Guilherme";
        f1.email = "guisantana0204@gmail.com";
        f1.idade = 19;
        f1.salario = 3000.00;
        f1.porcentagem = 10.0;
        assertNotNull(f1.email + f1.porcentagem + f1.salario + f1.idade + f1.nome);
    }

    @Test
    public void calculoAumentoSalario(){
        //Arrenge
        Funcionarios f1 = new Funcionarios();
        f1.salario = 3000.00;
        f1.porcentagem = 10.0;
        Double valorEsperado = 3300.00;

        //Act
        Double valorObtido = f1.promoverAumento();

        //Assert
        assertEquals(valorEsperado, valorObtido);
    }

}
