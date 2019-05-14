public class Main {

    public static void main(String[] args){
        int tab[] = new int[10];
        tab[0] = 3;

        for(int i = 0; i < tab.length; i++){
            System.out.println("Element "+ i + " tablicy = " + tab[i]);
        }

        for(int i : tab){
            System.out.println("Element tablicy = " + i);
        }

        boolean x = true;
        while(x){
            System.out.println("jestem w pętli");
            if(x==true) x = false;
        }
        int y = 5;

        do{
            System.out.println("do while");
            y--;
        } while(y > 0); {
            System.out.println("koniec");
        }


        // tablice wielowymiarowe
        int table[][] = {{2,3,4},{5,6,7}};
        System.out.println("dlugosc tablicy" + table.length);
        for(int xx = 0; xx < table.length; xx++){
            for(int yy = 0; yy < table[1].length; yy++){
                System.out.println("x = " + xx + " y = " + yy + " table = " + table[xx][yy]);
            }
        }
    }
}
