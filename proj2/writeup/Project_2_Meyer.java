/**
 * Created by garrettmeyer on 12/8/16.
 * This program displays a work schedule for employees. The business has 6 times shifts 7 days a weeks. I used
 * "The Office" characters as examples. When the program displays the schedule the frist employee is the preferred and
 * the back up is after the preffered. Ex: "Jim-or-Dwight": "Jim" is preffered and "Dwight" is the back-up.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Project_2_Meyer {

    static final int WEEK_LENGTH = 5;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("------------------------------------------------------------------------------------------" +
                "------------------------------------------------------");
        System.out.println();
        System.out.print("Time             |Monday           |Tuesday          |Wednesday        |Thursday         " +
                "|Friday         " +
                "  |Saturday         |Sunday           |"); //Heading of the Table
        System.out.println();
        System.out.print("------------------------------------------------------------------------------------------" +
                "------------------------------------------------------");
        System.out.println();

        ArrayList<String> time = new ArrayList<String>(); //Timeslot(s)
        time.add("8am-10am"); // shift 0
        time.add("10am-12pm"); // shift 1
        time.add("12pm-2pm"); // shift 2
        time.add("2pm-4pm");// shift 3
        time.add("4pm-6pm");// shift 4
        time.add("6pm-8pm");// shift 5
        // Days of the Week with Employee's Names and what
        // Timeslot they are working with a Back-Up
        ArrayList<String> monday = new ArrayList<String>(); //Monday
        monday.add("Jim-or-Dwight"); // shift 0
        monday.add("Andy-or-Ryan"); // shift 1
        monday.add("Mike-or-Stanley"); // shift 2
        monday.add("Kevin-or-Gabe");// shift 3
        monday.add("Toby-or-Creed");// shift 4
        monday.add("Toby-or-Gabe");// shift 5

        ArrayList<String> tuesday = new ArrayList<String>(); //Tuesday
        tuesday.add("Andy-or-Stanley"); // shift 0
        tuesday.add("Stanley-or-Andy"); // shift 1
        tuesday.add("Kevin-or-Mike"); // shift 2
        tuesday.add("Mike-or-Kevin");// shift 3
        tuesday.add("Dwight-or-Ryan");// shift 4
        tuesday.add("Ryan-or-Dwight");// shift 5

        ArrayList<String> wednesday = new ArrayList<String>(); //Wednesday
        wednesday.add("Ryan-or-Kevin"); // shift 0
        wednesday.add("Toby-or-Jim"); // shift 1
        wednesday.add("Jim-or-Toby"); // shift 2
        wednesday.add("Stanley-or-Toby");// shift 3
        wednesday.add("Creed-or-Stanley");// shift 4
        wednesday.add("Dwight-or-Creed");// shift 5

        ArrayList<String> thursday = new ArrayList<String>(); //Thursday
        thursday.add("Mike-or-Jim"); // shift 0
        thursday.add("Gabe-or-Jim"); // shift 1
        thursday.add("Andy-or-Stanley"); // shift 2
        thursday.add("Andy-or-Kevin");// shift 3
        thursday.add("Kevin-or-Mike");// shift 4
        thursday.add("Mike-or-Kevin");// shift 5

        ArrayList<String> friday = new ArrayList<String>(); //Friday
        friday.add("Kevin-or-Dwight"); // shift 0
        friday.add("Dwight-or-Toby"); // shift 1
        friday.add("Stanley-or-Dwight"); // shift 2
        friday.add("Ryan-or-Stanley");// shift 3
        friday.add("Jim-or-Mike");// shift 4
        friday.add("Mike-or-Jim");// shift 5

        ArrayList<String> saturday = new ArrayList<String>(); //Saturday
        saturday.add("Gabe-or-Creed"); // shift 0
        saturday.add("Creed-or-Gabe"); // shift 1
        saturday.add("Dwight-or-Gabe"); // shift 2
        saturday.add("Dwight-or-Andy");// shift 3
        saturday.add("Andy-or-Creed");// shift 4
        saturday.add("Creed-or-Jim");// shift 5

        ArrayList<String> sunday = new ArrayList<String>(); //Sunday
        sunday.add("Toby-or-Creed"); // shift 0
        sunday.add("Jim-or-Toby"); // shift 1
        sunday.add("Andy-or-Ryan"); // shift 2
        sunday.add("Ryan-or-Andy");// shift 3
        sunday.add("Ryan-or-Gabe");// shift 4
        sunday.add("Mike-or-Gabe");// shift 5

        for(int i = 0; i < WEEK_LENGTH; i++){ //Implementing the codes for days and timeslots
            String tim = time.get(i);
            while(tim.length() < 17)
                tim+=" ";
            String mon = monday.get(i);
            while(mon.length() < 17)
                mon+=" ";
            String tues = tuesday.get(i);
            while(tues.length() < 17)
                tues+=" ";
            String wed = wednesday.get(i);
            while(wed.length() < 17)
                wed+=" ";
            String thurs = thursday.get(i);
            while(thurs.length() < 17)
                thurs+=" ";
            String fri = friday.get(i);
            while(fri.length() < 17)
                fri+=" ";
            String sat = saturday.get(i);
            while(sat.length() < 17)
                sat+=" ";
            String sun = sunday.get(i);
            while(sun.length() < 17)
                sun+=" ";
            System.out.print(tim + "|" + mon+ "|" + tues+ "|" + wed+ "|" + thurs +
                    "|" + fri + "|" + sat + "|" + sun + "|"); //Printing the code for days and timeslots
            System.out.println();
            System.out.print("-------------------------------------------------------------------------------------" +
                    "-----------------------------------------------------------");
            System.out.println();
        }
    }
}