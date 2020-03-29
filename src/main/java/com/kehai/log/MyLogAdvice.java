package com.kehai.log;

import com.alibaba.fastjson.JSON;
import com.kehai.util.HttpContextUtils;
import com.kehai.util.IpUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Date;

@Aspect
@Component
public class MyLogAdvice {
      private Logger logger= Logger.getLogger(MyLogAdvice.class);

      @Pointcut("@annotation(com.kehai.log.MyLog)")
     public void myPointCut(){}

     @AfterReturning(pointcut = "myPointCut()")
    public void myAfterRet(JoinPoint joinPoint){
         MethodSignature signature = (MethodSignature) joinPoint.getSignature();
         final Method method = signature.getMethod();
         final MyLog annotation = method.getAnnotation(MyLog.class);

         String operation=null;

         if(annotation!=null){
             operation=annotation.value();
         }

         final String ipAddr = IpUtils.getIpAddr(HttpContextUtils.getHttpServletRequest());

         final Object[] args = joinPoint.getArgs();

         final String s = JSON.toJSONString(args);

         logger.error(new Date() +"|" +operation+"|"+ipAddr+"|"+s);
         logger.info(new Date() +"|" +operation+"|"+ipAddr+"|"+s);
     }
}
