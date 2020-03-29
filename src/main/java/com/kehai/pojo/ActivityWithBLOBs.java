package com.kehai.pojo;

import java.io.Serializable;

/**
 * activity
 * @author 
 */
public class ActivityWithBLOBs extends Activity implements Serializable {
    private String description;

    private String seoDescription;

    private static final long serialVersionUID = 1L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }
}