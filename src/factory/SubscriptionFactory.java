package factory;

//Фабрика
public class SubscriptionFactory {

    //Фабричный метод, возвращающий объект класса-наследника, в зависимости от
    //параметра, представляющего собой тип подписки.
    public static Subscription getSubscription(SubscriptionType type){
        return switch (type){
            case SubscriptionType.FREE -> new FreeSubscription();
            case SubscriptionType.PREMIUM -> new PremiumSubscription();
            case SubscriptionType.CORPORATE -> new CorporateSubscription();
            default -> throw new RuntimeException("Упс. Что-то пошло не так");
        };
    }
}
