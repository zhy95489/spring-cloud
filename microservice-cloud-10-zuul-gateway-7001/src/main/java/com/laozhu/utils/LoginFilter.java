package com.laozhu.utils;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author zhy
 * @date 2019/12/5 13:55
 */
@Component
public class LoginFilter extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        //获取请求参数token的值
        String token = request.getParameter("token");
        if (token == null){
            logger.warn("此操作需要先登录。。。");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(200);
            try {
                //响应结果
                currentContext.getResponse().getWriter().write("tokey is enpty");
            }catch (IOException e){
                e.printStackTrace();
            }
            return  null;
        }
        logger.info("ok");
        return null;
    }
}
