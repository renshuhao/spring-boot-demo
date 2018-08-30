/*
 * Powered By [cfth]
 * Web Site: 财富天湖
 * Since 2018 - 2018
 */


package com.wealthlake.sb_demo.web.controller;

import com.wealthlake.sb_demo.common.web.controller.BaseController;
import com.wealthlake.sb_demo.core.service.UserService;
import com.wealthlake.sb_demo.dataaccess.domain.UserDO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @version 1.0
 * @since 1.0
 * Created by xxx on 2018/05/05
 */

@Api(value = "/user", tags = {"用户管理"})
@RequestMapping("/user")
@RestController
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据id查询用户信息", notes = "查询数据库中某个的用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
    })
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET, produces="application/json")
    public UserDO userinfo(@PathVariable(name = "id") Integer id){
        UserDO userDO = userService.findById(1);
        return userDO;
    }

}
