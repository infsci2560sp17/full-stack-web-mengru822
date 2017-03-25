package edu.infsci2560.controllers;

import edu.infsci2560.models.Music;
import edu.infsci2560.repositories.MusicRepository;
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
public class MusicController {
    @Autowired
    private MusicRepository repository;
    
    @RequestMapping(value = "music", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("music", "music", repository.findAll());
    }
    
    @RequestMapping(value = "music/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Music music, BindingResult result) {
        repository.save(music);
        return new ModelAndView("music", "music", repository.findAll());
    }
    
}