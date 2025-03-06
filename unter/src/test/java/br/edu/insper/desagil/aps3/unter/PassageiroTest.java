package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PassageiroTest {
    private static final double DELTA = 0.000001;
    private Passageiro p;
    private Corrida c;

    @BeforeEach
    void setUp(){
        p = new Passageiro("589.894.499.10","João");
        c = new Corrida(p);
    }

    @Test
    void constroi(){
        assertEquals("589.894.499.10",p.getCpf());
        assertEquals("João",p.getNome());
    }

    @Test
    void mudaNome(){
        p.setNome("Marcelo");
        assertEquals("Marcelo",p.getNome());
    }

    @Test
    void avalia(){
        c.avaliaMotorista(3);
        assertEquals(3,c.getNotaMotorista(),DELTA);
    }

    @Test
    void avaliaBaixo(){
        c.avaliaMotorista(0);
        assertEquals(1,c.getNotaMotorista(),DELTA);
    }

    @Test
    void avaliaAlto(){
        c.avaliaMotorista(6);
        assertEquals(5,c.getNotaMotorista(),DELTA);
    }
}
