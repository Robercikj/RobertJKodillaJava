package kodillagoodpatterns.strategy.predictors.customers;

import kodillagoodpatterns.strategy.predictors.BalancedPredictor;

public final class CorporateCustomer extends Customer {


    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}

