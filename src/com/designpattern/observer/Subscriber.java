package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {
    private String name;
    private List<Channel> channels = new ArrayList<>();

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    @Override
    public void subscribeChannel(Channel channel) {
        if(!channels.contains(channel)) {
            channels.add(channel);
        }
        if(channel != null && !channel.getSubscribers().contains(this)) {
            channel.getSubscribers().add(this);
        }
    }

    @Override
    public void unSubscribeChannel(Channel channel) {
        channels.remove(channel);
        channel.getSubscribers().remove(this);
    }


}
