package com.pradeep;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
         System.out.println(getDurationString(3045L));

    }

public  static  String getDurationString(long minutes, long seconds){
        if((minutes<0)|| (seconds<0) || (seconds>59)){
            return "invalid value";
        }
        long hours = minutes /60;
        long remainingMinutes = minutes % 60 ;
        return hours +  "h " + remainingMinutes +  "m " +  seconds +  "s";


}

    public  static  String getDurationString(long seconds){
        if(seconds<0){
            return "invalid value";
        }
        long minutes = seconds/60;
        long remainingMinutes = seconds % 60;
//        return minutes + "m" + remainingMinutes + "s";
      return  getDurationString(minutes, remainingMinutes);
    }

}
