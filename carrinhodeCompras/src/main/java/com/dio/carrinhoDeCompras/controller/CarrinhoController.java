package com.dio.carrinhoDeCompras.controller;

import com.dio.carrinhoDeCompras.model.Carrinho;
import com.dio.carrinhoDeCompras.model.Item;
import com.dio.carrinhoDeCompras.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/carrinho")
public class CarrinhoController {

    private CarrinhoRepository carrinhoRepository;

    @Autowired
    public CarrinhoController(CarrinhoRepository carrinhoRepository) {
        this.carrinhoRepository = carrinhoRepository;
    }

    @PostMapping("/{id}")
    public Carrinho create(@PathVariable Integer id, @RequestBody Item item){
        Optional<Carrinho> carrinhoSalvo = carrinhoRepository.findById(id);
        Carrinho carrinho;
        if(carrinhoSalvo.equals(Optional.empty())){
            carrinho = new Carrinho(id);
        }else {
            carrinho = carrinhoSalvo.get();
        }
        carrinho.getItems().add(item);

        return carrinhoRepository.save(carrinho);
    }

    @GetMapping
    public Iterable<Carrinho> findAll(){
        return carrinhoRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        carrinhoRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Carrinho> findById(@PathVariable Integer id){
        return carrinhoRepository.findById(id);
    }

}
