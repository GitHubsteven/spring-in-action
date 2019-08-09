package com.demo.spring.api.rest.config;

import com.demo.spring.api.rest.utils.ServerPortUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 15:40 2019/8/9.
 */
public class StartCommand {
    private Logger logger = LoggerFactory.getLogger(StartCommand.class);

    public StartCommand(String[] args) {
        Boolean isServerPort = false;
        String serverPort = "";
        if (args != null) {
            for (String arg : args) {
                if (StringUtils.hasText(arg) &&
                        arg.startsWith("-- server.port")) {
                    isServerPort = true;
                    serverPort = arg;
                    break;
                }
            }
        }

        // 没有指定端口 ， 则随机生成一个可用的端口
        if (!isServerPort) {
            int port = ServerPortUtils.getAvailablePort();
            logger.info("current server.port=" + port);
            System.setProperty(" server.port", String.valueOf(port));
        } else {
            logger.info("current server.port=" + serverPort.split("=")[1]);
            System.setProperty("server.port", serverPort.split("=")[1]);
        }
    }
}