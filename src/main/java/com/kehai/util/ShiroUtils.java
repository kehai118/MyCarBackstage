package com.kehai.util;

import com.kehai.pojo.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;

public class ShiroUtils {
    public static Session getSession(){return SecurityUtils.getSubject().getSession();}
    public static void setAtribute(String key,String v) {getSession().setAttribute(key,v);}
    public static Object getAttribute(String key){return getSession().getAttribute(key);}
    public static void setKaptcha(String code){setAtribute("kaptchaCode",code);}

    public static String getKaptcha(){return (String) getAttribute("kaptchaCode");}
    public static SysUser getUserEntity(){return (SysUser) SecurityUtils.getSubject().getPrincipal();}

    public static  void logout(){SecurityUtils.getSubject().logout();}

    public static long getUserId(){return getUserEntity().getUserId();}
}
