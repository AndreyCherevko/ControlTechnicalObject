package com.ukrtechzviaz.ua;

import com.ukrtechzviaz.ua.exception.NoSuchGazoprovidNameException;
import com.ukrtechzviaz.ua.manager.GazoprovidNameManager;
import com.ukrtechzviaz.ua.manager.MainSpecificationManager;
import com.ukrtechzviaz.ua.manager.TitleManager;
import com.ukrtechzviaz.ua.model.MainSpecification;
import com.ukrtechzviaz.ua.model.ProtectTypeCovering;
import com.ukrtechzviaz.ua.view.Menu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by andrey on 01.04.15.
 */

public class Run {
    public static void main(String[] args) {
        ApplicationContext ap =
                new ClassPathXmlApplicationContext("classpath:app-context.xml");
        Scanner scanner = new Scanner(System.in);
        /*Menu menu = ap.getBean(Menu.class);
        while(true){
            menu.showMenu();
            int choose = scanner.nextInt();
            menu.choose(choose);
        }*/
        /*TitleManager manager = ap.getBean(TitleManager.class);
        GazoprovidNameManager gazoprovidNameManager = ap.getBean(GazoprovidNameManager.class);
        gazoprovidNameManager.add("перший");
        try {
            manager.addTitle("Уктрансгаз","перша","перший",gazoprovidNameManager.find("перший"),5,6,"перший");
        } catch (NoSuchGazoprovidNameException e) {
            e.printStackTrace();
        }*/
        MainSpecificationManager mainSpecificationManager = ap.getBean(MainSpecificationManager.class);
        mainSpecificationManager.add(new Date(),"Тип","",new Date(),12345, ProtectTypeCovering.TrybaStaleva,5,10,true,"yes",true,"тип",4,4,"перевірка");
    }
}