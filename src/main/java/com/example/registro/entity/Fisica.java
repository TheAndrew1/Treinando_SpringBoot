package com.example.registro.entity;

public class Fisica extends Pessoa{
    private String cpf;

    public Fisica(String name, int age, String birth, String cpf){
        super(name, age, birth);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
