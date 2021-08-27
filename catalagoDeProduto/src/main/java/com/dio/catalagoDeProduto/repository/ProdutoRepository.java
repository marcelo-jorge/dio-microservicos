package com.dio.catalagoDeProduto.repository;

import com.dio.catalagoDeProduto.model.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
    List<Produto> findByName(String name);
}
