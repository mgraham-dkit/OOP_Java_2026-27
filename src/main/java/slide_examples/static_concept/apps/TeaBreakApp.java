package slide_examples.static_concept.apps;

import slide_examples.static_concept.entities.Cup;

import java.util.ArrayList;
import java.util.Random;

public class TeaBreakApp {
    static void main(String[] args) {
        Random randomGenerator = new Random();

        String [] colours = {"red", "blue", "green"};
        ArrayList<Cup> cups = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int colourIndex = randomGenerator.nextInt(3);
            String randomColour = colours[colourIndex];

            Cup cup = new Cup(randomColour + " cup", randomColour);
            cups.add(cup);
        }

        for(Cup cup : cups){
            cup.display();
        }

        Cup.changeDimensions(20, 30);

        for(Cup cup : cups){
            cup.display();
        }
    }
}
