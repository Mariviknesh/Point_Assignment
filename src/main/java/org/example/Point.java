package org.example;

import java.util.Scanner;
import java.util.logging.*;
class Point
{
    public static void main(String []args) throws CloneNotSupportedException
    {
        String x;
        String y;
        Scanner sc=new Scanner(System.in);
        Logger log=Logger.getLogger("com.api.jar");
        log.info("Enter the value of x:");
        x=sc.next();
        log.info("Enter the value of y:");
        y=sc.next();
        Space s1=new Space(x,y);
        s1.check();
        log.info("Obect 1");
        s1.display();
        Space s2=(Space)s1.clone();
        log.info("Obect");
        s2.display();
        sc.close();
    }
}