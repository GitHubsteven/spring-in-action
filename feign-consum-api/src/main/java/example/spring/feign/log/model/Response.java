package example.spring.feign.log.model;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 17:10 2019/6/25.
 */
public class Response<T> {
    private String code;
    private String message;
    private String status;
    private T data;
}