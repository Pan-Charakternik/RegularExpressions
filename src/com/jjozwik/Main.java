package com.jjozwik;

public class Main {

    public static void main(String[] args) {

        String string = "I am a string. Yes, I am";
        System.out.println(string);
        String yourString  = string.replaceAll("I", "You");
        System.out.println(yourString);

//        .- all characters
        String alphanumeric = "abcDeeeF12Ghhiiiijk99z";
        System.out.println(alphanumeric.replaceAll(".","@"));

//        ^ - start of the string
        System.out.println(alphanumeric.replaceAll("^abcDeee", "@@@"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijk99z";
        System.out.println(secondString.replaceAll("^abcDeee", "@@@"));

//        matches - whole string needs to matches the expression
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijk99z"));

//        $ - end of string
        System.out.println(alphanumeric.replaceAll("ijk99z$","THE END"));

//        [] - all letters are being replaced
        System.out.println(alphanumeric.replaceAll("[aei]","@"));
        System.out.println(alphanumeric.replaceAll("[aei]","I replace a letter here"));

//        [aei][Fj] All aei followed by Fj are being replaced
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","@"));

    }

}