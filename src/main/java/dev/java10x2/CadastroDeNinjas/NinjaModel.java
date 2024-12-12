package dev.java10x2.CadastroDeNinjas;

import jakarta.persistence.*;

//Entity ele transforma uma classe em um entidade di BD
//JPA Java Persistence API
    @Entity
    @Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private String email;
    private int idade;
}
