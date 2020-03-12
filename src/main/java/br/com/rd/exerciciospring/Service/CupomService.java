package br.com.rd.exerciciospring.Service;


import br.com.rd.exerciciospring.Model.Cupom;
import br.com.rd.exerciciospring.Model.CupomDTO;
import br.com.rd.exerciciospring.Repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service("CupomService")

public class CupomService {

    @Autowired
    CupomRepository repository;


    public ResponseEntity buscar(CupomDTO cupomDTO) {
        List<Cupom> lista = new ArrayList<>();
            Cupom infoCupom = new Cupom();
            infoCupom.setId_cliente(infoCupom.getId_cliente());
            infoCupom.setDt_venda(infoCupom.getDt_venda());

            lista.add(infoCupom);
    }
}
