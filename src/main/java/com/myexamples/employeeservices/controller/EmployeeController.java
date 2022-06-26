package com.myexamples.employeeservices.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

    @RequestMapping(value = "/employees" ,method = RequestMethod.GET)
    public String getEmployee(){

        return "Hello Emp";
    }

    @RequestMapping(value = "/employees" ,method = RequestMethod.POST)
    public ResponseEntity<String> saveEmployees(@RequestBody String body){

        System.out.println(body);
        return new ResponseEntity("Successfully saved data", HttpStatus.CREATED);
    }



}

