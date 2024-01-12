package oai.payments;

import java.math.BigDecimal;

public class AutoPayManager implements PaymentsManager{

    @Override
    public Boolean settlePayment(String paymentmethod, String loanId, BigDecimal amount) {
        return null;
    }
}
