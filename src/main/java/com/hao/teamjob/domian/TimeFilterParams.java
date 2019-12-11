package com.hao.teamjob.domian;

import lombok.Data;

/**
 * @author haohj
 * @date 2019-12-11 10:28
 */
@Data
public class TimeFilterParams {
    /**
     * 提交日期开始 单位秒
     */
    protected int submitDateFrom;
    /**
     * 提交日期结束 单位秒
     */
    protected int submitDateTo;

    public TimeFilterParams() {
    }

    public TimeFilterParams(int submitDateFrom, int submitDateTo) {
        this.submitDateFrom = submitDateFrom;
        this.submitDateTo = submitDateTo;
    }
}
