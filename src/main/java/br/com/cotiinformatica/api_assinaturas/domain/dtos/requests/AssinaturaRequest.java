package br.com.cotiinformatica.api_assinaturas.domain.dtos.requests;

import java.math.BigDecimal;

public record AssinaturaRequest(
        Integer PlanoId,
        Integer ClienteId
) {
}
