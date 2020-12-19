package com.mamakos.size;

import java.math.BigInteger;

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
        int nodes = 7;
        double levels = 1 + Math.floor(log2(nodes));
        System.out.println("For " + nodes + " integers stored in a binary tree. There will be " + nodes + " nodes, and " + levels + " levels in the tree.");

    }
    public static int log2(int x)
    {
        return (int) (Math.log(x) / Math.log(2));
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
        long EightTrillion = 8_000_000_000L;

        System.out.println(getBinarySize(THOUSAND));
        System.out.println(getBinarySize(MILLION));
        System.out.println(getBinarySize(BILLION));
        System.out.println(getBinarySize(TRILLION));
        System.out.println(getBinarySize(EightTrillion));
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
