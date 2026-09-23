package slide_examples.introducing_classes.apps;

import slide_examples.introducing_classes.entities.House;

public class HouseTestBed {
    static void main(String[] args) {
        House myHouse = new House();
        myHouse.numRooms = 20;
        System.out.println("My house has " + myHouse.numRooms + " rooms!");

        myHouse.display();
        System.out.println("Cost to paint: " + myHouse.calcPaintingCost(10.50));
    }
}
