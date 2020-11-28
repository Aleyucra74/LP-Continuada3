package com.mycompany.lp.continuada3;

public abstract class Aluno {

    protected String nome;
    protected String escola;
    protected String materia;
    protected String professor;
    protected String tipo;
    protected String mensagem;

    public Aluno(String nome, String escola, String materia, String professor, String tipo) {
        this.nome = nome;
        this.escola = escola;
        this.materia = materia;
        this.professor = professor;
        this.tipo = tipo;
    }

    public Aluno(){};
    public abstract void message(String mensagem);
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
