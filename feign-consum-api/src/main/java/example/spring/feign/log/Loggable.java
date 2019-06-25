package example.spring.feign.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 16:00 2019/6/25.
 */
public interface Loggable {
    Logger logger = LoggerFactory.getLogger(Loggable.class);
}