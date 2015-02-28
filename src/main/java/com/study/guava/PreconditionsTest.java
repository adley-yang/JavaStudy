package com.study.guava;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/**
 * Project Name:java
 * Package Name:com.study.guava
 * Date:15-2-27 下午3:56
 * Copyright (c) 2015, adleyyang.cn@gmail.com All Rights Reserved.
 */
@Test
public class PreconditionsTest {

    private Person person;

    @BeforeMethod
    public void setup() {
        person = new Person(0, "Stuart", "Gunter");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void shouldNotAllowNegativeId() {
        person.setId(-1);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void shouldNotAllowNullParameter() {
        person.setFirstName(null);
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void shouldNotAllowLastNameChange() {
        person.setLastName("Surname");
    }
}
