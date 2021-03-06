package br.com.rd.exerciciospring.Repository;


import br.com.rd.exerciciospring.Model.Cupom;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {

    List<Cupom> findByIdClienteAndDtVenda (Long id_cliente, String dt_venda);
}


