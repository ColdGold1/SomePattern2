import factory.Subscription;
import factory.SubscriptionFactory;
import factory.SubscriptionType;
import visitor.NotificationVisitor;
import visitor.StatusCheckVisitor;

public class Main {
    public static void main(String[] args) {

        //Инициализируем 3 вида подписок
        Subscription free = SubscriptionFactory.getSubscription(SubscriptionType.FREE);
        Subscription premium = SubscriptionFactory.getSubscription(SubscriptionType.PREMIUM);
        Subscription corporate = SubscriptionFactory.getSubscription(SubscriptionType.CORPORATE);
        free.setStatus(true);
        premium.setStatus(false);
        corporate.setStatus(false);

        //Создаём 2 посетителя
        StatusCheckVisitor statusCheckVisitor = new StatusCheckVisitor();
        NotificationVisitor notificationVisitor = new NotificationVisitor();


        System.out.println("=== Notifications ===");
        free.accept(notificationVisitor);
        premium.accept(notificationVisitor);
        corporate.accept(notificationVisitor);

        System.out.println("\n=== Status Check ===");
        free.accept(statusCheckVisitor);
        premium.accept(statusCheckVisitor);
        corporate.accept(statusCheckVisitor);
    }
}