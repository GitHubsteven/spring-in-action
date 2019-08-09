package com.demo.spring.api.rest.utils;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 15:50 2019/8/9.
 */
public class NetUtils {
    private static void bindPort(String host, int port) throws Exception {
        Socket s = new Socket();
        s.bind(new InetSocketAddress(host, port));
        s.close();
    }

    public static boolean isPortAvailable(int port) {
        Socket s = new Socket();
        try {
            bindPort("0.0.0.0", port);
            bindPort(InetAddress.getLocalHost().getHostAddress(), port);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isLoclePortUsing(int port) {
        return !isPortAvailable(port);
    }
}