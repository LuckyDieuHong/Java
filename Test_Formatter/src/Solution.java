
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        //Locale usa = new Locale ("en","us");
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        //Locale chingChong = new Locale ("cn","cn");
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        //Locale phap = new Locale ("fr","fr");
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//        Locale anDo = new Locale ("en","IN");
//        NumberFormat india = NumberFormat.getCurrencyInstance(anDo);
        DecimalFormat IndianCurrencyFormat = new DecimalFormat("##,##,###.00");
        String india ="Rs." + IndianCurrencyFormat.format(payment);
//        /* Create custom Locale for India.
//        Locale indiaLocale = new Locale("en", "IN");
//
//        /* Create NumberFormats using Locales */
//        Locale indiaLocale = new Locale("en", "IN");
//        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
//        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
          
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india);
        System.out.println("China: " + china.format(payment));
       // System.out.println("China: " + china.getCurrency().getSymbol(Locale.CHINA) + payment);
        System.out.println("France: " + france.format(payment));
    }
}