package com.worldremit.redistests.controllers;

import com.worldremit.redistests.data.SamplesClass;
import com.worldremit.redistests.repositories.SampleClassRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class SamplesClassController extends BaseController<SamplesClass,String> {

    public SamplesClassController(SampleClassRepository repository) {
        super(repository);
    }
}
