package com.company;

public class Dictionary {
    private static String[] names = {
        "Name1", "Name2"
    };

    public static String[] getNames() {
        return names;
    }
    private static String[] authors = {
            "Author1", "Author2"
    };

    public static String[] getAuthors() {
        return authors;
    }

    private static String[] manufacturers = {
            "Man1", "Man2"
    };

    public static String[] getManufacturers() {
        return manufacturers;
    }

    private static String[] states = {
            "Bad", "Medium", "Good"
    };

    public static String[] getStates() {
        return states;
    }
}
