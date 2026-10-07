package slide_examples.constructors_and_encapsulation.apps;


import slide_examples.constructors_and_encapsulation.entities.House;

public class HouseTestBed {
    static void main(String[] args) {
        House myHouse = new House("Picture", 20, "Purple");
        myHouse.display();
        System.out.println("Cost to paint: " + myHouse.calcPaintingCost(10.50));
    }
}
