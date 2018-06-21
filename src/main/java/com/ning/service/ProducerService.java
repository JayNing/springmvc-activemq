package com.ning.service;

import javax.jms.Destination;

/**
 * 生产者接口
 *
 * @author ning
 * @create 2018-06-21 10:04
 **/
public interface ProducerService {
    void sendMessage(Destination destination, String s);
}