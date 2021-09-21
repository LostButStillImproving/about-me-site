package org.lostbutstillimproving.person;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Random;


@ApplicationScoped
public class PersonStore {

    private List<Person> persons;
    
    @PostConstruct
    void initPersons() {
        persons = createPersons();
    }

    private List<Person> createPersons() {

        return List.of(
                new Person("Mike", "30", "Næstved", List.of("chillin"), List.of("Chill even harder")),
                new Person("Halifax", "3", "Skovlunde",
                        List.of("chillin", "walking", "playing with sticks", "playing with sticks", "Playing with sticks"),
                        List.of("Play with more sticks", "walk more")));
    }

    public Person getRandomPerson() {

        return persons.get(new Random().nextInt(persons.size()));
    }
}
