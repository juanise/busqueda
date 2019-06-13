package com.pf.busqueda.config;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class RequestFilter implements Filter {
    public RequestFilter() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        String token = httpServletRequest.getHeader("Authorization");
        if (token != null && !token.isEmpty()) {
            RequestContext.getContext().setToken(token);
        }
//        String[] paramValues = httpServletRequest.getParameterValues("state");
//        if (paramValues != null && paramValues.length >=1){
//            token = paramValues[0];
//            if (token != null && !token.isEmpty()) {
//                RequestContext.getContext().setToken(token);
//            }
//        }

        chain.doFilter(request, response);
    }

    public void destroy() {
    }

    public void init(FilterConfig arg0) throws ServletException {
    }
}