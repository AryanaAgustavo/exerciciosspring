package br.com.rd.exerciciospring.Model;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity(name = "tb_cupom")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom")
    private Long id_cupom;

    @Column(name = "id_cliente")
    private Long id_cliente;

    @Column(name = "dt_venda")
    private String dt_venda;

    @Column(name = "vl_venda")
    private BigDecimal vl_venda;
}
