package com.example.fbj.demo.Controller;

import com.example.fbj.demo.Service.Impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
public class HelloController {

    @Autowired
    private HelloServiceImpl helloService;

    @RequestMapping(value = {"/hello"},method = RequestMethod.GET)
    public List say(HttpServletRequest request){
        String ipAddr = request.getRemoteAddr();
        String method = request.getMethod();
        String userAgent = request.getHeader("User-Agent");
        String os = "";
        //获取操作系统
        if (userAgent.toLowerCase().indexOf("windows") >= 0 )
        {
            os = "Windows";
        } else if(userAgent.toLowerCase().indexOf("mac") >= 0)
        {
            os = "MacOS";
        } else if(userAgent.toLowerCase().indexOf("x11") >= 0)
        {
            os = "Unix";
        } else if(userAgent.toLowerCase().indexOf("android") >= 0)
        {
            os = "AndroidOS";
        } else if(userAgent.toLowerCase().indexOf("iphone") >= 0)
        {
            os = "IPhoneOS";
        }else{
            os = "UnKnown, More-Info: ";
        }
        //获取浏览器
        if(userAgent.toLowerCase().contains("chrome")){
            System.out.println("你好"+ipAddr+"你用的是谷歌  "+method +"方式  " + os );
        }else if(userAgent.toLowerCase().contains("msie")){
            System.out.println("你好"+ipAddr+"你用的是IE  "+method +"方式  " + os );
        }else if(userAgent.toLowerCase().contains("firefox")){
            System.out.println("你好"+ipAddr+"你用的是火狐  "+method +"方式  " + os );
        }

        System.out.println(ipAddr + "  " + method);
        return helloService.getDataTest();
    }
}
