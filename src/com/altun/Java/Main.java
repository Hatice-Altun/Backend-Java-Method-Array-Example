package com.altun.Java;

public class Main {

    public static void main(String[] args) {
	// An Array String Example: My favorite cars

        String[] brands = {"Porsche", "Lamborghini", "Maserati", "Tesla", "Land Rover"};

        brands [4] = "Land Rover Range Rover";

        int brandsLength = brands.length;

        System.out.println("The length of the array is " + brandsLength);
        System.out.println(brands[0]);
        System.out.println(brands[1]);
        System.out.println(brands[2]);
        System.out.println(brands[3]);
        System.out.println(brands[4]);

        System.out.println("My next car will be a " + brands[4] + "!");
    }
}
