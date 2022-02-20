package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Three Values Are Included',300,200,10,99,3",
            "'All Values Are Included',10000,100,10,99,90",
            "'Zero Values Are Included', 99,0,10,99,0"})
    void shouldSqrValuesAreIncluded(String testName, int up, int down, int firstValue, int secondValue, int expected) {
        SQRService service = new SQRService();


        int actual = service.sqrValuesAreIncluded(up, down, firstValue, secondValue);

        assertEquals(expected, actual);
    }
}