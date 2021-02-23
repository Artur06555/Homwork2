package com.company;

public class Main {

    public static void main(String[] args) {
        rainyWeAther(50, 40);
        rainyWeAther(10, -3);
        rainyWeAther(12,23);
        rainyWeAther(12,12);
        rainyWeAther(12,13);



    }

    public static int rainyWeAther(int ageofperson, int temperatyre) {
       if (ageofperson > 20 && ageofperson < 45 && temperatyre>-20 && temperatyre<30){
           System.out.println("\"Можно идти гулять1 \"");
       }
       if (ageofperson<20 && temperatyre>=0 && temperatyre<=28){
           System.out.println("\"Можно идти гулять2\"");
       }
       if (ageofperson > 45 && temperatyre > -10 && temperatyre < 25 ){
           System.out.println("Можно идти гулять3");
       }
       else {
           System.out.println("Оставаться дома");
       }
       return ageofperson;
    }
    


}
