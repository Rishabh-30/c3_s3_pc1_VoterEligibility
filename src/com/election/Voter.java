package com.election;

public class Voter {
    private String name;
    private int age;
    static int VOTER_ELIGIBLE_AGE = 18;
    public Voter(){
        name = "";
        age = 0 ;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getAgeCriteria(){
        if (age>=18)
            return (name + " Is Eligible to vote");
        else if (age>0 && age<18)
            return (name + " Is not Eligible to vote");
        else if (age<0)
            return ("age can't be negative");

        return name;
    }
}