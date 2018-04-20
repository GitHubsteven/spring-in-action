package com.spring.tutorial.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 14:36 2018/4/20.
 */
@CrossOrigin(maxAge = 3600)
@Controller
@RequestMapping(value = "/spring-case/student")
public class StudentController {
//    private String JSESSIONID= "418AB76CD83EF94U85YD34W";

    @RequestMapping(value = "/get-student", method = RequestMethod.GET)
    public void getStudent(@RequestBody Long id) {
    }

    /**
     * This annotation is used both at class and method level to enable cross origin requests.
     * In many cases the host that serves JavaScript will be different from the host that serves the data.
     * In such a case Cross Origin Resource Sharing (CORS) enables cross-domain communication.
     * To enable this communication you just need to add the @CrossOrigin annotation.
     */
    @CrossOrigin(maxAge = 1000)
    @RequestMapping("/cookieValue")
    public void getCookieValue(@CookieValue("JSESSIONID") String cookie) {
    }

    /**
     * This annotation is used for mapping HTTP GET requests onto specific handler methods.
     *
     * @GetMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET)
     */
    @GetMapping("/get-report")
    public void getReport() { }

    /**
     * Composed @RequestMapping Variants
     * Spring framework 4.3 introduced the following method-level variants of @RequestMapping annotation to better express the semantics of the annotated methods.
     * Using these annotations have become the standard ways of defining the endpoints.
     * They act as wrapper to @RequestMapping.
     * <p>
     * These annotations can be used with Spring MVC and Spring WebFlux.
     */
    @RequestMapping(value = "", method = RequestMethod.TRACE)
    public void recRequest() { }


}
