/*
 * Created by Epic_ on Jan 8 2018
 * Displays inputted time
 *
 * */

public class Start {
    public static void main(String[] args) {
        Time timeObject = new Time();
        System.out.println(timeObject.toMilitary()); //prints out all 00, bc didnt set a time
        System.out.println(timeObject.toString()); //prints reg time

        timeObject.setTime(13,27,6);

        System.out.println(timeObject.toMilitary());
        System.out.println(timeObject.toString()); //prints reg time
    }
}
