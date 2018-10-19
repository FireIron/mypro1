package cn.netease.pr1;

import cn.netease.domain.Account;
import cn.netease.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@org.springframework.stereotype.Controller
@RequestMapping("/user")
public class Controller {
    @RequestMapping("/change")
    public String change(){
        System.out.println("跳转成功");
        return "success";
    }

    @RequestMapping("/form")
    public String form(User user){
        System.out.println(user);
        System.out.println("表单提交");
        return "success";
    }

    @RequestMapping("/form1")
    public String form1(Account account){
        System.out.println(account);
        System.out.println("表单1提交");
        return "success";
    }
    @RequestMapping("/form2")
    public String form2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("虚拟路径:"+request.getContextPath());
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("你好啊");
        return "success";
    }
    @RequestMapping("/form3")
    public String form3(@RequestBody String body){
        System.out.println("请求体："+body);
        return "success";
    }
    @RequestMapping(path = "/form4",method = RequestMethod.POST,headers ="")
    public String form4(){
        return "success";
    }

}
