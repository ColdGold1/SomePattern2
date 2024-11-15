package factory;

import visitor.Visitor;

//Класс корпоративной подписки.
public class CorporateSubscription extends Subscription{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void showDetails() {
        System.out.println("Корпоративная подписка для компаний");
    }
}
