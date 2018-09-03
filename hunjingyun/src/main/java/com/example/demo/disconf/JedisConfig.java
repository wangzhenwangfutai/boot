package com.example.demo.disconf;

import org.springframework.stereotype.Service;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;

@Service
@DisconfFile(filename = "redis.properties")
@DisconfUpdateService(classes = {JedisConfig.class})
public class JedisConfig implements IDisconfUpdate {

    // 代表连接地址
    private String host;

    // 代表连接port
    private int port;

    @DisconfFileItem(name = "redis.host", associateField = "host")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @DisconfFileItem(name = "redis.port", associateField = "port")
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        int old = this.port;
        this.port = port;
        System.out.println("old=" + old + ", new=" + port);
    }

    @Override
    public void reload() throws Exception {
        System.out.println("curr host=" + this.host);
        System.out.println("curr port=" + this.port);
    }
}
