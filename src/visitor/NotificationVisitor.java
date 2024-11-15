package visitor;

import factory.CorporateSubscription;
import factory.FreeSubscription;
import factory.PremiumSubscription;

//Вывод уведомления.
public class NotificationVisitor implements Visitor{

    @Override
    public void visit(FreeSubscription subscription) {
        System.out.println("Уведомление. Мы добавили новые фичи для бесплатной версии.");
    }

    @Override
    public void visit(PremiumSubscription subscription) {
        System.out.println("Уведомление. Ознакомьтесь с фичами платной подписки.");
    }

    @Override
    public void visit(CorporateSubscription subscription){
        System.out.println("Уведомление. Ознакомьтесь с фичами корпоративной подписки.");
    }
}
