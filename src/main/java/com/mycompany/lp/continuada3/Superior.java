package com.mycompany.lp.continuada3;

public class Superior extends Aluno{

    public Superior(String nome, String escola, String materia, String professor, String tipo) {
        super(nome, escola, materia, professor, tipo);
    }

    @Override
    public void message(String mensagem) {
        this.mensagem = mensagem;
        System.out.println(this.mensagem);
    }

}