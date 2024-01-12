package oai.creditmanager;


import java.math.BigDecimal;

// Manage and evaluate user credits limits
// adjust credit limits based on history - of a userAccount
public class CreditManager {

    useCredit(String userId, BigDecimal amount);
      -> User -> Account -> deduct the credit amount
    notificationService("Message");
}
