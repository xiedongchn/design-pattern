package com.xd.designpattern.flyweightpattern.ticket;

import org.junit.Test;

/**
 * Description
 *
 * @author xd
 * Created on 八月/20 21:50
 */
public class TestFlyWeightPattern {

    @Test
    public void test1() {
        ITicket iTicket = TicketFactory.queryTicket("北京", "南京");
        iTicket.showInfo("二等座");
        iTicket = TicketFactory.queryTicket("北京", "南京");
        iTicket.showInfo("软卧");
        iTicket = TicketFactory.queryTicket("北海", "深圳");
        iTicket.showInfo("软卧");

    }
}
