package com.senai.chamados.config;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class SessaoInterceptor implements HandlerInterceptor {

    @Override public boolean preHandle(HttpServletRequest req,HttpServletResponse res,Object handler) throws Exception {
        if(req.getSession(false)!=null && req.getSession(false).getAttribute("usuarioLogado")!=null)
            return true;
        res.sendRedirect(req.getContextPath()+"/login");
        return false;
    }
}
