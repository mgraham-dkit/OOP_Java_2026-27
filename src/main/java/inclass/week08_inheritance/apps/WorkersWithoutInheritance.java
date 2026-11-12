package inclass.week08_inheritance.apps;

import inclass.week08_inheritance.entities.FullTimeStaff;
import inclass.week08_inheritance.entities.Staff;

import java.util.ArrayList;

public class WorkersWithoutInheritance {
    static void main(String[] args) {
        ArrayList<Staff> staffList = new ArrayList<>();

        Staff staff1 = new Staff("D000341", "Helen", "Gellar", "Accounts Payable");
        staffList.add(staff1);

        ArrayList<String> benefits = new ArrayList<>();
        benefits.add("New capes every year");
        benefits.add("Potions supplies fully covered");
        FullTimeStaff fullTime = new FullTimeStaff("D34232", "Alan", "Rickman", "Potions", 10000, benefits);

        ArrayList<FullTimeStaff> fullTimers = new ArrayList<>();
        fullTimers.add(fullTime);

        // Display staff members
        displayStaff(staffList);

        // Display full time staff members
        displayFullTimeStaff(fullTimers);
    }

    private static void displayFullTimeStaff(ArrayList<FullTimeStaff> fullTimers) {
        System.out.println("Full time staff list");
        for (FullTimeStaff fullTimer : fullTimers) {
            System.out.println(fullTimer);
        }
    }

    private static void displayStaff(ArrayList<Staff> staffList) {
        System.out.println("Staff list:");
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
    }
}
