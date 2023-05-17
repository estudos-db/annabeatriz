package com.example.livraria.dto;

import com.example.livraria.model.Autor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LivroDto {
    @NotBlank
    private String nome;
    @NotEmpty
    private List<Autor> autores;
    @NotNull
    private Integer isbn;
    @NotNull
    private LocalDate dataDePublicacao;
    private boolean isAlugado;
}