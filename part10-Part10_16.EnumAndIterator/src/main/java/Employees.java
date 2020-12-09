/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    private ArrayList<Person> employees;
    
    public Employees() {
        this.employees=new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(p -> employees.add(p));
    }
    
    public void print() {        
        employees.stream()
                .forEach(p -> System.out.println(p));
    }
    public void print(Education education) {
//        employees.stream()
//                .filter(p -> p.getEducation()==education)
//                .forEach(p -> System.out.println(p));
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person pe = iterator.next();
            if (pe.getEducation()==education) {
             //   Person pe = iterator.next();
                System.out.println(pe);
            }
        }
    }
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation()==education) {
                iterator.remove();
            }
        }
    }

//    @Override
//    public String toString() {
//        return ""+employees;
//    }
    
}
