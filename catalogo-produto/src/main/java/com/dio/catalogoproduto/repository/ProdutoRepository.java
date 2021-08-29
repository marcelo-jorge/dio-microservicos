package com.dio.catalogoproduto.repository;

import com.dio.catalogoproduto.model.Produto;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface ProdutoRepository extends ElasticsearchRepository<Produto, Integer> {
    List<Produto> findByNome(String nome);
}
