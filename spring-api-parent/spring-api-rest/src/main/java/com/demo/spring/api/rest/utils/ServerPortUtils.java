package com.demo.spring.api.rest.utils;

import java.util.Random;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 15:42 2019/8/9.
 */
public class ServerPortUtils {
    public static int getAvailablePort() {
        int max = 65535;
        int min = 2000;
        Random random = new Random();
        int port = random.nextInt(max) % (max - min + 1) + min;
        boolean using = NetUtils.isLoclePortUsing(port);
        if (using) {
            return getAvailablePort();
        } else {
            return port;
        }
    }

}