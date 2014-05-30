package com.company;

/**
 * Created by Wojtek on 2014-05-25.
 * Nic więcej.
 */
public class King {
    String name;

    public King(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

	public String toString() { return "King " + name; }
        
        String getSomething() {
            return name + " i cośtam...";
        }
	
}
