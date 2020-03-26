package com.company;

public class Main {
    public Main(){

    }

    public static void main(String[] args) {
        sort d= new sort();
        int [] a = new int [6];
        int n = 6;
        int i;
        for(i=0;i<6;++i){
            a[i] = 0;
        }
        for(i=0;i<6;++i){
            int abc = (int)(Math.random() * 49.0D) + 1;
            a[i] = abc;
        }
        d.selection(a,n);
	
    }
}
