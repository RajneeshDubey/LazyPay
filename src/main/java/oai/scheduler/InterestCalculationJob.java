package oai.scheduler;


import com.walmart.sww.label.oai.loanmanagement.Loan;

import java.util.List;

//CronJob
public class InterestCalculationJob {

    //run everyday to see if the dueDate of a loan/credit is past.

    List<Loan> findDefaulterLoans();

    pushDefaultLoansToMQ();  -> messagePublisher()

}
