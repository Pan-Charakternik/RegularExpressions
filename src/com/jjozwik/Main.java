package com.jjozwik;

public class Main {

    public static void main(String[] args) {

        String string = "I am a string. Yes, I am";
        System.out.println(string);
        String yourString  = string.replaceAll("I", "You");
        System.out.println(yourString);

//        .- all characters
        String alphanumeric = "abcDeeeF12Ghhiiiijk99z";
        System.out.println(alphanumeric.replaceAll(".","#"));

//        ^ - start of the string
        System.out.println(alphanumeric.replaceAll("^abcDeee", "###"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijk99z";
        System.out.println(secondString.replaceAll("^abcDeee", "###"));

//        matches - whole string needs to matches the expression
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijk99z"));

//        $ - end of string
        System.out.println(alphanumeric.replaceAll("ijk99z$","THE END"));

//        [] - all letters are being replaced
        System.out.println(alphanumeric.replaceAll("[aei]","#"));
        System.out.println(alphanumeric.replaceAll("[aei]","(u_u)"));

//        [aei][Fj] All aei followed by Fj are being replaced
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","#"));

//        [Hh]arry - search for all Harry strings regardless of case size
        System.out.println("Harry".replaceAll("[Hh]arry","harry"));

//       [^ej] - replacing all letters except ones stated in brakets
        System.out.println(alphanumeric.replaceAll("[^ej]", "#"));

//        [a-f3-8] - range a-f and 3-8
        System.out.println(alphanumeric.replaceAll("[a-f3-8]", "#"));

//        for case sensitivity
        System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]", "#"));
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "#"));

//        all digits
        System.out.println(alphanumeric.replaceAll("[0-9]", "#"));
        System.out.println(alphanumeric.replaceAll("\\d", "#"));

//        all non-digits
        System.out.println(alphanumeric.replaceAll("\\D", "#"));

        String hasWhitespace = "I have blanks and\ta tab, and also a newLine\n";
        System.out.println(hasWhitespace);

//        whitespace removal
        System.out.println(hasWhitespace.replaceAll("\\s",""));
        System.out.println(hasWhitespace.replaceAll("\t","#"));

//        only Tab,Spaces & NewLine remains
        System.out.println(hasWhitespace.replaceAll("\\S",""));

//        all except spaces,tabs, newlines
        System.out.println(alphanumeric.replaceAll("\\w", "#"));
        System.out.println(hasWhitespace.replaceAll("\\w", "#"));

//        boundires first and last char of each word
        System.out.println(hasWhitespace.replaceAll("\\b", "#"));

//        number in curly braces indicates how many letters needs to match before replacing
//        "^abcDeee" == "^abcDe{3}"
        System.out.println(alphanumeric.replaceAll("^abcDe{3}","#"));
//        more than 1 e
        System.out.println(alphanumeric.replaceAll("^abcDe+","#"));
//        all words starting with abdDe regardless of next character
        System.out.println(alphanumeric.replaceAll("^abcDe*","#"));
//      replace word starting with ^abcDe and between 2-5 e letters
        System.out.println(alphanumeric.replaceAll("^abcDe{2,5}","#"));
//        1 h follow by 0 or more i followed by j
        System.out.println(alphanumeric.replaceAll("h+i*j","#"));
    }

}