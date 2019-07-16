package com.hao.teamjob.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("loginRecordService")
public class LoginRecordServiceImpl implements LoginRecordService {
    @Override
    public void addRecord(String userName, String ipAddress, String browserType) {

    }

    @Override
    public void updateRecord(Date logoutTime, int id) {

    }
}
