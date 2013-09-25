package patterns.decorator.decorators;

import patterns.decorator.AbstractRifle;

public class Vintorez extends AbstractRifleDecorator {
    public Vintorez(AbstractRifle rifle) {
        super(rifle);
    }

    @Override
    public String description() {
        return "9mm assault " + super.description() + " with silencer";
    }
}
