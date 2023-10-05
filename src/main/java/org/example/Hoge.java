package org.example;

public class Hoge {
    private Huga huga;
    // final修飾子を付けるとテスト失敗する
//    private final Huga huga;
    private final Piyo piyo;

    public Hoge(final Huga huga, final Piyo piyo) {
        this.huga = huga;
        this.piyo = piyo;
    }

    public String hoge() {
        return huga.huga() + piyo.piyo();
    }
}
