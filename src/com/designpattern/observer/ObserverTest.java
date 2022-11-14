package com.designpattern.observer;

public class ObserverTest {

    public static void main(String[] args) {
        Channel techie = new Channel("techie");
        Channel art = new Channel("art");

        Subscriber s1 = new Subscriber("s1");
        Subscriber s2 = new Subscriber("s2");
        Subscriber s3 = new Subscriber("s3");
        Subscriber s4 = new Subscriber("s4");
        Subscriber s5 = new Subscriber("s5");

        s1.subscribeChannel(techie);
        s1.subscribeChannel(art);

        s2.subscribeChannel(art);
        s3.subscribeChannel(techie);

        s4.subscribeChannel(techie);
        s5.subscribeChannel(art);
        s5.subscribeChannel(techie);

        techie.uploadVideo("Introduction to Programming");
        art.uploadVideo("How to draw a House");

        s5.unSubscribeChannel(techie);
        s3.unSubscribeChannel(techie);

        System.out.println("===After unsubscribing channels===");

        techie.uploadVideo("Introduction to Programming");
        art.uploadVideo("How to draw a House");
    }
}
/*
OUTPUT:
Hey s1! Video 'Introduction to Programming' is uploaded by techie
Hey s3! Video 'Introduction to Programming' is uploaded by techie
Hey s4! Video 'Introduction to Programming' is uploaded by techie
Hey s5! Video 'Introduction to Programming' is uploaded by techie
Hey s1! Video 'How to draw a House' is uploaded by art
Hey s2! Video 'How to draw a House' is uploaded by art
Hey s5! Video 'How to draw a House' is uploaded by art
===After unsubscribing channels===
Hey s1! Video 'Introduction to Programming' is uploaded by techie
Hey s4! Video 'Introduction to Programming' is uploaded by techie
Hey s1! Video 'How to draw a House' is uploaded by art
Hey s2! Video 'How to draw a House' is uploaded by art
Hey s5! Video 'How to draw a House' is uploaded by art
 */
