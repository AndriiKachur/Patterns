package patterns.decorator.decorators;

import patterns.decorator.AbstractRifle;

public class RussianSniperRifle extends AbstractRifleDecorator {

    public RussianSniperRifle(AbstractRifle rifle) {
        super(rifle);
    }

    @Override
    public String description() {
        return "russian " + super.description();
    }
}
