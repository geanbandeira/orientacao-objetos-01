package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {
    @Test
    public void criacaoCirculo(){
        Circulo c1 = new Circulo();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributoRaio(){
        Circulo c1 = new Circulo();
        c1.raio = 4.0;
        assertNotNull(c1.raio);
    }

    @Test
    public void presencaAtributoPI(){
        Circulo c1 = new Circulo();
        c1.pi = 3.1416;
        assertNotNull(c1.pi);
    }

    @Test
    public void calculoAreaCirculo(){
        //Arrenge
        Circulo c1 = new Circulo();
        c1.raio = 4.0;
        c1.pi = 3.1516;
        Double valorEsperado = 50.4256;

        //Act
        Double valorObtido = c1.calcularArea();

        //Assert
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void calculoPerimetroCirculo(){
        //Arrenge
        Circulo c1 = new Circulo();
        c1.raio = 4.0;
        c1.pi = 3.1416;
        Double valorEsperado = 25.1328;

        //Act
        Double valorObtido = c1.calcularPerimetro();

        //Assert
        assertEquals(valorEsperado, valorObtido);
    }
}
