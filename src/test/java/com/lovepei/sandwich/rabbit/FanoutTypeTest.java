package com.lovepei.sandwich.rabbit;

import com.lovepei.sandwich.rabbit.FanoutType.FanoutSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by cumt_ on 2017/1/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FanoutTypeTest {

    @Autowired
    private FanoutSender fanoutSender;

    @Test
    public void testFanoutMq(){
        fanoutSender.send();
    }

}
