package com.hao.teamjob.service;

import org.springframework.stereotype.Component;

import java.util.Date;

public interface LoginRecordService {
    void addRecord(String userName,String ipAddress,String browserType);
    void updateRecord(Date logoutTime, int id);
}
