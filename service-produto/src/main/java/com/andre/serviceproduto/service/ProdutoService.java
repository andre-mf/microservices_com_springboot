package com.andre.serviceproduto.service;

import com.andre.serviceproduto.model.Produto;

public interface ProdutoService {

    Produto save(Produto produto);

    Produto one(Long id);

    void delete(Long id);

    Produto update(Produto produto);
}