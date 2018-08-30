package com.wealthlake.sb_demo.web.controller;

import com.wealthlake.sb_demo.dataaccess.domain.UserDO;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Rsh
 *
 * @author rsh
 * @Description
 * @Date: 2018/8/28
 * @Time: 15:55
 */

@RequestMapping("/demo")
@Controller
public class DemoController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}
