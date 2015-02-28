package com.study.guava;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;
/**
 * Project Name:java
 * Package Name:com.study.guava
 * Date:15-2-27 下午4:43
 * Copyright (c) 2015, adleyyang.cn@gmail.com All Rights Reserved.
 */
@Test
public class ComparisonTest {

    public void shouldComparePersons() {
        final Person p1 = new Person(0, "Stuart", "Gunter");
        final Person p2 = new Person(0, "Stuart", "Gunter");
        final Person p3 = new Person(0, "Stuart", "Other");

        assertTrue(p1.compareTo(p2) == 0);
        assertTrue(p1.compareTo(p3) < 0);
    }
}