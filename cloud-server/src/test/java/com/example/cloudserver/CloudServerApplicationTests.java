package com.example.cloudserver;

import com.example.cloudserver.confis.HotelProperties;
import java.util.HashSet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudServerApplicationTests {

    @Autowired
    HotelProperties hotelProperties;


    @Test
    public void test1() {

        HashSet<String> ids = hotelProperties.getIds();
        System.out.println(ids.size());
    }
}
