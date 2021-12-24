package com.company.singleton;

public class SocketClient {
    private static SocketClient socketClient = null; // 싱글톤은 자기자신을 객체로 가지고 있어야함.

    private SocketClient(){ // 싱글톤은 기본 생성자를 private 으로 막아야함.

    }

    // static method를 통해 getinstance 라는 method를  제공 해야함.
    public static SocketClient getInstance(){
        if(socketClient == null){ // 없는경우 생성 후 리턴
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }

}
