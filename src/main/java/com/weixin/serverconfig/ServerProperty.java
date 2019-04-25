package com.weixin.serverconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Date: 2019-04-24
 * @Author: wyy
 */
@Component
@ConfigurationProperties(prefix = "weixin.serverproperty")
public class ServerProperty {

    private String token;

    public String getToken() {
        return token;
    }

    public ServerProperty setToken(String token) {
        this.token = token;
        return this;
    }

    @Override
    public String toString() {
        return "ServerProperty{" +
                "token='" + token + '\'' +
                '}';
    }
}
