package factory;

import visitor.Visitor;

//Класс бесплатной подписки.
public class FreeSubscription extends Subscription{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void showDetails() {
        System.out.println("Бесплатная подписка о ограничениями.");
    }
}
