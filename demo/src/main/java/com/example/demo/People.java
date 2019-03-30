package com.example.demo;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public  abstract class People <PersonType extends Person> implements  Iterable<PersonType>{

protected List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public People() {

    }

    public void add(PersonType Person){
        personList.add(Person);
    }

    public void remove(PersonType Person){
        personList.remove(Person);
    }
    public Integer size(){
       return personList.size();
    }
    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> personsAdding) {
        for (PersonType person : personsAdding) {
            personList.add(person);
        }
    }
    public PersonType findById(Long id){
        PersonType personFound = null;
        for (PersonType person : personList) {
            if(person.getId() == id){
                personFound = person;
                return personFound;
            }
        }
        return null;
    }
    public List<PersonType> findAll(){
        return  personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }

    @Override
    public String toString() {
        return "People{" +
                "personList=" + personList +
                '}';
    }
}
