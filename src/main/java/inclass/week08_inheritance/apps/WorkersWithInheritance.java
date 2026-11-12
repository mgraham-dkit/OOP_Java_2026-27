package inclass.week08_inheritance.apps;

import inclass.week08_inheritance.entities.InheritingFullTimeStaff;
import inclass.week08_inheritance.entities.Staff;

import java.util.ArrayList;

public class WorkersWithInheritance {
    static void main(String[] args) {
        ArrayList<Staff> staffList = new ArrayList<>();

        // Make staff member and add to staff list
        Staff staff1 = new Staff("D000341", "Helen", "Gellar", "Accounts Payable");
        staffList.add(staff1);

        // Make inheriting full time staff member and add to SAME staff list
        // This is possible because InheritingFullTimeStaff inherits from/extends Staff
        // It "is a" type of Staff
        ArrayList<String> benefits = new ArrayList<>();
        benefits.add("New capes every year");
        benefits.add("Potions supplies fully covered");
        InheritingFullTimeStaff fullTime = new InheritingFullTimeStaff("D34232", "Alan", "Rickman", "Potions", 10000,
                benefits);
        staffList.add(fullTime);

        // Display staff
        displayAllStaff(staffList);
    }

    private static void displayAllStaff(ArrayList<Staff> staffList) {
        System.out.println("Staff list:");
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
    }
}
