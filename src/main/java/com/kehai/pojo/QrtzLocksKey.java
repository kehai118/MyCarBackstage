package com.kehai.pojo;

import java.io.Serializable;

/**
 * qrtz_locks
 * @author 
 */
public class QrtzLocksKey implements Serializable {
    private String schedName;

    private String lockName;

    private static final long serialVersionUID = 1L;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }
}