package com.company;
import java.util.Scanner;
public class Boy implements Student{
    public String name()
    {
        String name;
        Scanner in = new Scanner(System.in);
        name=in.next();
        System.out.println("The Boy name is "+name);
        return name;
    }
}
