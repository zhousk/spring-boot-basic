package com.example.demo.controller;

import com.example.demo.domain.Version;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

    private static int getFibo(int i) {
        if (i == 1 || i == 2)
            return 1;
        else
            return getFibo(i - 1) + getFibo(i - 2);
    }

    @RequestMapping(path = "/{number}", method = RequestMethod.GET)
    public String getResult(@PathVariable int number) {
        return String.valueOf(getFibo(number));
    }
}
