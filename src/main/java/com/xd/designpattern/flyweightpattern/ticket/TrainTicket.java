package com.xd.designpattern.flyweightpattern.ticket;

import java.util.Random;

/**
 * Description
 *
 * @author xd
 * Created on 八月/20 21:42
 */
public class TrainTicket implements ITicket {
    private String from;// 出发地
    private String to;// 目的地
    private Integer price;// 价格

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextInt(200);
        System.out.println(from + "-" + to + ":" + price);
    }
}
