/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.pruebaZZ.repositories;

import com.heroku.pruebaZZ.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface PersonasRepository extends JpaRepository<Persona, Integer> {
    
}
