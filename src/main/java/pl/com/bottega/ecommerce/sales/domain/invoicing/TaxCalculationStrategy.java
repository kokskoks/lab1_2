package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.util.List;

public interface TaxCalculationStrategy {
    Tax calculateTax(RequestItem requestItem);
}
