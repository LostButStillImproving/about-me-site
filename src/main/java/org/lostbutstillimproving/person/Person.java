package org.lostbutstillimproving.person;

import java.util.List;

public class Person {

    String name;
    String age;
    String hometown;
    List<String> hobbies;
    List<String> causes;

    public Person(String name, String age, String hometown, List<String> hobbies, List<String> causes) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.hobbies = hobbies;
        this.causes = causes;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public List<String> getCauses() {
        return causes;
    }
}
