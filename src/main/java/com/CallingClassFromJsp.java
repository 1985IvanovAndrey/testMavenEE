package com;

import java.util.ArrayList;

public class CallingClassFromJsp {

  public static   ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {

        names.add("Bob");
        names.add("Boss");
    //System.out.println(names);
}
//        inWeb();
//

    public ArrayList<String> inWeb(){
        return names;
    }
}
