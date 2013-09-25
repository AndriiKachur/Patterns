package patterns.decorator.decorators;

import patterns.decorator.AbstractRifle;

public class SniperRifle extends AbstractRifleDecorator {

    public SniperRifle(AbstractRifle rifle) {
        super(rifle);
    }

    @Override
    public String description() {
        return "sniper " + super.description();
    }
}
