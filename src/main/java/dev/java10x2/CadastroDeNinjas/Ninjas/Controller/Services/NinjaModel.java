package dev.java10x2.CadastroDeNinjas.Ninjas.Controller.Services;

import dev.java10x2.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity ele transforma uma classe em um entidade di BD
//JPA Java Persistence API
    @Entity
    @Table(name = "tb_cadastro")
    @NoArgsConstructor
    @AllArgsConstructor
    @Data

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long Id;

    @Column (name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;
    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "idade")
    private int idade;


    // @ManyToOne um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key ou chave estrangeira
    private List<MissoesModel> missoes;



}


