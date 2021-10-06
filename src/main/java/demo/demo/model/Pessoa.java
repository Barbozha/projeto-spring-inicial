package demo.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nome;
    String sobreNome;

    public Pessoa() {
    }

    public Pessoa(long id, String nome, String sobreNome) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return this.sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.nome = sobreNome;
    }

}
