package Classes.Part3;

import Interfaces.Part3.Observer;
// Part 3
public class NewsChannel implements Observer {
    private String channelName;

    public NewsChannel(String name) {
        this.channelName = name;
    }

    @Override
    public void update(String headline) {
        System.out.println(channelName + " received news: " + headline);
    }
}
