package com.li.taxieducation.base.bean;

import com.li.taxieducation.base.bean.vo.CityListVO;

/**
 * Created by liu on 2017/6/14.
 */

public class CityResult extends BaseResult{

    private CityListVO data;

    public CityListVO getData() {
        return data;
    }

    public void setData(CityListVO data) {
        this.data = data;
    }
}
