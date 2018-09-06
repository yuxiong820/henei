package com.henei.jobhunter;

/**
 * @Author: dogyu
 * @Date: 2018/8/29
 * @Description:
 */
public interface IJobhunterSevice {

    /**
     * 根据求职者id获取求职者信息
     * @param id
     */
    void getJobhunterById(String id);
}
