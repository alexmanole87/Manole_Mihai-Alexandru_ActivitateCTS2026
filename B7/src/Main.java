//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NotaDePlata ns = new NotaSimpla();
        ns.tiparire();

        System.out.println("---------------------------------");
        NotaDePlata noraRevelion = new MesajRevelionDecorator(ns);
        noraRevelion.tiparire();

        System.out.println("---------------------------------");
        NotaDePlata notaWhatever  = new WhateverDecorator(ns);
        notaWhatever.tiparire();

        System.out.println("---------------------------------");
        NotaDePlata nProgresiva = new NotaSimpla();
        nProgresiva = new MesajRevelionDecorator(nProgresiva);
        nProgresiva = new WhateverDecorator(nProgresiva);
        nProgresiva.tiparire();

        System.out.println("---------------------------------");
        NotaDePlata nCompleta = new WhateverDecorator(new MesajRevelionDecorator(new NotaSimpla()));
        nCompleta.tiparire();





    }
}