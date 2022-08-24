package com.andre.serviceproduto.http.data.request;

import javax.persistence.Column;
import java.math.BigDecimal;

public class ProdutoPersistDto {

    private String descricao;

    private BigDecimal valor;

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
