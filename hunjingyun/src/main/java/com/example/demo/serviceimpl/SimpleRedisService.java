package com.example.demo.serviceimpl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.disconf.JedisConfig;

/**
 * Created by zhengwei on 2018/1/5.
 */
@Service
public class SimpleRedisService implements InitializingBean, DisposableBean {


    @Autowired
    private JedisConfig jedisConfig;


    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("host=" + jedisConfig.getHost());
        System.out.println("port=" + jedisConfig.getPort());

    }


    public void changeJedis() {
        System.out.println("curr host=" + jedisConfig.getHost());
        System.out.println("curr port=" + jedisConfig.getPort());
    }
}
