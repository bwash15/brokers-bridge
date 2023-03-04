package com.brokers_bridge.brokers_bridge;

import java.util.Objects;

public abstract class Person {

    private String name;
    private String email;
    private String phone;

    public Person() {

    }

    public Person(String _name, String _email, String _phone) {
        this.name = _name;
        this.email = _email;
        this.phone = _phone;
    }

    public Person(Person _person) {
        this.name = _person.name;
        this.email = _person.email;
        this.phone = _person.phone;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String _name) {
        if (_name.equals(_name) || _name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank or Null ");
        } else {
            this.name = _name;
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String _email) {
        if (_email.equals(_email) || _email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be blank or Null ");
        } else {
            this.email = _email;
        }
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String _phone) {
        if (_phone.equals(_phone) || _phone.isBlank()) {
            throw new IllegalArgumentException("Phone cannot be blank or Null ");
        } else {
            this.phone = _phone;
        }
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", email='" + getEmail() + "'" +
                ", phone='" + getPhone() + "'" +
                "}";
    }

    @Override
    public boolean equals(Object _o) {
        if (_o == this)
            return true;
        if (!(_o instanceof Person)) {
            return false;
        }
        Person person = (Person) _o;
        return Objects.equals(name, person.name) && Objects.equals(email, person.email)
                && Objects.equals(phone, person.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone);
    }

}
