package kodillagoodpatterns.strategy.predictors.customers;

import kodillagoodpatterns.strategy.predictors.AggressivePredictor;

public final class IndividualYoungCustomer extends Customer {

    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
