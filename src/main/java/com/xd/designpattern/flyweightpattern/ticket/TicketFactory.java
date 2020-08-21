package com.xd.designpattern.flyweightpattern.ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂
 *
 * @author xd
 * Created on 八月/20 21:45
 */
public class TicketFactory {
    private static Map<String, ITicket> pool = new ConcurrentHashMap<>();

    public static ITicket queryTicket(String from, String to) {
        String key = from + to;
        if (pool.containsKey(key)) {
            System.out.println("使用缓存:" + pool.get(key));
            return pool.get(key);
        }
        System.out.println("缓存中不存在,创建对象:" + key);
        ITicket ticket = new TrainTicket(from, to);
        pool.put(key, ticket);
        return ticket;
    }
}
