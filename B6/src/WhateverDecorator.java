public class WhateverDecorator extends DecoratorAbstract {
    public WhateverDecorator(NotaDePlata np) {
        super(np);
    }

    @Override
    public void tiparire() {
        super.tiparire();
        adaugaWahteevr();
    }

    private void adaugaWahteevr() {
        System.out.println("Whatever!!!!");
    }
}
