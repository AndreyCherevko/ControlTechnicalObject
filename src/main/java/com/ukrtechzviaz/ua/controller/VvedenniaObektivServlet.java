package com.ukrtechzviaz.ua.controller;

import com.ukrtechzviaz.ua.dto.AnodneZazemlenniaDto;
import com.ukrtechzviaz.ua.dto.KatodZahDto;
import com.ukrtechzviaz.ua.dto.LoginDto;
import com.ukrtechzviaz.ua.manager.AnodneZazemlenniaManager;
import com.ukrtechzviaz.ua.manager.TehnHaraktKatodnogoZahustyManager;
import com.ukrtechzviaz.ua.model.AnodneZazemlennia;
import com.ukrtechzviaz.ua.model.TehnHaraktKatodnogoZahusty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by andrey on 03.04.15.
 */
@Controller(value = "/index")
public class VvedenniaObektivServlet {

    @Autowired
    private AnodneZazemlenniaManager anodneZazemlenniaManager;

    @Autowired
    private TehnHaraktKatodnogoZahustyManager tehnHaraktKatodnogoZahustyManager;

    public VvedenniaObektivServlet() {
    }

    public AnodneZazemlenniaManager getAnodneZazemlenniaManager() {
        return anodneZazemlenniaManager;
    }

    public void setAnodneZazemlenniaManager(AnodneZazemlenniaManager anodneZazemlenniaManager) {
        this.anodneZazemlenniaManager = anodneZazemlenniaManager;
    }

    public TehnHaraktKatodnogoZahustyManager getTehnHaraktKatodnogoZahustyManager() {
        return tehnHaraktKatodnogoZahustyManager;
    }

    public void setTehnHaraktKatodnogoZahustyManager(TehnHaraktKatodnogoZahustyManager tehnHaraktKatodnogoZahustyManager) {
        this.tehnHaraktKatodnogoZahustyManager = tehnHaraktKatodnogoZahustyManager;
    }

    @RequestMapping(value = "/index")
    public String login(Model model,HttpServletRequest request) {
        List<AnodneZazemlennia> listAnodneZazem = anodneZazemlenniaManager.findAll();
        List<TehnHaraktKatodnogoZahusty> listKatodZah = tehnHaraktKatodnogoZahustyManager.findAll();
        model.addAttribute("listAnodneZazemlennia",listAnodneZazem);
        model.addAttribute("listKatodnuiZah", listKatodZah);
        model.addAttribute("anodneZazemlenniaDto",new AnodneZazemlenniaDto());
        model.addAttribute("KatodZahDto",new KatodZahDto());
        model.addAttribute("telecontdolCheck",new Boolean[]{true,false});

        return "vvedenniaMain";
    }

    @RequestMapping(value = "/vvedenniaAnod")
    public String addAnodneZezemlennia(@ModelAttribute(value = "anodneZazemlenniaDto")AnodneZazemlenniaDto dto,Model model){
        anodneZazemlenniaManager.addAnodneZazemlennia(dto.getDataMontazhu(),dto.getTypeElectrodiv(),dto.getVurobnuk(),
                                                        dto.getKostrnAzs(),dto.getKtiElectrodiv(),dto.getGlibinaZaliaginnia(),dto.getVidstanDoGazoprovody(),
                                                        dto.getVidstanDoUkz(),dto.getDovzhunaAnodnogoPolia(),dto.getOpirRoztikannia(),dto.getPutomuiOpir(),
                                                        dto.getBudivelnaOrganizazhia(),dto.getPrumitku());
        return "redirect:/index";
    }

    @RequestMapping(value = "/vvedenniaKat")
    public String addKatoKatodZah(@ModelAttribute(value = "KatodZahDto")KatodZahDto dto,Model model){
        tehnHaraktKatodnogoZahustyManager.add(dto.getDateMontazhu(),dto.getTypePeretvoriuvacha(),dto.getVurobnuk(),dto.getDataVupysky(),
                                                dto.getNumberZavodskii(),dto.getTypePokruttia(),dto.getP(),dto.getU(),dto.isTelecontrol(),dto.getSposibZahusty(),
                                                dto.getTypeLichilnuka(),dto.getKilkLichilnika(),dto.getR(),dto.getPrumitka(),dto.getA());
        return "redirect:/index";
    }
}
