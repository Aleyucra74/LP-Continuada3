package com.mycompany.lp.continuada3;

public class Medio extends Aluno{

    public Medio(String nome, String escola, String materia, String professor, String tipo) {
        super(nome, escola, materia, professor, tipo);
    }

    @Override
    public void message(String mensagem) {
        this.mensagem = mensagem;
        System.out.println(this.mensagem);
    }
    
}