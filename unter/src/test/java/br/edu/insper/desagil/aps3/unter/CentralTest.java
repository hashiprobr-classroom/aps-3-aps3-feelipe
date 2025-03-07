package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest {
    private static final double DELTA = 0.000001;
    private Motorista m;
    private Corrida c;
    private Passageiro p;


// Motoristas
//    m = new Motorista("589.894.499.10", "João");
//    m = new Motorista("301.567.888.22", "Maria");
//    m = new Motorista("412.789.654.33", "Carlos");
//    m = new Motorista("654.321.987.44", "Ana");
//    m = new Motorista("741.852.963.55", "Pedro");
//    m = new Motorista("963.852.741.66", "Beatriz");
//    m = new Motorista("159.753.258.77", "Fernando");
//    m = new Motorista("357.951.468.88", "Gabriela");
//    m = new Motorista("258.456.123.99", "Rafael");
//    m = new Motorista("123.987.654.00", "Larissa");
//
//Passageiros
//    p = new Passageiro("395.951.779.38", "Olaf");
//    p = new Passageiro("789.456.123.11", "Luiza");
//    p = new Passageiro("147.258.369.22", "Ricardo");
//    p = new Passageiro("258.369.147.33", "Camila");
//    p = new Passageiro("369.147.258.44", "Rodrigo");
//    p = new Passageiro("123.654.789.55", "Isabela");
//    p = new Passageiro("456.789.321.66", "Bruno");
//    p = new Passageiro("741.963.852.77", "Tatiane");
//    p = new Passageiro("852.741.963.88", "Leonardo");
//    p = new Passageiro("963.852.741.99", "Juliana");

    @BeforeEach
    void setUp() {
        p = new Passageiro("589.894.499.10", "João");
        m = new Motorista("395.951.779.38", "Olaf");
        c = new Corrida(p);
    }

    @Test
    void nenhumaAvaliacaoPassageiro() {
        Central central = new Central();
        double media = central.mediaPassageiro("589.894.499.10");
        assertEquals(0.0, media, DELTA);
    }

    @Test
    void nenhumaAvaliacaoMotorista() {
        Central central = new Central();
        double media = central.mediaMotorista("395.951.779.38");
        assertEquals(0.0, media, DELTA);
    }

    @Test
    void avaliacoesPassageiro() {
        Central central = new Central();
        Corrida c1 = new Corrida(p);

        Corrida c2 = new Corrida(p);
        c2.avaliaPassageiro(4);

        Corrida c3 = new Corrida(p);
        c3.avaliaPassageiro(5);

        Passageiro p2 = new Passageiro("789.456.123.11", "Luiza");

        Corrida c4 = new Corrida(p2);
        c4.avaliaPassageiro(3);

        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);
        central.adiciona(c4);


        double media = central.mediaPassageiro("589.894.499.10");
        assertEquals(4.5, media, DELTA);
    }

    @Test
    void avaliacoesMotorista() {
        Central central = new Central();

        Corrida c1 = new Corrida(p);
        c1.setMotorista(m);

        Corrida c2 = new Corrida(p);
        c2.setMotorista(m);
        c2.avaliaMotorista(2);

        Corrida c3 = new Corrida(p);
        c3.setMotorista(m);
        c3.avaliaMotorista(3);

        Motorista m2 = new Motorista("123.987.654.00", "Larissa");

        Corrida c4 = new Corrida(p);
        c4.setMotorista(m2);
        c4.avaliaMotorista(1);

        Corrida c5 = new Corrida(p);
        c5.avaliaMotorista(1);

        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);
        central.adiciona(c4);
        central.adiciona(c5);

        double media = central.mediaMotorista("395.951.779.38");
        assertEquals(2.5, media, DELTA);
    }

}
