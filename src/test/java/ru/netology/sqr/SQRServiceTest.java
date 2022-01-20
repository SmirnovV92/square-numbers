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
}