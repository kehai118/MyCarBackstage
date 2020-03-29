package com.kehai.service;

import com.kehai.mapper.TopDao;
import com.kehai.util.R;


import java.util.List;

public interface TopService<T,V> {
    TopDao getDao();
    default List<T> findAll() {
        return getDao().selectByExample(null);
    }
    default long countByExample(V example) {
        return getDao().countByExample(example);
    }

    
    default int deleteByExample(V example) {
        return getDao().deleteByExample(example);
    }

    
    default int deleteByPrimaryKey(Long id) {
        return getDao().deleteByExample(id);
    }

    
    default int insert(T record) {
        return getDao().insert(record);
    }
    default int insertSelective(T record) {
        return getDao().insertSelective(record);
    }
    
    default List<T> selectByExample(V example) {
        return getDao().selectByExample(example);
    }

    
    default T selectByPrimaryKey(Long id) {
        return (T)getDao().selectByPrimaryKey(id);
    }
    
    default int updateByExampleSelective(T record, V example) {
        return getDao().updateByExampleSelective(record,example);
    }
    
    default int updateByExample(T record, V example) {
        return getDao().updateByExampleSelective(record,example);
    }

    
    default int updateByPrimaryKeySelective(T record) {
        return getDao().updateByPrimaryKeySelective(record);
    }

    
    default int updateByPrimaryKey(T record) {
        return getDao().updateByPrimaryKey(record);
    }

}
