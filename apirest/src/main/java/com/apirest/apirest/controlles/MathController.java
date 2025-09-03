package com.apirest.apirest.controlles;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    //http://localhost:8080/math/aubtration/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public double sum(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo")String numberTwo
    ){
        return 10;
  }


}
