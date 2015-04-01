package com.ukrtechzviaz.ua.view;

import com.ukrtechzviaz.ua.dao.GazoprovidNameDao;
import com.ukrtechzviaz.ua.dao.GazoprovidNameDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * Created by andrey on 01.04.15.
 */
@Component
public class Menu {

    @Autowired
    private GazoprovidNameDao gazoprovidNameDaoImp;
    // ServerConnection conection
    private Scanner scanner = new Scanner(System.in);

    public Menu() {
    }

    public void setGazoprovidNameDaoImp(GazoprovidNameDao gazoprovidNameDaoImp) {
        this.gazoprovidNameDaoImp = gazoprovidNameDaoImp;
    }

    public void showMenu(){
        System.out.println("1.Add GazoprovidName");
        System.out.println("2.Exit");
    }

    public void choose(int chose){
        switch (chose){
            case 1:{
                System.out.println("Gazoprovid name:");
                String name = scanner.nextLine();
                gazoprovidNameDaoImp.create(name);
            }
        }
    }
}
