/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.politico.projetopswaula0503;

/**
 *
 * @author Lucas Carvalho
 */
public class Aluno {

    public boolean situacao(double freq, double P1, double Trabalho, double ProjAula, double PF) {
        double media1 = 0.7 * ((P1 + Trabalho) / 2.0) + ProjAula * 0.3;
        boolean pf = false;
        boolean aprovado = false;

        if (freq >= 7.0) {
            if (media1 >= 7.0) {
                System.out.println("Aprovado");
                aprovado = true;
            } else if (media1 < 3.0) {
                System.out.println("Reprovado");
                aprovado = false;
            } else {
                pf = true;
            }

            if (pf == true) {
                if (((PF + media1) / 2.0) >= 5.0) {
                    System.out.println("Aprovado");
                    aprovado = true;
                } else {
                    System.out.println("Reprovado");
                    aprovado = false;
                }
            }
        } else {
            aprovado = false;
        }

        return aprovado;

    }

}
