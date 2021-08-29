package com.dio.catalogoproduto.controller;

import com.dio.catalogoproduto.model.Produto;
import com.dio.catalogoproduto.repository.ProdutoRepository;
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

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        produtoRepository.deleteById(id);
    }

    @PutMapping
    public Produto update(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @GetMapping
    public Iterable<Produto> list() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Produto> findById(@PathVariable Integer id) {
        return produtoRepository.findById(id);
    }

    @GetMapping("/nome/{nome}")
    public Iterable<Produto> findByName(@PathVariable String nome) {
        return produtoRepository.findByNome(nome);
    }
}