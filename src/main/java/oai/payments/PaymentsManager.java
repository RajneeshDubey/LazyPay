package oai.payments;

import java.math.BigDecimal;

//Manage the UPI or bank payments
public interface PaymentsManager {

    Boolean settlePayment(String paymentmethod, String loanId, BigDecimal amount);

}
