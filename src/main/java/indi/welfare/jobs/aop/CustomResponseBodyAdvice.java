package indi.welfare.jobs.aop;

import com.alibaba.fastjson.JSONObject;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Executable;
import java.lang.reflect.Type;

@RestControllerAdvice
public class CustomResponseBodyAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        Executable executable = returnType.getExecutable();
        AnnotatedType annotatedReturnType = executable.getAnnotatedReturnType();
        Type type = annotatedReturnType.getType();
        return JSONObject.parseObject("{\"result\":0}");
    }
}