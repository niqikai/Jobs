package indi.welfare.jobs.utils.response;

import java.lang.annotation.*;

/**
 * 统一响应注解<br/>
 * 添加注解后，统一响应体才能生效
 * @author NULL
 * @date 2019-07-16
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface BaseResponse {

}