package com.ukrtechzviaz.ua.controller;

import com.ukrtechzviaz.ua.dto.LoginDto;
import com.ukrtechzviaz.ua.utils.AccessChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by andrey on 03.04.15.
 */
@Controller
public class MainServlet {

    @Autowired
    private AccessChecker accessChecker;

    public MainServlet() {
    }

    public AccessChecker getAccessChecker() {
        return accessChecker;
    }

    public void setAccessChecker(AccessChecker accessChecker) {
        this.accessChecker = accessChecker;
    }

    @RequestMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("loginDto", new LoginDto());
        return "login";
    }

    @RequestMapping(value = "/login")
    public String login(@ModelAttribute("loginDto")LoginDto loginDto, Model model,HttpServletRequest request){
        Boolean vvedennia = accessChecker.accessVvedenniaTehnichnuxObectiv(loginDto.getLogin(),loginDto.getPass());
        Boolean zvitnist = accessChecker.accessZvitnist(loginDto.getLogin(),loginDto.getPass());
        model.addAttribute("vvedennia",vvedennia);
        model.addAttribute("zvitnist",vvedennia);
        return "main";
    }
}