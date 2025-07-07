package jungsuck.practice.ch7;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;
    private final int MAX_CHANNEL = 100;
    private final int MIN_CHANNEL = 1;
    private int prevChannel;

    public void setChannel(int channel){
        this.prevChannel = this.channel;
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return this.channel;
    }

    public int getVolume() {
        return this.volume;
    }

    public void gotoPrevChannel(){

    }

}

public class ch7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
