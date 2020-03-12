package br.com.rd.exerciciospring.Model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity (name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long id_produto;

    @Column(name = "ds_produto")
    private String ds_produto;
}