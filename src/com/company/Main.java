package com.company;

import com.company.singleton.AClazz;
import com.company.singleton.BClazz;
import com.company.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {

        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 값이 동일한가?");
        System.out.println(aClient.equals(bClient));

    }
}
