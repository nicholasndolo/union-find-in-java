package com.nicholasndolo;

public class Main {
    public static void main(String[] args) {
       QuickFindUF find = new QuickFindUF(10);

       find.union(9, 4);

       var result = find.connected(9, 4);
       System.out.println(result);


    }
}
