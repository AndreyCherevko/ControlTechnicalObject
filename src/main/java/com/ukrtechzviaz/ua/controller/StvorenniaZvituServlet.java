package com.ukrtechzviaz.ua.controller;

import com.ukrtechzviaz.ua.dto.EksKontrolDto;
import com.ukrtechzviaz.ua.dto.PassportDto;
import com.ukrtechzviaz.ua.dto.PlanovoZapobizhniRemontuDto;
import com.ukrtechzviaz.ua.dto.ZagalniDaniDto;
import com.ukrtechzviaz.ua.exception.BrokenQueuePassportBuilderException;
import com.ukrtechzviaz.ua.manager.AnodneZazemlenniaManager;
import com.ukrtechzviaz.ua.manager.TehnHaraktKatodnogoZahustyManager;
import com.ukrtechzviaz.ua.model.*;
import com.ukrtechzviaz.ua.utils.Dovidnuk;
import com.ukrtechzviaz.ua.utils.PassportBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by andrey on 04.04.15.
 */
@Controller
public class StvorenniaZvituServlet {

    @Autowired
    private PassportBuilder builder;

    @Autowired
    private AnodneZazemlenniaManager anodneZazemlenniaManager;

    @Autowired
    private TehnHaraktKatodnogoZahustyManager tehnHaraktKatodnogoZahustyManager;

    @Autowired
    private Dovidnuk dovidnuk;

    public StvorenniaZvituServlet() {
    }

    public PassportBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(PassportBuilder builder) {
        this.builder = builder;
    }


    @RequestMapping(value = "/indexZvit")
    public String login(Model model,HttpServletRequest request) {
        List<AnodneZazemlennia> listAnodneZazem = anodneZazemlenniaManager.findAll();
        List<TehnHaraktKatodnogoZahusty> listKatodZah = tehnHaraktKatodnogoZahustyManager.findAll();
        List<NazvuKompanii> listCompany = dovidnuk.getNazvuKompaniis();
        List<NazvuFilii> listFilii = dovidnuk.getNazvuFiliis();
        List<GazoprovidName> listGazName = dovidnuk.getGazoprovidNames();
        model.addAttribute("listAnodneZazemlennia",listAnodneZazem);
        model.addAttribute("listKatodnuiZah", listKatodZah);
        model.addAttribute("listCompany",listCompany);
        model.addAttribute("listFilii",listFilii);
        model.addAttribute("listGazName",listGazName);
        model.addAttribute("passportDto",new PassportDto());

        return "/insertPassport";
    }

    @RequestMapping(value = "/insertPassport")
    public String chooseAnKat(@ModelAttribute("passportDato") @Valid PassportDto dto,BindingResult result,Model model,HttpServletRequest request){
        if(result.hasErrors()){
            return "redirect:indexZvit";
        }
        builder.addPassport(dto.getKatod(),dto.getAnod(),dto.getCompanyName(),dto.getFilialName(),
                            dto.getPidrozdilName(),dto.getGazoprovidName(),dto.getKmGazoprovid(),dto.getMisto(),(PosadoviOsobu)request.getSession(false).getAttribute("author"));
        model.addAttribute("zagalniDaniDto",new ZagalniDaniDto());
        return "/insertZagalniDani";
    }

    @RequestMapping(value = "/insertZagalniDani")
    public String addZagalniDani(@ModelAttribute("zagalniDaniDto") @Valid ZagalniDaniDto dto,BindingResult result,Model model) {
        if (result.hasErrors()) {
            model.addAttribute("zagalniDaniDto", new ZagalniDaniDto());
            return "/insertZagalniDani";
        }
        try {
            builder.addZagalniDani(dto.getProtectType(), dto.getGeografichnaPriviazhka(), dto.getStartEcspl(), dto.getProjectOrganization(),
                    dto.getBmOrganization(), dto.getZemlekorustyvach());
        } catch (BrokenQueuePassportBuilderException e) {
            return "redirect:/indexZvit";
        }
        model.addAttribute("EksKontrolDto",new EksKontrolDto());
        return "/insertEksplyatKontrol";
    }
    @RequestMapping(value = "/insertEksKontrol")
    public String addEksKontrol(@ModelAttribute("EksKontrolDto") @Valid EksKontrolDto dto,BindingResult result,Model model) {
        if (result.hasErrors()) {
            model.addAttribute("EksKontrolDto", new EksKontrolDto());
            return "/insertEksplyatKontrol";
        }
        try {
            builder.addEksplyatKontrol(dto.getDataKontrol(),dto.getPochankovaRobotaStrymy(),dto.getPochankovaRobotaNaprygu(),
                                        dto.getPochankoviiPotenzhvklvkl(),dto.getPochankoviiPotenzhvklvukl(),dto.getVstanovlenuiStrymRobotu(),dto.getVstanobleniiRobotaNuprygu(),
                                        dto.getVstanovlenuiiPotenzhvkl(),dto.getVstanovlenuiiPotenzhvukl(),dto.getP(),dto.getPokazhLIchilnukaChasy(),dto.getChasProst(),dto.getPrumitku());
        } catch (BrokenQueuePassportBuilderException e) {
            return "redirect:/indexZvit";
        }
        model.addAttribute("PlanovoZapobizhniRemontuDto",new PlanovoZapobizhniRemontuDto());
        return "/insertPlanovoZapobRemontu";
    }

    @RequestMapping(value = "/insertPlanovoZapobizhniRemontu")
    public String addPlanovoZapRemontu(@ModelAttribute("PlanovoZapobizhniRemontuDto") @Valid PlanovoZapobizhniRemontuDto dto,BindingResult result,Model model) {
        if (result.hasErrors()) {
            model.addAttribute("PlanovoZapobizhniRemontuDto", new PlanovoZapobizhniRemontuDto());
            return "/insertPlanovoZapobRemontu";
        }
        try {
            builder.addPlanovoZapobizhniRobotu(dto.getPochatkovaDataRemonty(),dto.getKinzhevaDataRemonty(),dto.getType(),dto.getOpusRobit(),
                                                dto.getVstanRezhimUkz(),dto.getVstanRezhimUkzU(),dto.getVvimknP(),dto.getVvumkP(),dto.getAnodR(),dto.getZahR());
        } catch (BrokenQueuePassportBuilderException e) {
            return "redirect:/indexZvit";
        }
        model.addAttribute("anodneZazemlennia", builder.getAnod());
        model.addAttribute("katodnuiZah",builder.getKatod());
        model.addAttribute("zagalniDani",builder.getZagalniDani());
        model.addAttribute("ekspKontrol",builder.getEksplyatazhiinuiKontrol());
        model.addAttribute("planZapRob",builder.getPlanovoZapobizhniRobotu());
        model.addAttribute("passport",builder.getPassport());
        model.addAttribute("save",true);
        return "/peregliadZvitu";
    }
    @RequestMapping(value = "/save")
    public String saveZvit(){
        builder.saveZvit();
        return "main";
    }
}
