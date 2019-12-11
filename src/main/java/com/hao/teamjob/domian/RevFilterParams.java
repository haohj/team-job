package com.hao.teamjob.domian;

import lombok.Data;

/**
 * @author haohj
 * @date 2019-12-11 10:27
 */
@Data
public class RevFilterParams extends TimeFilterParams {
    private String author;
    private String emailAddress;
    private String[] nickNames;
    private String[] commonEmails;
}
