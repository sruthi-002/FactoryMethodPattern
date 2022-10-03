package com.company;
public class Main{
    public static void main(String []  args){
        Gender g = new Gender();
        Student S1 = Gender.getgender("Boy");
        S1.name();
        Student S2 = Gender.getgender("Girl");
        S2.name();
    }
}
