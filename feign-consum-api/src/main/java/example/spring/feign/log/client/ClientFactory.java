package example.spring.feign.log.client;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.ribbon.RibbonClient;
import feign.slf4j.Slf4jLogger;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 16:17 2019/6/25.
 */
public class ClientFactory {

    public static BookClient getBookClient() {
        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(BookClient.class))
                .logLevel(Logger.Level.FULL)
                .target(BookClient.class, "http://localhost:8081/api/books");
    }

    public static BookClient getRibbonBookClient() {
        return Feign.builder()
                .client(RibbonClient.create())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(BookClient.class))
                .logLevel(Logger.Level.FULL)
                .target(BookClient.class, "http://localhost:8081/api/books");
    }
}