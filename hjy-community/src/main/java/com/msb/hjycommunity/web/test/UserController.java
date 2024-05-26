package com.msb.hjycommunity.web.test;

import com.msb.hjycommunity.common.core.domain.BaseResponse;
import com.msb.hjycommunity.common.core.exception.BaseException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("queryUserById")
    public BaseResponse<User> queryUserById( String id){
        if (id!=null){
            BaseResponse<User> success = BaseResponse.success(new User(id, "fafa"));
            System.out.println(success);
            return success;
        }else{
            return BaseResponse.fail("查询用户信息失败");
        }

    }
    @RequestMapping("addUser")
    public BaseResponse addUser(@Validated User user, BindingResult bindingResult){
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        //如果参数校验失败，会将错误信息封装成对象组装在BindingResult
        if (!fieldErrors.isEmpty()){
            return BaseResponse.fail(fieldErrors.get(0).getDefaultMessage());
        }
        return BaseResponse.success("ok");
    }
    @RequestMapping("queryUser")
    public BaseResponse queryUser(User user){
        System.out.println("测试异常类");
        //模拟查询失败抛出异常
        throw new BaseException("500","测试异常类");
    }
}
