/*
Zaimplementowałem przykładowe opcje użycia całego schematu które są tylko przykładem
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        boolean work = true;
        int response;
        ArrayList<Tree> wood = new ArrayList<Tree>();
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to our new, great wood!");

        while(work) {
            System.out.println("Choose what you want to do:");
            System.out.println("1 - plant new leafy");
            System.out.println("2 - add 1 year to our wood");
            System.out.println("3 - look on our trees");
            System.out.println("4 - send for lumberjacks");
            System.out.println("5 - leave our awesome forest");
            try{
                response = in.nextInt();
                switch(response){
                    case 1:
                        Branch trunk = new Branch();
                        Leafy tree1 = new Leafy(trunk);
                        System.out.println(tree1.toString());
                        Leafy tree = new Leafy(trunk);
                        wood.add(tree);
                        break;
                    case 2:
                        wood.get(0).grow(1);
                        break;
                    case 3:
                        System.out.println("Size: " + wood.get(0).trunk.getSize());
                        System.out.println("Years: " + wood.get(0).trunk.getAge());
                        System.out.println("How many leafs: " + wood.get(0).trunk.getNumbersOfLeafs());
                        System.out.println("How many branches: " + wood.get(0).trunk.getNumbersOfBranches());
                        break;
                    case 4:
                        wood.get(0).cut(wood.get(0).trunk);
                        break;
                    case 5:
                        work = false;
                        break;
                    default:
                        System.out.println("Choose one number from list");
                        break;
                }
            } catch (Exception err){
                System.out.println("Incorrect choice!");
                System.out.println(err);
                in.next();
            }
        }
    }
}
