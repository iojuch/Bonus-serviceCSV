package ru.netology.bonus;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculateBonusArgumentsFromCSVFile(int amount, boolean registered, int bonus) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(bonus, actual);
    }
}