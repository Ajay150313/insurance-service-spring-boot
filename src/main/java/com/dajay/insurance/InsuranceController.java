package com.dajay.insurance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InsuranceController {


    @GetMapping("/insurance/{id}")
    public Boolean reportInsuranceToCustomer(@PathVariable("id") Integer id) {

        if (id == 101) {
            return true;
        }
        return false;
    }

    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }

}
