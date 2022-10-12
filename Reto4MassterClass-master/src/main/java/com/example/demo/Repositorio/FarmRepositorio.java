/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Modelo.Farm;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.Interface.FarmInterface;

/**
 *
 * @author USUARIO
 */
@Repository

public class FarmRepositorio {
    @Autowired
    private FarmInterface farmCrudRepository;
    
      public List<Farm> getAll(){
        return (List<Farm>) farmCrudRepository.findAll();
    }
    
    public Optional<Farm> getFarm(int id){
        return farmCrudRepository.findById(id);
    }

    public Farm save(Farm farm){
        return farmCrudRepository.save(farm);
    }
    
     public void delete(Farm farm){
        farmCrudRepository.delete(farm);
    }
    
     
    
}
