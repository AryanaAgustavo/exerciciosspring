package br.com.rd.exerciciospring.Controller;


import br.com.rd.exerciciospring.Model.Cupom;
import br.com.rd.exerciciospring.Repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CupomController {

    @Autowired
    CupomRepository repository;

    @GetMapping("/cupom/{idCliente}/{dtVenda}")
    public ResponseEntity<List<Cupom>> buscaIdAndDtVenda(@PathParam("idCliente") Long id_cliente, @PathParam("dtVenda") String dt_venda){

        List<Cupom> cupom = new ArrayList<>();

        if (id_cliente != null && dt_venda != null)
          cupom = repository.findByIdClienteAndDtVenda(id_cliente, dt_venda);

        if (id_cliente != null && dt_venda == null) //possível pesquisar só pelo id_cliente
            return ResponseEntity.ok().body(cupom);
        else
            return (ResponseEntity.badRequest().build());
    }
}