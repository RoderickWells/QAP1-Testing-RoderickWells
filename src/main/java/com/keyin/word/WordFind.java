package com.keyin.word;

public class WordFind {

    public static void main(String[] args) {

        String style = new String("Bold");
        String style2 = new String("Bold");

        boolean result = style.equals("Bold"); // true
        System.out.println(result);

        result = style2.equals("Bold"); // false
        System.out.println(result);

        result = style.equals(style2); // false
        System.out.println(result);

        result = "Bold" == "Bold"; // true
        System.out.println(result);
    }
}

