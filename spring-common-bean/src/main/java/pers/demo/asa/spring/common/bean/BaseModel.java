package pers.demo.asa.spring.common.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 16:06 2019/11/19.
 */
@Setter
@Getter
@Accessors(chain = true)
public class BaseModel<K> {
    private K id;
    private String creator;
}