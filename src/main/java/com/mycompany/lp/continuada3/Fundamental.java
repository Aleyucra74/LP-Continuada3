package com.mycompany.lp.continuada3;

public class Fundamental extends Aluno{

    public Fundamental(String nome, String escola, String materia, String professor, String tipo) {
        super(nome, escola, materia, professor, tipo);
    }

    public Fundamental(){};
    
    @Override
    public void message(String mensagem) {
        this.mensagem = mensagem;
        System.out.println(this.mensagem);
    }
    
}