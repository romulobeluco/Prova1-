package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Arena arena = new Arena("Coliseu","Roma");            //Criando a arena
Rapper []rappers=new Rapper[100];


        boolean flag=true;

        while(flag)
        {
            System.out.println("--------Menu-----------");
            System.out.println("Digite 1 se quer adicionar um rapper a arena");
            System.out.println("Digite 2 se quer mostrar as informações da arena e seus rappers");
            System.out.println("Digite 3 se quer mostrar quais rappers tem microfone dourado");
            System.out.println("Digite 4 se quer qual rapper ganhou a batalha e qual ficou em ultimo lugar");
            System.out.println("Digite 5 se quer sair do programa");
            int op= sc.nextInt();
            switch(op)
            {
                case 1:
                    System.out.println("Entre com o nome do Rapper:");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.println("Entre com a nota do Rapper (0 a 10):");
                    int nota = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Entre com a idade do rapper:");
                    int idade = sc.nextInt();
                    System.out.println("Entre com o material do rapper:(dourado,madeira,plastico)");
                    sc.nextLine();
                    String material = sc.nextLine();
                    Rapper rapper= new Rapper(nome,nota,idade,material);
                    arena.addRapper(rapper);
                    break;
                case 2:
                    arena.mostraInfo();     //chamando o metodo mostrainfo
                    break;


                case 3:
                    arena.microfoneDou();     //chamando o metodo microfone dourado
                    break;

                case 4:
arena.ranking();                          //chamando o metodo do ranking
                    break;

                case 5:
                    flag=false;
                    System.out.println("Voce saiu do programa");      //saindo do programa
                    break;

                    default:break;

            }
        }
    }
}