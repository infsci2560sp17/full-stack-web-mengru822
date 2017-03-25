package edu.infsci2560.controllers;

import edu.infsci2560.models.Good;
import edu.infsci2560.repositories.GoodRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mengru
 */
@Controller
public class GoodController {
    @Autowired
    private GoodRepository repository;
    
    @RequestMapping(value = "good", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("good", "good", repository.findAll());
    }
    
    @RequestMapping(value = "good/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Good good, BindingResult result) {
        repository.save(good);
        return new ModelAndView("good", "good", repository.findAll());
    }
}

    