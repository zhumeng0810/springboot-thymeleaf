package com.example.demo.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取进过拦截器的路径
        String requestURI = request.getRequestURI();
        System.out.println("requestURI:"+requestURI);
        if (requestURI.contains("login")){
            return true;
        }
        //      登录检查逻辑
        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser !=null){
//          放行
            return true;
        }else {
//            request.setAttribute("msg","没有登录权限请先登录");
//            response.sendRedirect("/login");
//            return false;
        }
//      拦截   就是未登录,自动跳转到登录页面，然后写拦截住的逻辑
        return true;//TODO 默认先放行

    }
}
