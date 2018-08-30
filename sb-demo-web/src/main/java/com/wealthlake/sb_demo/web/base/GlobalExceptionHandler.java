package com.wealthlake.sb_demo.web.base;

import com.wealthlake.sb_demo.common.domain.Result;
import com.wealthlake.sb_demo.common.domain.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理
 * Created By Rsh
 *
 * @author rsh
 * @Description
 * @Date: 2018/8/27
 * @Time: 15:07
 */

@CrossOrigin
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     *
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {

    }

    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     *
     * @param model
     */
    @ModelAttribute
    public void addAttributes(Model model) {
        //model.addAttribute("author", "Magical Sam");
    }

    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public Result processMissingServletRequestParameterException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        LOGGER.error("", ex);
        return new Result(ResultCode.COMMON_BUSINESS_EXCEPTION.getCode(), "参数错误", false);
    }

    @ExceptionHandler(value = Exception.class)
    public Result processException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        LOGGER.error("", ex);
        return new Result(ResultCode.COMMON_SYSTEM_EXCEPTION.getCode(), "系统错误", false);
    }

    @ExceptionHandler(value = RuntimeException.class)
    public Result processRuntimeException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        LOGGER.error("", ex);
        return new Result(ResultCode.COMMON_BUSINESS_EXCEPTION.getCode(), "系统错误", false);
    }

}
