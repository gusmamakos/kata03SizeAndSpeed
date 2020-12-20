package com.mamakos.size;

import javax.management.timer.Timer;
import java.util.Date;

public class BinarySize {


    public static void main(String[] args) {
        question1();
        question2();
        question3();
    }

    public static void question3(){
        ///I’m storing 1,000,000 integers in a binary tree.
        // Roughly how many nodes and levels can I expect the tree to have?
        // Roughly how much space will it occupy on a 32-bit architecture?
        int nodes = 1_000;
        long start = new Date().getTime();
        int levels = getTreeLevels(nodes);
        long end = new Date().getTime();
        long span = end - start;
        System.out.println("For " + nodes + " integers stored in a binary tree. There will be " + nodes + " nodes, and " + levels + " levels in the tree. Loop method " + span + "ms");
        BinaryTreeUtil binaryTreeUtil = new BinaryTreeUtil();
        start = new Date().getTime();
        levels = binaryTreeUtil.getTreeLevelsRecursive(14);
        end = new Date().getTime();
        span = end - start;
        System.out.println("For " + nodes + " integers stored in a binary tree. There will be " + nodes + " nodes, and " + levels + " levels in the tree. Recursive method " + span + "ms");

    }

    public static int getTreeLevels(int numNodes){
        int levels = 1;
        for (int i = numNodes; i > 1 ; i = (int)Math.floor(i/2)) {
            levels++;
        }
        return levels;
    }
    public static void question2() {
        ///My town has approximately 20,000 residences.
        // How much space is required to store the names, addresses, and
        // a phone number for all of these (if we store them as characters)?
        String modelName = "Constantine John Mamakos";
        String modelddress = "1228 South Braddock Avenue";
        String modelPhoneNumber = "(412)352-2853";
        String model = modelName + modelddress + modelddress + modelPhoneNumber;
        int modelSize = model.getBytes().length;
        int result = modelSize * 20_000;
        System.out.println("For a population of 20,000 it would roughly consume "+ result + " bytes of data to store");


    }
    public static int getStringBinarySize(String s){
        return s.getBytes().length;
    }

    public static void question1() {
        ///roughly how many binary digits (bit) are required for the unsigned representation of
        //    1,000
        //    1,000,000
        //    1,000,000,000
        //    1,000,000,000,000
        //    8,000,000,000,000

        int THOUSAND = 1_000;
        int MILLION = 1_000_000;
        int BILLION = 1_000_000_000;
        int TRILLION = 1_000_000_000;
        long EIGHT_TRILLION = 8_000_000_000L;

        System.out.println(getBinarySize(THOUSAND));
        System.out.println(getBinarySize(MILLION));
        System.out.println(getBinarySize(BILLION));
        System.out.println(getBinarySize(TRILLION));
        System.out.println(getBinarySize(EIGHT_TRILLION));
    }

    public static String getBinarySize(int i) {
        String binary = Integer.toBinaryString(i);
        int binaryLength = binary.length();
        return i + " is " + binaryLength + " bits long " + binary;
    }

    public static String getBinarySize(long l) {
        String binary = Long.toBinaryString(l);
        int binaryLength = binary.length();
        return l + " is " + binaryLength + " bits long " + binary;
    }


}
