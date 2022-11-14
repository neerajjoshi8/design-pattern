package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private String name;
    private String title;
    private List<Subscriber> subscribers = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public void uploadVideo(String title) {
        this.title = title;
        notifyAllSubscribers();
    }

    private void notifyAllSubscribers() {
        for (Subscriber subscriber : subscribers) {
            System.out.println("Hey " + subscriber.getName() + "! Video '" + title + "' is uploaded by " + this.name);
        }
    }

}
