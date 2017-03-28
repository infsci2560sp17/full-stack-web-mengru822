/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Dance;
import edu.infsci2560.repositories.DanceRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mengru
 */
@Controller
public class DanceEditController {
    @Autowired
    private DanceRepository repository;
    
    @RequestMapping(value = "dance/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) { 
        Dance dance = repository.findOne(id);
        return new ModelAndView("danceEdit", "dance", dance);
    }
    
    @RequestMapping(value = "dance/edit/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public String update( @Valid Dance dance, BindingResult result) {
        repository.save(dance);
        return "redirect:/dance";
    }        
}