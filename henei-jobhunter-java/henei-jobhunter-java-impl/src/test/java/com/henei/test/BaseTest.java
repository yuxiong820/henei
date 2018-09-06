package com.henei.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * @Author: dogyu
 * @Date: 2018/9/6
 * @Description:
 */

@ContextHierarchy({
        @ContextConfiguration(locations = "classpath*:META-INF/spring/*.xml")
})
public class BaseTest extends AbstractTestNGSpringContextTests {
}
