package com.worldremit.redistests.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
public abstract class BaseController<T, ID> {

    private final CrudRepository<T, ID> repository;

    @GetMapping("/{id}")
    public T findById(@PathVariable ID id) {
        return this.repository.findById(id).get();
    }

    @PostMapping
    public T save(T object) {
        return repository.save(object);
    }

    @GetMapping
    public Iterable<T> findAll() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) {
        repository.deleteById(id);
    }


}
