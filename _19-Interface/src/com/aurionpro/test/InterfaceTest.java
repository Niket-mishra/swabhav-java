package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class InterfaceTest {
    public static void main(String[] args) {
        Man man = new Man();
        Boy boy = new Boy();

        atTheMovies(man);
        // atTheMovies(boy);

        atTheParty(boy);
        atTheParty(man);
    }

    private static void atTheParty(IMannerable obj) {
        obj.welcomeGreet();
        obj.departGreet();
    }

    private static void atTheMovies(IEmotionable obj) {
        obj.cry();
        obj.laugh();
    }
}
