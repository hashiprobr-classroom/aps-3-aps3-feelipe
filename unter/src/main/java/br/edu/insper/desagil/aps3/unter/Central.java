package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<Corrida> corridas;

    public Central(){
        this.corridas = new ArrayList<>();
    }

    public void adiciona(Corrida corrida){
        corridas.add(corrida);
    }

    public double mediaPassageiro(String cpfPassageiro){
        int soma = 0;
        int cont = 0;
        for (Corrida corrida : corridas){
            if (cpfPassageiro.equals(corrida.getPassageiro().getCpf()) && corrida.getNotaPassageiro() != 0){
                soma += corrida.getNotaPassageiro();
                cont +=1;
           }
        }
        if (cont != 0){
            return (double)soma/cont;
        } else {
            return 0.0;
        }
    }

    public double mediaMotorista(String cpfMotorista){
        int soma = 0;
        int cont = 0;
        for (Corrida corrida : corridas){
            if (cpfMotorista.equals(corrida.getMotorista().getCpf()) && corrida.getNotaMotorista() != 0){
                soma += corrida.getNotaMotorista();
                cont +=1;
            }
        }
        if (cont != 0){
            return (double)soma/cont;
        } else {
            return 0.0;
        }    }

}
