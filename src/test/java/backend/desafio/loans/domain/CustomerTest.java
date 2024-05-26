package backend.desafio.loans.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CustomerTest {

    @Nested
    class isIncomeEqualOrLowerThan {

        @Test
        void shouldBeTrueWhenIncomeIsEqual() {
            var customer = new Customer(25, "123.456.789-00", "Kim Silva", 5000.00, "SP");

            assertTrue(customer.isIncomeEqualOrLowerThan(5000.0));
        }
    }
}