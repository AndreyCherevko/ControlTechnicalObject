package com.ukrtechzviaz.ua.controller;

import com.ukrtechzviaz.ua.dto.PeregliadZvituDto;
import com.ukrtechzviaz.ua.manager.PassportManager;
import com.ukrtechzviaz.ua.model.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by andrey on 05.04.15.
 */
@Controller
public class PeregliadPassportivController {

    @Autowired
    private PassportManager passportManager;

    public PeregliadPassportivController() {
    }

    public PassportManager getPassportManager() {
        return passportManager;
    }

    public void setPassportManager(PassportManager passportManager) {
        this.passportManager = passportManager;
    }

    @RequestMapping(value = "/indexPeregliad")
    public String index(Model model){
        List<Passport> passports = passportManager.fintAll();
        model.addAttribute("passports",passports);
        model.addAttribute("peregliadDto", new PeregliadZvituDto());
        return "/peregliadZvituMain";
    }
    @RequestMapping(value = "/showPassport")
    public String showPassport(@ModelAttribute("peregliadDto") @Valid PeregliadZvituDto dto, Model model){
        Passport passport = passportManager.find(dto.getId());
        model.addAttribute("anodneZazemlennia", passport.getAnodneZazemlennia());
        model.addAttribute("katodnuiZah",passport.getTehnHaraktKatodnogoZahusty());
        model.addAttribute("zagalniDani",passport.getZagalniDani());
        model.addAttribute("ekspKontrol",passport.getEksplyatazhiinuiKontrol());
        model.addAttribute("planZapRob",passport.getPlanovoZapobizhniRobotu());
        model.addAttribute("passport",passport);
        model.addAttribute("save",false);
        return "/peregliadZvitu";
    }
}
