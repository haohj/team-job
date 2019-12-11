package com.hao.teamjob.domian;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author haohj
 * @date 2019-12-11 10:26
 */
@Data
public class LoginRecord implements Serializable {
    private int id;
    private String username;
    private String ipAddress;
    private String browserType;
    private String address;
    private Date loginTime;
    private Date logoutTime;
    private String group;
}
