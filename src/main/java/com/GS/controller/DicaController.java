package com.GS.controller;

import com.GS.model.Dica;
import com.GS.service.DicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dicas")
public class DicaController {

    @Autowired
    private DicaService dicaService;

    @GetMapping
    public ResponseEntity<List<Dica>> listarTodas() {
        return ResponseEntity.ok(dicaService.listarTodas());
    }

    @PostMapping
    public ResponseEntity<Dica> salvar(@RequestBody Dica dica) {
        return ResponseEntity.ok(dicaService.salvar(dica));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        dicaService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
