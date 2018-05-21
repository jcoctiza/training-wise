package main.javaDateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tri-Nvent on 5/21/2018.
 */
public class JavaDateAndTimeDemo {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.toString());
        String dateFormat = "hh:mm a \nEEEE, MMM-d-y";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        System.out.println("\n"+simpleDateFormat.format(date));
    }
}
