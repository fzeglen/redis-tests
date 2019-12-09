package com.worldremit.redistests.controllers;

import com.worldremit.redistests.data.IdHolder;
import com.worldremit.redistests.services.BaseTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("sample-template")
public abstract class BaseTemplateController<T extends IdHolder<ID>, ID> {

    private final BaseTemplateService<T, ID> service;

    @GetMapping("/{id}")
    public Object findById(@PathVariable ID id) {
        return service.findById(id);
    }

    @GetMapping
    public Object findAll() {
        return service.findAll();
    }

    @PostMapping
    public Object save(@RequestBody T object) {
        return service.save(object);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) {
        service.delete(id);
    }
}
