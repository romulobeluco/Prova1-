package org.example;

public class Arena {

    String nome;
    String lugar;
    Rapper [] rappers = new Rapper[10];

    public Arena(String nome, String lugar) {
        this.nome = nome;
        this.lugar = lugar;
    }

    void addRapper(Rapper r)    //adicionando rapper
    {
for(int i=0;i<rappers.length;i++)
{
    if(rappers[i]==null){
        rappers[i]=r;
        System.out.println("Rapper adicionado com sucesso");
        break;

    }
}
    }

void mostraInfo()                 //mostrando as informações dos rappers e da arena
{
    System.out.println("Arena: "+nome);
    System.out.println("Localização: "+lugar);
    System.out.println("------Informações dos rappers-------");

    for(int i=0; i<rappers.length;i++)
    {
        if(rappers[i]!= null)
        {
            rappers[i].mostraInfo();
        }
    }


}
void microfoneDou(){                                //calculo de quantas pessoas tem o microfone dourado
        int cont=0;
        for (int i=0;i<rappers.length;i++)
        {
            if(rappers[i]!=null)
            {
                if(rappers[i].microfone.material.equals("dourado"))
                {
                    cont++;
                }
            }

        }

    System.out.println("A quantidade de rappers com microfone dourado é de "+ cont +" pessoas");

    }

    void ranking(){                                    //logica do ranking
        float maior=rappers[0].nota;
        int aux=0;
        float menor=rappers[0].nota;
        int x=0;
        for (int i=0;i<rappers.length;i++)
        {
            if(rappers[i]!=null)
            {
                if(maior<rappers[i].nota)
                {
                    maior=rappers[i].nota;
                    aux=i;
                }

                if(menor>rappers[i].nota){
                    menor=rappers[i].nota;
                    x=i;
                }
            }



        }
        System.out.println("O ganhador da batalha foi o "+rappers[aux].nome);
        System.out.println("A menor nota da batalha foi do "+rappers[x].nome);
    }



}
