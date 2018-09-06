package com.henei.test;

import com.henei.jobhunter.IJobhunterSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

/**
 * @Author: dogyu
 * @Date: 2018/8/29
 * @Description:
 */


public class JobhunterTest extends BaseTest{

    @Autowired
    private IJobhunterSevice jobhunterSevice;

    @Test
    public void testGetJobhunterById(){
        jobhunterSevice.getJobhunterById("test");
    }

}
