package com.test.popular;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PolularDetectorTest {

    private PopularDetector popularDetector = new PopularDetector();

    @Test
    @DisplayName("should get most popular number")
    void shouldGetBiggestNumberFromThreePairs(){
        List<Integer> numbers = Arrays.asList(34,31,34,56,12,35,24,34,69,18);
        assertEquals(34, popularDetector.find(numbers));
    }

    @Test
    @DisplayName("should get biggest number")
    void shouldGetBiggestNumberFromFivePairs(){
        List<Integer> numbers = Arrays.asList(2,5,3,2,6,2);
        assertEquals(2, popularDetector.find(numbers));
    }

}