package org.ikwattro.sandbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SimpleController {

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello";
    }

    @PostMapping(path = "/api/analyze")
    @ResponseBody
    public AnalyzeRequest analyze(@RequestBody AnalyzeRequest request) {
        return request;
    }

}
