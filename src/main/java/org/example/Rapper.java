package org.example;

public class Rapper {

    String nome;
    float nota;
    int idade;
    Microfone microfone;

    public Rapper(String nome, float nota, int idade,String material) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        microfone= new Microfone(material);
    }

    void mostraInfo()
    {
        System.out.println("Nome do rapper: "+nome);
        System.out.println("Nota do rapper: "+nota);
        System.out.println("Idade do rapper: "+idade);
        System.out.println("Material do microfone "+microfone.material);

    }


}
