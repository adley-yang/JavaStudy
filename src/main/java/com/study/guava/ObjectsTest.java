package com.study.guava;
import com.google.common.base.Objects;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Project Name:java
 * Package Name:com.study.guava
 * Date:15-2-27 下午4:37
 * Copyright (c) 2015, adleyyang.cn@gmail.com All Rights Reserved.
 */
@Test
public class ObjectsTest {

    private Person person;

    @BeforeMethod
    public void setup() {
        person = new Person(1, "Bob", "Smith");
    }

    public void shouldGetFirstNonNullItem() {
        assertEquals("first", Objects.firstNonNull("first", "second"));
        assertEquals("second", Objects.firstNonNull(null, "second"));

        assertEquals(person, Objects.firstNonNull(null, person));
    }

    public void shouldGetPersonAsString() {
        final String expected = "Person{id=1, Bob, Smith}";

        assertEquals(expected, person.toString());
    }
}