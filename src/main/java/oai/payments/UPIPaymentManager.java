package oai.payments;

import java.math.BigDecimal;

public class UPIPaymentManager implements PaymentsManager {

    @Override
    public Boolean settlePayment(String paymentMethod, String loanId, BigDecimal amount) {
        return null;
    }
}
