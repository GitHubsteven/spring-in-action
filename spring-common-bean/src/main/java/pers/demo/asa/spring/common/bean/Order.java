package pers.demo.asa.spring.common.bean;

import lombok.*;
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
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order extends BaseModel<Long> {
    private String orderId;
    private String shipName;
}