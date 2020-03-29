package com.kehai.exception;

import com.kehai.util.R;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class RExceptionHandler {

    @ExceptionHandler(RException.class)
    @ResponseBody
    public R rExp(RException exception){
        final R r = new R();
        r.put("code",500);
        r.put("msg",exception.getMsg());
        return r;
    }

    //@ExceptionHandler(Exception.class)
    @ResponseBody
    public R allExp(Exception exception){
        final R r = new R();
        r.put("code",500);
        r.put("msg","系统内部异常，请联系管理员");
        return r;
    }

    @ExceptionHandler(AuthorizationException.class)
    public String authorExp(AuthorizationException e){
        return "redirect:unauthorized.html";
    }
}
