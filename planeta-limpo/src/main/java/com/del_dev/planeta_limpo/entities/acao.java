package com.del_dev.planeta_limpo.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_name")
public class acao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String descricaoTarefa;

    //analisando e aprimorando o projeto

}
