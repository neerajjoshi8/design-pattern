package com.designpattern.observer;

public interface Observer {
    void subscribeChannel(Channel channel);

    void unSubscribeChannel(Channel channel);
}
