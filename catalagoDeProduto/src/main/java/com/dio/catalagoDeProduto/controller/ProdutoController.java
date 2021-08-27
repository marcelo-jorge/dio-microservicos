package com.dio.catalagoDeProduto.controller;

import com.dio.catalagoDeProduto.model.Produto;
import com.dio.catalagoDeProduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto create(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @PutMapping
    public Produto update(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Produto> list() {
        return produtoRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public Optional<Produto> findById(@PathVariable("id") Integer id) {
        return produtoRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/nome/{nome}")
    public Iterable<Produto> findByName(@PathVariable("nome") String nome) {
        return produtoRepository.findByNome(nome);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        produtoRepository.deleteById(id);
    }

}