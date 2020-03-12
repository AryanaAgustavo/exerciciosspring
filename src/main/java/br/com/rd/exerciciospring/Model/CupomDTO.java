package br.com.rd.exerciciospring.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CupomDTO {

    private Long id_cupom;
    private Long id_cliente;
    private String dt_venda;
    private BigDecimal vl_venda;
}
