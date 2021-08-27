package com.dio.catalagoDeProduto.repository;

import com.dio.catalagoDeProduto.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
