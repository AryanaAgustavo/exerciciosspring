package br.com.rd.exerciciospring.Model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity(name = "tb_cupom_item")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom_item")
    private Long id_cupom_item;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cupom")
    private Long id_cupom;

    @Column(name = "id_produto")
    private Long id_produto;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "qt_produto")
    private Long qt_produto;

    @Column(name = "vl_produto")
    private BigDecimal vl_produto;

}
