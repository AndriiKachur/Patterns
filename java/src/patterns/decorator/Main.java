package patterns.decorator;

import patterns.decorator.decorators.RussianSniperRifle;
import patterns.decorator.decorators.SniperRifle;
import patterns.decorator.decorators.Vintorez;

public class Main {
    public static void main(String[] args) {
        AbstractRifle rifle = new Rifle();
        System.out.println(rifle.description());

        rifle = new SniperRifle(rifle);
        System.out.println(rifle.description());

        rifle = new RussianSniperRifle(rifle);
        System.out.println(rifle.description());

        rifle = new Vintorez(rifle);
        System.out.println(rifle.description());
    }
}
