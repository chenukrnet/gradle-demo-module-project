package com.home.demo;


public class Calculator implements GetBonus, SayHello {
    /*
     * Правила для определения api зависимостей gradle: типы на входе и выходе, а так же дженерики класса, метода (входа и выхода)
     *
     * api: GetBonus,BonusWrapper,ClientType
     *
     * Правило для implementation зависимостей gradle: все что не вошлло в api (используется внутри классов но не торчит наружу)
     *
     * implementation: Multplicator, SayHello
     * */
    @Override
    public BonusWrapper getBonus(ClientType clientType, int currentBonus) {
        return new BonusWrapper(
                switch (clientType) {
                    case NEW_CLIENT -> new Multplicator(10).multiply(currentBonus);
                    case GOOD_FRIEND -> new Multplicator(5).multiply(currentBonus);
                    case VIP -> new Multplicator(20).multiply(currentBonus);
                    case BLOCKED_CLIENT -> new Multplicator(0).multiply(currentBonus);
                });
    }

    @Override
    public void sayMainRule() {
        System.out.println("Casino never loses");
    }
}
