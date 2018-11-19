package com;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        ResourceBundle bundleDefault = ResourceBundle.getBundle("resources");
//        ResourceBundle bundleEN = ResourceBundle.getBundle("resources", new Locale("en", "US"));
//        ResourceBundle bundleDE = ResourceBundle.getBundle("resources", new Locale("de", "GR"));
//        ResourceBundle bundleRU = ResourceBundle.getBundle("resources", new Locale("ru", "RU"));
//
//        System.out.println(bundleDefault.getString("somevalue"));
//        System.out.println(bundleEN.getString("somevalue"));
//        System.out.println(bundleDE.getString("somevalue"));
//        System.out.println(new String (bundleRU.getString("somevalue").getBytes("windows-1251"),"UTF-8"));
//
//
        ResourceBundle bundleDefault = ResourceBundle.getBundle("resources.resource");
        ResourceBundle bundleEN = ResourceBundle.getBundle("resources.resource", new Locale("en", "US"));
        ResourceBundle bundleDE = ResourceBundle.getBundle("resources.resource", new Locale("de", "GR"));
        ResourceBundle bundleRU = ResourceBundle.getBundle("resources.resource", new Locale("ru", "RU"));

        System.out.println(bundleDefault.getString("somevalue"));
        System.out.println(bundleEN.getString("somevalue"));
        System.out.println(bundleDE.getString("somevalue"));
        System.out.println( bundleRU.getString("somevalue") );

    }
}































