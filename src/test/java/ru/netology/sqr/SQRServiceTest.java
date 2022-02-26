package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Three Values Are Included',300,200,3",
            "'All Values Are Included',10000,100,90",
            "'Zero Values Are Included', 99,0,0"})
    void shouldSqrValuesAreIncluded(String testName, int up, int down, int expected) {
        SQRService service = new SQRService();


        int actual = service.sqrValuesAreIncluded(up, down);

        assertEquals(expected, actual);
    }
}