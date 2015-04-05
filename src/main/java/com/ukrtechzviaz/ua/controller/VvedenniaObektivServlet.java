package com.ukrtechzviaz.ua.controller;

import com.ukrtechzviaz.ua.dto.AnodneZazemlenniaDto;
import com.ukrtechzviaz.ua.dto.KatodZahDto;
import com.ukrtechzviaz.ua.manager.AnodneZazemlenniaManager;
import com.ukrtechzviaz.ua.manager.TehnHaraktKatodnogoZahustyManager;
import com.ukrtechzviaz.ua.model.AnodneZazemlennia;
import com.ukrtechzviaz.ua.model.TehnHaraktKatodnogoZahusty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
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


    @RequestMapping(value = "/indexVved")
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

    @RequestMapping(value = "/vvedenniaAnod",method = RequestMethod.POST)
    public String addAnodneZezemlennia(@ModelAttribute("AnodneZazemlenniaDto") @Valid AnodneZazemlenniaDto AnodneZazemlenniaDto,BindingResult result, Model model){
        if(result.hasErrors())
            return "indexVved";
        anodneZazemlenniaManager.addAnodneZazemlennia(AnodneZazemlenniaDto.getDataMontazhu(), AnodneZazemlenniaDto.getTypeElectrodiv(), AnodneZazemlenniaDto.getVurobnuk(),
                AnodneZazemlenniaDto.getKostrnAzs(), AnodneZazemlenniaDto.getKtiElectrodiv(), AnodneZazemlenniaDto.getGlibinaZaliaginnia(), AnodneZazemlenniaDto.getVidstanDoGazoprovody(),
                AnodneZazemlenniaDto.getVidstanDoUkz(), AnodneZazemlenniaDto.getDovzhunaAnodnogoPolia(), AnodneZazemlenniaDto.getOpirRoztikannia(), AnodneZazemlenniaDto.getPutomuiOpir(),
                AnodneZazemlenniaDto.getBudivelnaOrganizazhia(), AnodneZazemlenniaDto.getPrumitku());
        return "redirect:/indexVved";
    }

    @RequestMapping(value = "/vvedenniaKat", method = RequestMethod.POST)
    public String addKatoKatodZah(@ModelAttribute("KatodZahDto") @Valid KatodZahDto KatodZahDto,BindingResult result, Model model){
        if(result.hasErrors()){
            List<AnodneZazemlennia> listAnodneZazem = anodneZazemlenniaManager.findAll();
            List<TehnHaraktKatodnogoZahusty> listKatodZah = tehnHaraktKatodnogoZahustyManager.findAll();
            model.addAttribute("listAnodneZazemlennia",listAnodneZazem);
            model.addAttribute("listKatodnuiZah", listKatodZah);
            model.addAttribute("anodneZazemlenniaDto",new AnodneZazemlenniaDto());
            model.addAttribute("KatodZahDto",new KatodZahDto());
            model.addAttribute("telecontdolCheck",new Boolean[]{true,false});
            return "vvedenniaMain";
        }
        tehnHaraktKatodnogoZahustyManager.add(KatodZahDto.getDateMontazhu(), KatodZahDto.getTypePeretvoriuvacha(), KatodZahDto.getVurobnuk(), KatodZahDto.getDataVupysky(),
                                                KatodZahDto.getNumberZavodskii(), KatodZahDto.getTypePokruttia(), KatodZahDto.getP(), KatodZahDto.getU(), KatodZahDto.isTelecontrol(), KatodZahDto.getSposibZahusty(),
                                                KatodZahDto.getTypeLichilnuka(), KatodZahDto.getKilkLichilnika(), KatodZahDto.getR(), KatodZahDto.getPrumitka(), KatodZahDto.getA());
        return "redirect:/indexVved";
    }
}
