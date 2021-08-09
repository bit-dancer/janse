package cn.bitdancer.janse.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: CommonResult
 * @Description: TODO
 * @author: hzy
 * @date: 2021/8/9
 */
public class CommonResult extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    //利用fastjson进行逆转 可以指定域中key的名字
    public <T> T getData(String key, TypeReference<T> typeReference) {
        Object data = get(key);
        String s = JSON.toJSONString(data);
        T t = JSON.parseObject(s, typeReference);
        return t;
    }

    //利用fastjson进行逆转
    public <T> T getData(TypeReference<T> typeReference) {
        Object data = get("data");
        String s = JSON.toJSONString(data);
        T t = JSON.parseObject(s, typeReference);
        return t;
    }

    public CommonResult setData(Object data) {
        put("data", data);
        return this;
    }
    public CommonResult setData(String key,Object data){
        put(key,data);
        return this;
    }

    public CommonResult() {
        put("code", 200);
        put("msg", "success");
    }

    public static CommonResult error() {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), "未知异常，请联系管理员");
    }

    public static CommonResult error(String msg) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg);
    }

    public static CommonResult error(int code, String msg) {
        CommonResult commonResult = new CommonResult();
        commonResult.put("code", code);
        commonResult.put("msg", msg);
        return commonResult;
    }

    public static CommonResult ok(String msg) {
        CommonResult commonResult = new CommonResult();
        commonResult.put("msg", msg);
        return commonResult;
    }

    public static CommonResult ok(Map<String, Object> map) {
        CommonResult commonResult = new CommonResult();
        commonResult.putAll(map);
        return commonResult;
    }

    public static CommonResult ok() {
        return new CommonResult();
    }

    @Override
    public CommonResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public Integer getCode() {
        return (Integer) this.get("code");
    }
}
