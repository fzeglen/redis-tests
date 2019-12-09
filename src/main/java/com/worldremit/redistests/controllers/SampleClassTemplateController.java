package com.worldremit.redistests.controllers;

import com.worldremit.redistests.data.SamplesClass;
import com.worldremit.redistests.services.SampleClassService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("template")
public class SampleClassTemplateController extends BaseTemplateController<SamplesClass, String> {

    public SampleClassTemplateController(SampleClassService service) {
        super(service);
    }
}
