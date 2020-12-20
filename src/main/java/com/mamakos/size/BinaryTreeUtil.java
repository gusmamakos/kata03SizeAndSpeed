package com.mamakos.size;

public class BinaryTreeUtil {
    private int count;
    public int getTreeLevelsRecursive(int numNodes){
        if(numNodes == 0){
            return this.count;
        }
        this.count++;
        return getTreeLevelsRecursive((int)Math.floor(numNodes/2));

    }
}
