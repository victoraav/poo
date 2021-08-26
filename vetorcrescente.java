/*Victor Vianna - 0050016379*/

import java.util.*;

class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 10;

        Vector<Integer> v = new Vector<Integer>(n);

        for(int i=0; i<10; i++){
            System.out.printf("Digite um número: ");
                v.add(sc.nextInt());
        }

        Collections.sort(v);

        System.out.println("o Vetor em ordem crescente: " + v);

    }

}