package exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {
    @Test
    public void criacaoRetangulo(){
        Retangulo r1 = new Retangulo();
        assertNotNull(r1);
    }

    @Test
    public void presencaAtributoBase(){
        Retangulo r1 = new Retangulo();
        r1.base = 3.0;
        assertNotNull(r1.base);
    }

    @Test
    public void presencaAtributoAltura(){
        Retangulo r1 = new Retangulo();
        r1.altura = 5.0;
        assertNotNull(r1.altura);
    }

    @Test
    public void calculoAreaRetangulo(){
        //Arrenge
        Retangulo r1 = new Retangulo();
        r1.altura = 10.0;
        r1.base = 20.0;
        Double valorEsperado = 200.0;

        //Act
        Double valorObtido = r1.calcularArea();

        //Assert
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void calculoPerimetroRetangulo(){
        //Arrenge
        Retangulo r1 = new Retangulo();
        r1.altura = 10.0;
        r1.base = 20.0;
        Double valorEsperado = 60.0;

        //Act
        Double valorObtido = r1.calcularPerimetro();

        //Assert
        assertEquals(valorEsperado, valorObtido);
    }
}
