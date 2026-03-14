import org.example.Instructor.TuitionFeePayment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TuitionFeePaymentTest {
    void setup() {
        tuitionFeePayment = new TuitionFeePayment();
    }

    @Test
    void("Calculate Tuition Fee")
    void shouldCalculateCorrectTuitionFeeWithNoDiscount() {

        assertEquals(expected:5000, tuitionFeePayment.calculateTuitionFee(units:15, discountRate 0));
    }

    @Test
    void shouldCalculateCorrectTuitionFeeWithDiscount() {

        assertEquals(expected:4500, tuitionFeePayment.calculateTuitionFee(unit:15, discountRate:0.10));
    }

    @Test
    void shouldMakeAPaymentWorth500() {
        tuitionFeePayment.calculateTuitionFee(units:15, discountRate:0);

        tuitionFeePayment.makePayment(amount:500);

        assertEquals(expected:4500, tuitionFeePayment.getBalance());
    }

    @Test
    void shouldCheckIfFullyPaid() {
        tuitionFeePayment.calculateTuitionFee(units:15, discountRate:0);
        tuitionFeePayment.makePayment(amount:5000);
    }

    assertTrue(tuitionFeePayment.isFullyPaid());
    }
}

