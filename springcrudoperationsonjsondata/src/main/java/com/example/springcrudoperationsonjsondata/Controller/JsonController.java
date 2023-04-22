package com.example.springcrudoperationsonjsondata.Controller;

import com.example.springcrudoperationsonjsondata.Entities.JsonEntity;
import com.example.springcrudoperationsonjsondata.Services.JsonDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JsonController {

    @Autowired
    public JsonDataServices jsonDataServices;

    @GetMapping("/all")
    public List<JsonEntity> getalldata(){
        return this.jsonDataServices.getalldata();
    }
    @GetMapping("/all/{id}")
    public JsonEntity getById(@PathVariable("id") String id){
        return this.jsonDataServices.getEntityById(id);
    }
    @PostMapping("/add")
    public JsonEntity addnewData(@RequestBody JsonEntity jsonEntity){
        return this.jsonDataServices.postnewEntity(jsonEntity);
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") String id){
        return  this.jsonDataServices.deleteDataById(id);
    }

    @GetMapping("/hello")
    public String getthello(){
        return "hello java";
    }
    //changes to commited now
}
