package com.lovepei.sandwich.rabbit;

import com.lovepei.sandwich.rabbit.topicType.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicTypeTest {
    @Autowired
    private TopicSender topicSender;

    /**
     * 測試topic模式，檔綁定到topic.message時候，都能接收到
     * 若是topic.# 衹有topic.#能接收到
     */
    @Test
    public void testTopicMq() {

        topicSender.send();
        topicSender.send1();
        topicSender.send2();

    }
}
