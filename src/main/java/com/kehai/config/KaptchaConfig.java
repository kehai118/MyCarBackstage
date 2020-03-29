package com.kehai.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;


//验证码
@Configuration
public class KaptchaConfig {
    @Bean(name="kaptcha")
    public DefaultKaptcha kaptcha(){
        final DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        final Properties properties = new Properties();

        properties.setProperty("kaptcha.border","no");
        properties.setProperty("kaptcha.textproduce.char.length","4");
        properties.setProperty("kaptcha.textproducer.font.color","black");

        Config config =new Config(properties);
        defaultKaptcha.setConfig(config);

        return defaultKaptcha;
    }
}
