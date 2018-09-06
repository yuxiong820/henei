package com.henei.jobhunter.impl;

import com.henei.jobhunter.IJobhunterSevice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: dogyu
 * @Date: 2018/8/29
 * @Description:
 */
@Slf4j
@Service("jobhunterSevice")
public class JobhunterServiceImpl implements IJobhunterSevice {


    public void getJobhunterById(String id) {
        String str = "hello";
        Integer num = new Integer(55);
        String result = str+num;
        System.out.println(result);
    }


}
