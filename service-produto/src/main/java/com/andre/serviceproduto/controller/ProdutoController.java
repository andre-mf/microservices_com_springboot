package com.andre.serviceproduto.controller;

import com.andre.serviceproduto.http.data.request.ProdutoPersistDto;
import com.andre.serviceproduto.http.data.response.ProdutoResponseDto;
import com.andre.serviceproduto.model.Produto;
import com.andre.serviceproduto.service.ProdutoServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    private final ProdutoServiceImpl produtoService;

    public ProdutoController(ProdutoServiceImpl produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ProdutoResponseDto inserir(@RequestBody ProdutoPersistDto dto) {
        Produto produto = new Produto(dto.getDescricao(), dto.getValor());
        Produto produtoPersistido = produtoService.inserir(produto);
        return new ProdutoResponseDto(produtoPersistido.getId(), produtoPersistido.getDescricao());
    }
}
