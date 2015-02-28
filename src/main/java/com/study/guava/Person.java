package com.study.guava;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ComparisonChain;
/**
 * Project Name:java
 * Package Name:com.study.guava
 * Date:15-2-27 下午4:01
 * Copyright (c) 2015, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class Person implements Comparable<Person> {

    private int id;
    private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        /*
        if (id > 0) {
            throw new IllegalArgumentException("id must be greater than zero. Given '" + id + "'");
        }
        */
        Preconditions.checkArgument(id > 0, "id must be greater than zero. Given '{}'", id);
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        /*
        if (firstName == null) {
            throw new NullPointerException("firstName may not be null");
        }
        this.firstName = firstName;
        */
        this.firstName = Preconditions.checkNotNull(firstName, "firstName may not be null");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        /*
        if (id > 0) {
             throw new IllegalStateException("id must be greater than zero");
        }
        */
        Preconditions.checkState(id > 0, "id must be greater than zero");
        this.lastName = lastName;
    }

    public int compareTo(Person that) {
        return ComparisonChain.start()
                .compare(this.id, that.id)
                .compare(this.firstName, that.firstName)
                .compare(this.lastName, that.lastName)
                .result();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person that = (Person) obj;
            return Objects.equal(this.id, that.id)
                    && Objects.equal(this.firstName, that.firstName)
                    && Objects.equal(this.lastName, that.lastName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .addValue(firstName)
                .addValue(lastName)
                .toString();
    }
}
