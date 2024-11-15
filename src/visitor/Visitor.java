package visitor;

import factory.CorporateSubscription;
import factory.FreeSubscription;
import factory.PremiumSubscription;

//интерфейс посетителя.
public interface Visitor {

    void visit(FreeSubscription subscription);
    void visit(PremiumSubscription subscription);
    void visit(CorporateSubscription subscription);
}
