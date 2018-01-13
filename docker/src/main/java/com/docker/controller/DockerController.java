package com.docker.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * dokcer打包成jar测试控制类
 * Created by qiang on 2018/1/13.
 */

@Controller
@RequestMapping("api")
public class DockerController {

    /**
     * 创建用户
     * @param name
     * @return String
     */
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @RequestMapping(value = "src/main/docker",method = RequestMethod.GET)
    @ResponseBody
    public String dockerTest(@ApiParam(value = "用户名称") String name){
        return name+"：创建docker容器并且运行SpringBoot的jar成功。";
    }
}
