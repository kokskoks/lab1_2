package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;

import java.util.List;

public class ClientRequest {

    private ClientData client;
    private List<RequestItem> items;

    public ClientRequest(ClientData client, List<RequestItem> items) {
        this.client = client;
        this.items = items;
    }

    public ClientData getClient() {
        return client;
    }

    public List<RequestItem> getItems() {
        return items;
    }
}
