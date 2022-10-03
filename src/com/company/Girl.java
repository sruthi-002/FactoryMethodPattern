package com.company;
import com.company.Student;
import java.util.Scanner;
public class Girl implements Student {
    public String name()
    {
        String name;
        Scanner in = new Scanner(System.in);
        name= in.next();
        System.out.println("The girl name is "+name);
        return name;
    }
}
