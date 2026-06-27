package br.com.cotiinformatica.api_assinaturas.domain.dtos.responses;

import br.com.cotiinformatica.api_assinaturas.domain.entities.Cliente;
import br.com.cotiinformatica.api_assinaturas.domain.entities.Plano;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public record AssinaturaResponse(
        Long id,
        String dataAssintura,
        Double valor,
        Boolean status,
        ClienteResponse cliente,
        PlanoResponse plano
) {
}
