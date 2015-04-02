package com.ukrtechzviaz.ua;

import com.ukrtechzviaz.ua.manager.TehnHaraktKatodnogoZahustyManager;
import com.ukrtechzviaz.ua.model.TupZahusnogoPokruttia;
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

    }
}