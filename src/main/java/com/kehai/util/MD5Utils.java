package com.kehai.util;

import org.apache.shiro.crypto.hash.SimpleHash;

public class MD5Utils {
    /**
     * MD5加密的算法
     */
    public static String md5(String text,String slat,int number){
        SimpleHash md5=new SimpleHash(
                "MD5",//加密算法
                 text,//要加密的用户密码
                slat,
                number //加密次数
        );
        return String.valueOf(md5);
    }
}
