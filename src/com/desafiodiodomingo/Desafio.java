package com.desafiodiodomingo;

import java.io.IOException;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) throws IOException{ //throws IOException - ignora os erros
        Scanner leitor = new Scanner(System.in); //objeto crisado que lê os dados do teclado

        try {  //trata os erros se forem digitados valores inválidos

            while (true) {
                String[] relogio = leitor.nextLine().split(":");

                int hora = Integer.parseInt(relogio[0]);
                int min = Integer.parseInt(relogio[1]);

                if (hora == 9 && min > 0){

                    System.out.println("O horário de saída deve ser até as 9:00");
                    min = 0;
                }

                switch (hora) {
                    case (7):
                        System.out.println("Atraso maximo: " + min);
                        break;
                    case (8):
                        System.out.println("Atraso maximo: " + ((hora - 7) * 60 + min));
                        break;
                    case (9):
                        System.out.println("Atraso maximo: " + ((hora - 7) * 60));
                        break;
                    default:
                        System.out.println("Atraso maximo: " + 0);
                }
            }
        }catch (Exception e) {
            System.out.println("Digite um número no formato de horas. Exemplo: 08:00");
        }
    }
}
