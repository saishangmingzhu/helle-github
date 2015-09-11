package com.zuohao;

import java.text.SimpleDateFormat;

/**
 * Created by zuohao on 15/9/9.
 */
public class HelloGithub {
    public static void main(String[] args){
        System.out.println("Hello,GitHub!");
        System.out.println("This is develop");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        long time=1441728000000L;
        String dateString=sdf.format(time);
        System.out.println(dateString);
    }
}
