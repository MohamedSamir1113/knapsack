package ag;

import java.util.Random;

public class chromo {
    boolean[] chromosome;
    double fitness;
    int weight;
    int value;
    int length;

    public chromo (int numberOfItems) {
        //generate the chormo initialize
        for(int i=0; i<numberOfItems;i++)//each intex of the chromosone represent a weight if true than present if not then absenct
        {
            Random r = new Random();

            this.chromosome[i]= r.nextBoolean();//generate true of false
        }
    }

}

