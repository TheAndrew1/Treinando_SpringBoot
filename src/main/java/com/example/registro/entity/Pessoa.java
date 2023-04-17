package com.example.registro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pessoas", schema = "public")
public class Pessoa extends AbstractClass implements Acoes{
    @Getter @Setter
    @Column(name = "nome", nullable = false, length = 50)
    private String name;
    @Getter @Setter
    @Column(name = "idade", nullable = false)
    private int age;
    @Getter @Setter
    @Column(name = "gosta", nullable = false, length = 200)
    private List<String> likes;
    @Getter @Setter
    @Column(name = "nascimento", nullable = false)
    private String birth;

    public Pessoa(String name, int age, String birth){
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.setCreationDate(LocalDateTime.now());
        this.setActive(true);
    }

    @Override
    public String walk(){
        return "ANDANDO";
    }
    @Override
    public String stop(){
        return "PARANDO";
    }

    @Override
    public String eat(String food) {
        return ("COMENDO " + food.toUpperCase());
    }

    @Override
    public void birthday() {
        age++;
    }
}
