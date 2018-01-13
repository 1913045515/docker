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
     * 测试docker打包运行是否成功
     * @param name
     * @return String
     */
    @ApiOperation(value="测试docker打包运行是否成功", notes="测试docker打包运行是否成功")
    @RequestMapping(value = "docker",method = RequestMethod.GET)
    @ResponseBody
    public String dockerTest(@ApiParam(value = "用户名称") String name){
        return name+"：创建docker容器并且运行SpringBoot的jar成功。";
    }

    /**
     * restful中post风格
     * @param name
     * @return String
     */
    @ApiOperation(value="restful中post风格", notes="restful中post风格")
    @RequestMapping(value = "docker",method = RequestMethod.POST)
    @ResponseBody
    public String saveTest(@ApiParam(value = "用户名称") String name){
        return name+"：restful中post风格。";
    }

    /**
     * restful中put风格
     * @param name
     * @return String
     */
    @ApiOperation(value="restful中put风格", notes="restful中put风格")
    @RequestMapping(value = "name",method = RequestMethod.PUT)
    @ResponseBody
    public String updateTest(@ApiParam(value = "用户名称") String name){
        return name+"：restful中put风格";
    }

    /**
     * restful中delete风格
     * @param name
     * @return String
     */
    @ApiOperation(value="restful中delete风格", notes="restful中delete风格")
    @RequestMapping(value = "name",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteTest(@ApiParam(value = "用户名称") String name){
        return name+"：restful中delete风格。";
    }
}
