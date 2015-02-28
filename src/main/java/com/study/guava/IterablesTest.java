package com.study.guava;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.testng.annotations.Test;

import javax.annotation.Nullable;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
/**
 * Project Name:java
 * Package Name:com.study.guava
 * Date:15-2-27 下午5:12
 * Copyright (c) 2015, adleyyang.cn@gmail.com All Rights Reserved.
 */
@Test
public class IterablesTest {

    private List<String> strings = ImmutableList.of("something", "another", "thing", "test");

    public void shouldCheckIfAllTrue() {
        final Predicate<String> longerThan5Chars = new Predicate<String>() {
            @Override
            public boolean apply(@Nullable String input) {
                return input != null && input.length() > 5;
            }
        };

        final boolean allLongerThan5Chars = Iterables.all(strings, longerThan5Chars);
        final boolean someLongerThan5Chars = Iterables.any(strings, longerThan5Chars);

        assertFalse(allLongerThan5Chars);
        assertTrue(someLongerThan5Chars);
    }

    public void shouldReturnFirstItemStartingWithT() {

        final String firstItemStartingWithT = Iterables.find(strings, new Predicate<String>() {
            @Override
            public boolean apply(@Nullable String input) {
                return input != null && input.startsWith("t");
            }
        });

        assertEquals("thing", firstItemStartingWithT);
    }

    public void shouldReturnDefaultItem() {

        final String defaultItem = "hello";

        final String result = Iterables.find(strings, new Predicate<String>() {
            @Override
            public boolean apply(@Nullable String input) {
                return input != null && input.startsWith("X");
            }
        }, defaultItem);

        assertEquals(defaultItem, result);
    }
}