package com.company;
public class Gender {
    public static Student getgender(String g)
    {
        if(g==null)
        {
            return null;
        }
        else if (g.equalsIgnoreCase("BOY")){
            return new Boy();
        }
        else if (g.equalsIgnoreCase("GIRL")){
            return new Girl();
        }
        return null;
    }
}
