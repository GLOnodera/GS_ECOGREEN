package com.GS.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Dica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título da dica é obrigatório.")
    private String titulo;

    @NotBlank(message = "A descrição da dica é obrigatória.")
    private String descricao;

    private boolean salva; // Indica se a dica foi salva nos favoritos
}
