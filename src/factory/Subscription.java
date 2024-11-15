package factory;

import visitor.Visitor;

//Базовый класс подписки(абстрактный).
public abstract class Subscription {

    private boolean status;

    public Subscription(){}

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public abstract void accept(Visitor visitor);
    public abstract void showDetails();
}
