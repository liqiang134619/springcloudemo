package com.example.common.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Liq
 * @date 2019/8/25
 */
@Service
@Slf4j
public class CommonService {

    public String test() {
        log.info("【==>  common的 日志】");
        return "xx";
    }

}
