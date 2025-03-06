package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {
    private static final double DELTA = 0.000001;
    private Motorista m;
    private Corrida c;

    @BeforeEach
    void setUp(){
        m = new Motorista("589.894.499.10","João");
        Passageiro p = new Passageiro("395.951.779.38","Olaf");
        c = new Corrida(p);
    }

    @Test
    void constroi(){
        assertEquals("589.894.499.10",m.getCpf());
        assertEquals("João",m.getNome());
    }

    @Test
    void mudaNome(){
        m.setNome("Marcelo");
        assertEquals("Marcelo",m.getNome());
    }

    @Test
    void avalia(){
        c.avaliaPassageiro(3);
        assertEquals(3,c.getNotaPassageiro(),DELTA);
    }

    @Test
    void avaliaBaixo(){
        c.avaliaPassageiro(0);
        assertEquals(1,c.getNotaPassageiro(),DELTA);
    }

    @Test
    void avaliaAlto(){
        c.avaliaPassageiro(6);
        assertEquals(5,c.getNotaPassageiro(),DELTA);
    }

}
