package main.javaDateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tri-Nvent on 5/21/2018.
 */
public class DateCompareDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM-dd-y");
        Date date1 = simpleDateFormat.parse("Dec-18-1996");
        Date date2 = simpleDateFormat.parse("Jan-09-1995");
        System.out.println("Date 1: "+simpleDateFormat.format(date1));
        System.out.println("Date 2: "+simpleDateFormat.format(date2));

        int compareDate = date1.compareTo(date2);
        if(compareDate > 0){
            System.out.println("Date 1 occurs after Date 2");
        } else if(compareDate < 0){
            System.out.println("Date 1 occurs before Date 2");
        } else if(compareDate == 0){
            System.out.println("Dates are both the same");
        } else{
            System.out.println("Something strange here");
        }
    }
}
