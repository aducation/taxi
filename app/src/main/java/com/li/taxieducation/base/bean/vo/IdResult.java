package com.li.taxieducation.base.bean.vo;

import com.li.taxieducation.base.bean.BaseResult;

/**
 * Created by liu on 2017/6/13.
 */

public class IdResult extends BaseResult{
    private IdDataVO data;

    public IdDataVO getData() {
        return data;
    }

    public void setData(IdDataVO data) {
        this.data = data;
    }
}
