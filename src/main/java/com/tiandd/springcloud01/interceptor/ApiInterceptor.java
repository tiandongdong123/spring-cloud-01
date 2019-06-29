package com.tiandd.springcloud01.interceptor;

import com.tiandd.springcloud01.utils.IpUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApiInterceptor implements HandlerInterceptor {
    //请求之前
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("进入拦截器");
        // ip
        String ip = IpUtils.getIp(httpServletRequest);
        System.out.println("请求的ip为："+ip);
        System.out.println("请求地址为："+httpServletRequest.getServletPath());
        return true;
    }
    //请求时
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }
    //请求完成
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
