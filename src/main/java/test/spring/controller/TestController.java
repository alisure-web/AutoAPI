package test.spring.controller;

import com.wordnik.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import test.spring.entity.Result;
import test.spring.entity.TestEntity;
import test.spring.service.TestService;

/**
 * Created by ALISURE on 2017/3/17.
 */
@Controller
@RequestMapping("/test")
@Api(value = "/test",description = "测试Swagger自动生产API文档")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value="all",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="获取全部的数据",httpMethod="GET",
            response = Result.class,notes = "这是我的第一个自动化API",nickname = "ALISURE")
    public Result getEntity(){
        System.out.println("get all........");
        return new Result("1",testService.getAllTestEntity());
    }

    @RequestMapping(value="name/{name}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="根据用户名获取该用户的数据",httpMethod="GET",
            response = TestEntity.class,notes = "这是我的第一个自动化API",nickname = "ALISURE")
    public TestEntity getEntityByName(
            @ApiParam(required = true,name = "name",value = "用户名") @PathVariable String name){
        System.out.println("get "+name+"........");
        return new TestEntity(name,name.length() * 2,name.length() /2);
    }
}
