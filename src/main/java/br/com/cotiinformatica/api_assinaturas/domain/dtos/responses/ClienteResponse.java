package br.com.cotiinformatica.api_assinaturas.domain.dtos.responses;

import java.time.LocalDate;

public record ClienteResponse(
    Integer id,
    String nome,
    String email,
    String cpf
) {
}
