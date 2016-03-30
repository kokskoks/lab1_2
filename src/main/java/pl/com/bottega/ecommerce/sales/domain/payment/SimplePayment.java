package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class SimplePayment extends Payment {


    public SimplePayment(Id aggregateId, ClientData clientData, Money amount) {
        super(aggregateId, clientData, amount);
    }

    @Override
    public Payment rollBack() {
        Id id = Id.generate();

        return PaymentFactory.createPaymentInstance(id, clientData, amount.multiplyBy(-1));
    }
}
