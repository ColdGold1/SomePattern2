package factory;

import visitor.Visitor;

//Класс платной(премиум) подписки.
public class PremiumSubscription extends Subscription{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void showDetails() {
        System.out.println("Платная премиум-подписка. ");
    }
}
