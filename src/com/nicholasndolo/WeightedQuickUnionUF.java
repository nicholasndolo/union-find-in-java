package com.nicholasndolo;

public class WeightedQuickUnionUF {
    private int[] id;
//    size[i] is the number of objects in the tree rooted at i
    private int[] size;
    public WeightedQuickUnionUF(int N){
        id = new int[N];
        size = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
            size[i] = 1;
        }
    }

    private int root(int node){
        while(node != id[node])
            node = id[node];

        return node;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int rootP = root(p);
        int rootQ = root(q);

        if(connected(p, q))
            return;

        if(size[rootP] < size[rootQ]){
            id[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }else {
            id[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }

    }
}
