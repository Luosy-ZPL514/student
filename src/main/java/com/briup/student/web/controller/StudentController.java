package com.briup.student.web.controller;

import com.briup.student.Util.Message;
import com.briup.student.Util.MessageUtil;
import com.briup.student.bean.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Api(description = "学生控制器")
public class StudentController {

    @PostMapping("/add")
    @ApiOperation(value = "添加学生")
    public Message add(Student student) {
        return MessageUtil.success("添加学生成功");
    }

    @GetMapping("/delete")
    @ApiOperation(value = "删除学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stuId", value = "学号", paramType = "query", dataType = "int", required = true),
            @ApiImplicitParam(name = "name", value = "学生姓名", paramType = "query", dataType = "String")
    })
    public Message delete(int stuId, String name) {
        return MessageUtil.success("删除学生成功");
    }

}
