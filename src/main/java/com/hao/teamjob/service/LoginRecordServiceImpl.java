package com.hao.teamjob.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author haohj
 * @date 2019-12-11 14:50
 */
@Service("loginRecordService")
public class LoginRecordServiceImpl implements LoginRecordService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginRecordServiceImpl.class);
    @Override
    public void addRecord(String userName, String ipAddress, String browserType) {

    }

    @Override
    public void updateRecord(Date logoutTime, int id) {

    }
}
