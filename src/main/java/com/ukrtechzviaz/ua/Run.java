package com.ukrtechzviaz.ua;

import com.ukrtechzviaz.ua.exception.BrokenQueuePassportBuilderException;
import com.ukrtechzviaz.ua.exception.NoSuchGazoprovidNameException;
import com.ukrtechzviaz.ua.manager.*;
import com.ukrtechzviaz.ua.model.*;
import com.ukrtechzviaz.ua.utils.Dovidnuk;
import com.ukrtechzviaz.ua.utils.PassportBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by andrey on 01.04.15.
 */

public class Run {
    public static void main(String[] args) throws BrokenQueuePassportBuilderException, NoSuchGazoprovidNameException {
        ApplicationContext ap =
                new ClassPathXmlApplicationContext("classpath:app-context.xml");
        Scanner scanner = new Scanner(System.in);
      /*  Dovidnuk dovidnuk = ap.getBean(Dovidnuk.class);
        PassportBuilder passportBuilder = ap.getBean(PassportBuilder.class);
        AnodneZazemlenniaManager anodneZazemlenniaManager = ap.getBean(AnodneZazemlenniaManager.class);
        TehnHaraktKatodnogoZahustyManager tehnHaraktKatodnogoZahustyManager = ap.getBean(TehnHaraktKatodnogoZahustyManager.class);
        dovidnuk.addGazoprovidName("газопровід",4);
        dovidnuk.addNazvuFiliiName("філія");
        dovidnuk.addNazvuKompaniiName("компанія");
        AnodneZazemlennia anodneZazemlennia = anodneZazemlenniaManager.addAnodneZazemlennia(new Date(),"простий","виробник","проста",5,5,5,5,5,5,5,"організація","примітки");
        TehnHaraktKatodnogoZahusty tehnHaraktKatodnogoZahusty = tehnHaraktKatodnogoZahustyManager.add(new Date(),"перетворювач","виробник",new Date(),12313,TupZahusnogoPokruttia.ZaliznuiBlockBox,5,6,true,"спосіб",true,"тип",5,4,"примітка");
        passportBuilder.addPassport(tehnHaraktKatodnogoZahusty,anodneZazemlennia,dovidnuk.getNazvuKompanii("компанія"),dovidnuk.getNazvuFilii("філія"),"перший",dovidnuk.getGazoprovidName("газопровід"),5,"Київ");
        passportBuilder.addZagalniDani(TupRemonty.Kapitalnui,"Київ",new Date(),"організація","організація","землекористувач");
        passportBuilder.addEksplyatKontrol(new Date(),new Date(),5,5,5,5,5,5,5,5,5,5,5,"примітки");
        passportBuilder.addPlanovoZapobizhniRobotu(new Date(),new Date(),TupRemonty.Kapitalnui,"опис",4,4,5,4,4);
        */
    }
}