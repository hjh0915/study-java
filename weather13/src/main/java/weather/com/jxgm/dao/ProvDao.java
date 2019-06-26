package com.jxgm.dao;

import com.jxgm.entities.Province;

public interface ProvDao {
    Province findById(String id);   //通过id找到province

}