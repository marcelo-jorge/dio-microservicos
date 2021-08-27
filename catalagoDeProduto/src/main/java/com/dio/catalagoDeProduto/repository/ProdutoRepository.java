package com.dio.catalagoDeProduto.repository;

import com.dio.catalagoDeProduto.model.Produto;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


import java.util.List;


public interface ProdutoRepository extends ElasticsearchRepository<Produto, Integer> {
    List<Produto> findByNome(String nome);
}
