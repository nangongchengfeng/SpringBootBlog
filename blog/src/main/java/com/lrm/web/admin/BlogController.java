package com.lrm.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by limi on 2017/10/15.
 */
@Controller
@RequestMapping("/admin")
public class BlogController {

    @GetMapping("/blogs")
    public String blogs() {
        return "admin/blogs";
    }
}
