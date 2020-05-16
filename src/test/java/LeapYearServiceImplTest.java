import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeapYearServiceImplTest {


    @InjectMocks
    private LeapYearServiceImpl leapYearServiceImplUnderTest;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testIsLeapYear_validYearDivisibleBy400_returnTrue() {
        // Setup
        final int year = 2000;

        // Run the test
        final boolean result = leapYearServiceImplUnderTest.isLeapYear(year);

        // Verify the results
        assertTrue(result);
    }

    @Test
    void testIsLeapYear_validYearDivisibleBy4_returnTrue() {
        // Setup
        final int year = 2016;

        // Run the test
        final boolean result = leapYearServiceImplUnderTest.isLeapYear(year);

        // Verify the results
        assertTrue(result);
    }

    @Test
    void testIsLeapYear_invalidYearNotDivisibleBy400_returnFalse() {
        // Setup
        final int year = 2100;

        // Run the test
        final boolean result = leapYearServiceImplUnderTest.isLeapYear(year);

        // Verify the results
        assertFalse(result);
    }

    @Test
    void testIsLeapYear_invalidYearNotDivisibleBy4_returnFalse() {
        // Setup
        final int year = 2013;

        // Run the test
        final boolean result = leapYearServiceImplUnderTest.isLeapYear(year);

        // Verify the results
        assertFalse(result);
    }


}
