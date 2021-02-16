package com.company;

import java.util.*;


public class PhoneBook {
    private String surname;
    private String phoneNumber;
    Map phoneBook = new HashMap();



//    public PhoneBook(String surname, String phoneNumber) {
//        this.surname = surname;
//        this.phoneNumber = phoneNumber;
//    }

    public void add(String surname, String phoneNumber){
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        List newPhoneBook = new ArrayList();
        newPhoneBook = (List) phoneBook.get(surname);
        newPhoneBook.add(phoneNumber);
        phoneBook.put(surname, newPhoneBook);
    }

    public String get(String surname){
        return (String) phoneBook.get(surname);
    }

//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PhoneBook phoneBook = (PhoneBook) o;
//        return Objects.equals(surname, phoneBook.surname) &&
//                Objects.equals(phoneNumber, phoneBook.phoneNumber);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(surname, phoneNumber);
//    }
//
//    @Override
//    public String toString() {
//        return "PhoneBook{" +
//                "surname='" + surname + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
//    }







}
