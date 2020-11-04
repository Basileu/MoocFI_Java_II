
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author basil
 */
public class Employees {

    private List<Person> myList;

    public Employees() {
        this.myList = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        myList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            myList.add(person);
        }
    }

    public void print() {
//        for (Person person : myList) {
//            System.out.println(person);
//        }
//        Iterator<Person> myiter = myList.iterator();
        Iterator<Person> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Person pers = iterator.next();
            if (pers.getEducation() == education) {
                System.out.println(pers);
            }
        }
//        myList.stream().filter(s -> s.getEducation()==education).forEach(s->System.out.println(s));
    }
    public void fire(Education education) {
        Iterator<Person> iterator = myList.iterator();
        while (iterator.hasNext()) {
//            Person pers = iterator.next();
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }        
    }
}
