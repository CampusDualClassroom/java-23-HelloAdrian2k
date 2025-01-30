package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> map = new HashMap<>();

        addMapValue(map, "person", new Person("John", "Smith"));
        addMapValue(map, "teacher", new Teacher("María", "Montessori", "Educación"));
        addMapValue(map, "police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        addMapValue(map, "doctor", new Doctor("Gregory","House", "Nefrología e infectología"));

        return map;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return map.get(key);
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.println("Clave -> " + entry.getKey());
            System.out.println("Valor -> Objeto de tipo " + entry.getValue().getClass().getSimpleName().toUpperCase());
            System.out.print("GetDetails del objeto -> -> ");
            entry.getValue().getDetails();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMapValues(createHashMap());
    }
    
}
