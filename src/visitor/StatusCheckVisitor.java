package visitor;

import factory.CorporateSubscription;
import factory.FreeSubscription;
import factory.PremiumSubscription;

//Вывод статуса подписок.
public class StatusCheckVisitor implements Visitor{

    @Override
    public void visit(FreeSubscription subscription) {

        System.out.println("Бесплатная подписка. На данный момент она " +
                (subscription.isStatus() ? "активна" : "не активна"));

    }

    @Override
    public void visit(PremiumSubscription subscription) {
        System.out.println("Платная подписка. На данный момент она " +
                (subscription.isStatus() ? "активна" : "не активна"));
    }

    @Override
    public void visit(CorporateSubscription subscription) {
        System.out.println("Корпоративная подписка. На данный момент она " +
                (subscription.isStatus() ? "активна" : "не активна"));
    }
}
