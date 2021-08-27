package com.dio.catalagoDeProduto.controller;

import com.dio.catalagoDeProduto.model.Produto;
import com.dio.catalagoDeProduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Produto create(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

}
