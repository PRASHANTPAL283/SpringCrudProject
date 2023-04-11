package com.example.springcrudoperationsonjsondata.Services;

import com.example.springcrudoperationsonjsondata.Entities.JsonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class JsonDataServices {

    @Autowired
    public RestTemplate restTemplate;

    public static List<JsonEntity> mainList=new ArrayList<>();


    public List<JsonEntity> getalldata(){
        List<JsonEntity> jsonEntities=new ArrayList<>();
        jsonEntities=this.restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts",List.class);
        mainList.addAll(jsonEntities);
        return jsonEntities;
    }
    public JsonEntity postnewEntity(JsonEntity jsonEntity){
        mainList.add(jsonEntity);
        return jsonEntity;
    }

    public JsonEntity getEntityById(String id){
        JsonEntity jsonEntity=new JsonEntity();
        jsonEntity=mainList.stream().filter(val->val.getId().equalsIgnoreCase(id))
                .findFirst().get();
        return jsonEntity;
    }



}
