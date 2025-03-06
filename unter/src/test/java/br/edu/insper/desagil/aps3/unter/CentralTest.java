package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;

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
    void setUp(){
        m = new Motorista("589.894.499.10","João");
        p = new Passageiro("395.951.779.38","Olaf");
        c = new Corrida(p);
    }

}
