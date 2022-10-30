package ag;

import java.util.Scanner;

public class ag {
    int populationSize;
    int maxGeneration;
    chromo[] populationArray;
    double crossoverProp;
    double mutationProp;
    int numberOfItems=5;
    int[][] weightNvalue = new int[2][numberOfItems];

    public void initializeweightNvalue()
    {
        for(int i=0;i<numberOfItems;i++)
        {
            Scanner myObj = new Scanner(System.in);
            weightNvalue[0][i]=myObj.nextInt();
            weightNvalue[1][i]=myObj.nextInt();
        }
    }
    public void initializePopulation(int populationSize) {
        //generate chormo
    }

    public void start() {
        for(int i=0 ; i<maxGeneration; i++)
        {
            getFitness(null);
            selection(null);
            crossover(null);
            mutation(null);
            replacement(null);
        }
    }
    public double getFitness(boolean []chromosome) {
        //if equal to goal break
        return 0;
    }
    public void selection(boolean []chromosome) {

    }
    public void crossover(boolean []chromosome) {

    }
    public void mutation(boolean []chromosome) {

    }
    public void replacement(boolean []chromosome) {

    }
    public void printvalue()
    {
        for(int i=0; i<5; i++)
        {
            System.out.print(weightNvalue[0][i]);


        }
        System.out.println();
        for(int i=0; i<5; i++)
        {


            System.out.print(weightNvalue[1][i]);
        }

    }


    public static void main(String[] args) {
        System.out.println("please enter the number of items");
        Scanner myObj = new Scanner(System.in);
        myObj.nextInt();

        ag obj= new ag();
        obj.initializeweightNvalue();
        obj.printvalue();

    }


}