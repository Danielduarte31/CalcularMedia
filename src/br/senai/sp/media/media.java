package br.senai.sp.media;

import org.w3c.dom.css.CSSMediaRule;

import java.util.Scanner;

public class media {
    public static void main(String[] args){
        /**scanner*/
        Scanner teclado = new Scanner(System.in);
        System.out.println("boa tarde,qual a sua  frequencia");
        int frequencia = teclado.nextInt();
        System.out.println("qual sua nota 1?");
        int nota1 = teclado.nextInt();
        System.out.println("qual é a nota 2?");
        int nota2 = teclado.nextInt();

        float media = (nota1 + nota2 / 2);

            if (media >= 7 && frequencia >=75 || media <= 6 && frequencia >= 90 ) {
                System.out.println("Voce foi aprovado");
            }else {
                System.out.println("voce foi reaprovado");
            }


    }                                                                                                  
}
