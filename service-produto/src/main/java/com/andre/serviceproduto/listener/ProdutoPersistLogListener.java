package com.andre.serviceproduto.listener;

import com.andre.serviceproduto.event.ProdutoPersistEvent;
import com.andre.serviceproduto.model.Produto;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ProdutoPersistLogListener implements ApplicationListener<ProdutoPersistEvent> {

    @Override
    public void onApplicationEvent(ProdutoPersistEvent event) {
        Produto produto = event.getProduto();
        System.out.println(produto.getDescricao());
    }
}
