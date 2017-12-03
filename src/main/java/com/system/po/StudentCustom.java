package com.system.po;

import java.util.List;

/**
 * Student的扩展类
 */
public class StudentCustom extends Student {
    //所属院系名
    private String collegeName;



    public void setcollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getcollegeName() {
        return collegeName;
    }

}
