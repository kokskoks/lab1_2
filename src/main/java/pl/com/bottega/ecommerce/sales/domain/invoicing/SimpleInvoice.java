package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class SimpleInvoice extends Invoice {
    SimpleInvoice(Id invoiceId, ClientData client) {
        super(invoiceId, client);
    }
}
