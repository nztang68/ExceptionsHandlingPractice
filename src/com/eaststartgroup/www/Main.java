package com.eaststartgroup.www;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            String[] jedi = new String[5];
            jedi[4] = "Hello!";
            System.out.println(jedi[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The force is not strong in you!");
        } finally {
            System.out.println("Fear is the path to the dark.");
        }
    }
}
