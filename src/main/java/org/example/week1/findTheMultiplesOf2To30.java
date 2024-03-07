package org.example.week1;

public class findTheMultiplesOf2To30 {
    public static void main(String[] args) {
        for(int i = 2; i < 30; i++){
            if(i % 2 ==0){
                int count = 2;
                count += i;
            System.out.println(count);
        }
    }

    }
}




