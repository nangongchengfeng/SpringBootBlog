package com.lrm.web;

import com.lrm.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by limi on 2017/10/13.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
//        int i = 9/0;
//        String blog = null;
//        if (blog == null) {
//            throw  new NotFoundException("博客不存在");
//        }
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

}
