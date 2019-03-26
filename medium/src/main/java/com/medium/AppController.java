package com.medium;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.lang.RuntimeException;
import org.springframework.hateoas.Resource;

@RestController
public class AppController {
    @Autowired
    private AppService service;

    @Autowired
    private AppModelResourceAssembler assembler;

    @GetMapping(path ="/")
    public Resource<AppModel> get() {
        AppModel model = service.findById(1L).orElseThrow(()-> new RuntimeException("Not found"));
        return assembler.toResource(model);
    }
}
