/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neri.loves;

/**
 *
 * @author Neriza
 */
public class Person {
    public String name;
    public Integer age;
    private Double size;
    
    public Person(String name, Integer age, Double size) {
        this.name = name;
        this.age = age;
        this.size = size;
        
    }
    
    public Double getSize() {
        return this.size;
    }
    
    public void grow(Double size) {
        this.size = this.size + size;
    }
}
    
