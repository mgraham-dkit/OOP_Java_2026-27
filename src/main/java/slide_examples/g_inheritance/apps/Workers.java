package slide_examples.g_inheritance.apps;


import slide_examples.g_inheritance.entities.FullTimeStaff;
import slide_examples.g_inheritance.entities.Staff;

import java.util.ArrayList;

public class Workers {
    static void main(String[] args) {
        ArrayList<Staff> staffList = new ArrayList<>();

        Staff staff1 = new Staff("Helen", "Gellar", "Accounts Payable");
        staffList.add(staff1);

        ArrayList<String> benefits = new ArrayList<>();
        benefits.add("New capes every year");
        benefits.add("Potions supplies fully covered");
        FullTimeStaff fullTime = new FullTimeStaff("Alan", "Rickman", "Potions", 10000, benefits);

        staffList.add(fullTime);

        displayStaff(staffList);
    }

    private static void displayStaff(ArrayList<Staff> staffList) {
        System.out.println("Staff roster:");
        for (Staff staffMember : staffList) {
            System.out.println(staffMember);
        }
    }
}
