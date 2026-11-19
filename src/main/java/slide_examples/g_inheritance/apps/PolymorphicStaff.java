package slide_examples.g_inheritance.apps;

import slide_examples.g_inheritance.entities.FullTimeStaff;
import slide_examples.g_inheritance.entities.PartTimeStaff;
import slide_examples.g_inheritance.entities.Staff;

import java.util.ArrayList;
import java.util.Collections;

public class PolymorphicStaff {
    static void main(String[] args) {
        ArrayList<Staff> staffList = new ArrayList<>();

        // Make a Staff object
        Staff helen = new Staff("Helen", "Gellar", "Accounts Payable");
        staffList.add(helen);

        // Make a FullTimeStaff object called Alan
        ArrayList<String> alanBenefits = new ArrayList<>();
        alanBenefits.add("New capes every year");
        alanBenefits.add("Potions supplies fully covered");
        FullTimeStaff alan = new FullTimeStaff("Alan", "Rickman", "Potions", 10000, alanBenefits);
        // Add Alan to staff list
        staffList.add(alan);

        // Make a FullTimeStaff object called Jenny
        ArrayList<String> jennyBenefits = new ArrayList<>();
        jennyBenefits.add("Fresh cut flowers delivered weekly");
        jennyBenefits.add("Free health care");
        jennyBenefits.add("Free lunch in the office three times a week");

        FullTimeStaff jenny = new FullTimeStaff("Jenny", "Benny", "Sales", 85000, jennyBenefits);
        // Add Jenny to the staff list
        staffList.add(jenny);

        // Create a PartTimeStaff object called ralph
        PartTimeStaff ralph = new PartTimeStaff("Wreck-It", "Ralph", "Demolition", 28.55, 23);
        // Add ralph to the staff list
        staffList.add(ralph);

        // Add null to list to check what type checking will do
        staffList.add(null);
        // Shuffle the list so it's not in a predictable order
        Collections.shuffle(staffList);

        // Print off the staff in the list (this will show everyone)
        // ralph, jenny and alan are all staff as well as being their own specific "created" types
        displayStaff(staffList);

        // print off staff list again using the switch statement approach
        displayStaffUsingSwitch(staffList);
    }

    private static void displayStaff(ArrayList<Staff> staffList) {
        System.out.println("***** Staff roster *****");
        System.out.println("---------------------------");
        for (Staff staffMember : staffList) {
            // Check if current object is a full time staff member
            if(staffMember instanceof FullTimeStaff fulltime){
                // If so, treat them as one by using the fulltime variable
                // This has been declared as a FullTimeStaff type
                System.out.println(fulltime.getFirstName() + " is a FullTime staff member");
                fulltime.displayBenefits();
                // Check if current object is a part time staff member
            }else if(staffMember instanceof PartTimeStaff parttime){
                // If so, treat them as one by using the parttime variable
                // This has been declared as a PartTimeStaff type
                System.out.println(parttime.getFirstName() + " is a PartTime staff member. Their current wage is €" + parttime.calcWage());
            }else if(staffMember == null){
                System.out.println("Current slot in list is null");
            }else{
                System.out.println(staffMember.getFirstName() + " is a Staff staff member with no specific features.");
            }
            System.out.println("---------------------------");
        }
    }

    private static void displayStaffUsingSwitch(ArrayList<Staff> staffList) {
        System.out.println("##### Staff roster #####");
        System.out.println("---------------------------");
        for (Staff staffMember : staffList) {
            switch (staffMember) {
                // Check if current object is a full time staff member
                case FullTimeStaff fulltime -> {
                    // If so, treat them as one by using the fulltime variable
                    // This has been declared as a FullTimeStaff type
                    System.out.println(fulltime.getFirstName() + " is a FullTime staff member");
                    fulltime.displayBenefits();
                }
                // Check if current object is a part time staff member
                case PartTimeStaff parttime ->
                        // If so, treat them as one by using the parttime variable
                        // This has been declared as a PartTimeStaff type
                        System.out.println(parttime.getFirstName() + " is a PartTime " +
                                "staff member. Their current wage is €" + parttime.calcWage());
                // Check to make sure this slot in the list isn't actually empty (null)
                case null ->
                        System.out.println("Current slot in list is null");
                // Handle the general type - there are no other types left
                // Also can be done with case Staff staff ->
                default ->
                        System.out.println(staffMember.getFirstName() + " is a " +
                                "Staff staff member with no specific features.");
            }
            System.out.println("---------------------------");
        }
    }
}
