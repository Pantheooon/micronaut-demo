package com.pmj;

import io.micronaut.http.annotation.*;

@Controller("/micronautDemo")
public class MicronautDemoController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}