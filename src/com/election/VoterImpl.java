package com.election;

public class VoterImpl {
    public static void main(String[] args) {
        Voter object = new Voter();
        object.setName("John");
        object.setAge(18);
        System.out.println(object.getAgeCriteria());
    }

}