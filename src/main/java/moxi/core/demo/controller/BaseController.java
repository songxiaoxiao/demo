package moxi.core.demo.controller;

import moxi.core.demo.component.I18NMessageSource;
import moxi.core.demo.entity.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @program: MPay-Cloud
 * @description: ${description}
 * @author: Mark Ma
 * @create: 2018-10-17 15:15
 **/

@RestController
public class BaseController {

    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Resource
    protected HttpServletRequest request;

    @Resource
    protected HttpServletResponse response;

    @Resource(name = "i18NMessageSource")
    protected I18NMessageSource i18NMessageSource;

    /**
     * 请求成功
     * @return
     */
    protected ResponseData success(){
        int code = 200;
        String message = i18NMessageSource.getMessage(code+"",null);
        return ResponseData.success(code, message);
    }
    /**
     * 请求成功
     * @param data
     * @return
     */
    protected ResponseData success(Object data){
        int code = 200;
        String message = i18NMessageSource.getMessage(code+"",null);
        return ResponseData.success(code, message, data);
    }

    /**
     * 请求成功
     * @param data
     * @param total
     * @return
     */
    protected ResponseData success(Object data, int total){
        int code = 200;
        String message = i18NMessageSource.getMessage(code+"",null);
        return ResponseData.success(code, message, data, total);
    }

    /**
     * 请求失败
     * @param code
     * @param params
     * @return
     */
    protected ResponseData fail(Integer code, Map<String, String> extra, String...params){
        String message = i18NMessageSource.getMessage(code+"", params);
        logger.error("error.code:[{}], error.msg:[{}]", code, message);
        if(extra == null || extra.size() == 0)
            return ResponseData.error(code, message);
        return ResponseData.error(code, message, extra);
    }
    /**
     * 请求失败
     * @param code
     * @return
     */
    protected ResponseData fail(Integer code){
        String message = i18NMessageSource.getMessage(code+"", null);
        logger.error("error.code:[{}], error.msg:[{}]", code, message);
        return ResponseData.error(code, message);
    }
    /**
     * 请求失败
     * @param code
     * @return
     */
    protected ResponseData fail(Integer code, String message){
//        String message = i18NMessageSource.getMessage(code+"", null);
        logger.error("error.code:[{}], error.msg:[{}]", code, message);
        return ResponseData.error(code, message);
    }
}
