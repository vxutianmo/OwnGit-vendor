package com.runhang.sell.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首次访问返回index.html前端页面
 * @author Administrator
 *
 */

@Controller
public class MainApi {

    @RequestMapping("/sell")
    public String showIndex() {
        return "/admin/index";
    }
}
