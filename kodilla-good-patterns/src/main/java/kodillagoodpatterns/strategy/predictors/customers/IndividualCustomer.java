package kodillagoodpatterns.strategy.predictors.customers;

import kodillagoodpatterns.strategy.predictors.ConservativePredictor;

public final class IndividualCustomer extends Customer {

    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}