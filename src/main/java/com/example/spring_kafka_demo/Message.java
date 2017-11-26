package com.example.spring_kafka_demo;

import lombok.Data;

import java.util.Date;

/**
 * Message <br/>
 * Created by Leon on 2017-11-02.
 */
@Data
public class Message {

    private Long id;

    private String msg;

    private Date sendTime;
}