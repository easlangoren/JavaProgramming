package week03;

public class DivisionAndReminderPractice {
    public static void main(String[] args) {

        // input is some amount of seconds (45000)
        // hours: minutes: seconds

        int inputSeconds = 123456;
        int hours,minutes,seconds; //declared

        /*
        Algorithm:
        1. 1 minute is 60 seconds, 1 hour 3600 seconds
        2. remainder operator to turn inputSeconds to find seconds
         */

        seconds = inputSeconds%60; // calculate remaining seconds
        minutes = (inputSeconds/60)% 60; //remaining minutes
        hours = inputSeconds / 3600; //how many hours we have

        String clock = "Hours:" + hours+ " Minutes:"+minutes+ " Seconds:"+ seconds;

        System.out.println(clock);





    }
}
