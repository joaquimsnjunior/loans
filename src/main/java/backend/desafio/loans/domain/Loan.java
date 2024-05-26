package backend.desafio.loans.domain;

public class Loan {

    private final Customer customer;

    public Loan(Customer customer) {
        this.customer = customer;
    }

    public boolean isPersonalLoanAvailable() {
        return basicLoanAvailable();
    }

    public boolean isConsignmentLoanAvailable() {
        return customer.isIncomeEqualOrGreaterThan(5000.0);
    }

    public boolean isGuaranteedLoanAvailable() {
        return basicLoanAvailable();
    }

    private boolean basicLoanAvailable() {
        if (customer.isIncomeEqualOrLowerThan(3000.0)) {
            return true;
        }

        return customer.isIncomeBetween(3000.00, 5000.00)
                && customer.isAgeLowerThan(30)
                && customer.isFromLocation("SP");
    }


    public double getPersonalLoanInterestRate() {
        if (isPersonalLoanAvailable()) {
            return 4.0;
        }
        throw new LoanNotAvailableException();
    }

    public double getConsignmentLoanInterestRate() {
        if (isConsignmentLoanAvailable()) {
            return 2.0;
        }
        throw new LoanNotAvailableException();
    }

    public double getGuaranteedLoanInterestRate() {
        if (isGuaranteedLoanAvailable()) {
            return 3.0;
        }
        throw new LoanNotAvailableException();
    }
}

