package com.GS.service;

import com.GS.model.Dica;
import com.GS.repository.DicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicaService {

    @Autowired
    private DicaRepository dicaRepository;

    public List<Dica> listarTodas() {
        return dicaRepository.findAll();
    }

    public Dica salvar(Dica dica) {
        return dicaRepository.save(dica);
    }

    public void excluir(Long id) {
        dicaRepository.deleteById(id);
    }
}
