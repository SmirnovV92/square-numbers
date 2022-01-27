package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    void shouldEnumeration() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        long actual = sqrService.enumeration(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minShouldEnumeration() {
        SQRService sqrService = new SQRService();

        int expected = 0;
        long actual = sqrService.enumeration(0, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxShouldEnumeration() {
        SQRService sqrService = new SQRService();

        int expected = 2;
        long actual = sqrService.enumeration(9500, 10000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void allShouldEnumeration() {
        SQRService sqrService = new SQRService();

        int expected = 90;
        long actual = sqrService.enumeration(100, 9801);

        Assertions.assertEquals(expected, actual);
    }
}