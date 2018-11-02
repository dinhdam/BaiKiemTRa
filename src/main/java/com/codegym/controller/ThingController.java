package com.codegym.controller;

import com.codegym.model.Thing;
import com.codegym.service.ThingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ThingController {
@GetMapping("/create-thing")
    public ModelAndView showcrearThing(){
 ModelAndView modelAndView = new ModelAndView("/thing/create");
 modelAndView.addObject("thing",new Thing());
 return modelAndView;
}
@PostMapping("/create-thing")
    public ModelAndView saveThing(){
    ModelAndView modelAndView = new ModelAndView("/thing/create");
    modelAndView.addObject("thing",new Thing());
    modelAndView.addObject("message","new thing create successful");
    return modelAndView;

}
@GetMapping("things")
    public ModelAndView listThing(){
    List<Thing>things = ThingService.findAll();
    ModelAndView modelAndView = new ModelAndView("/thing/list");
    modelAndView.addObject("thing",things);
    return modelAndView;

}


}
