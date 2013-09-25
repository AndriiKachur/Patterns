package patterns.decorator.decorators;

import patterns.decorator.AbstractRifle;

public abstract class AbstractRifleDecorator extends AbstractRifle {
    private AbstractRifle rifle;

    protected AbstractRifleDecorator(AbstractRifle rifle) {
        this.rifle = rifle;
    }

    @Override
    public String description() {
        return rifle.description();
    }
}
