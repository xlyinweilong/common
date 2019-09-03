package com.yin.common.entity.vo.in;

import lombok.Data;

import java.io.Serializable;

@Data
public class BasePageVo implements Serializable {

    private Integer pageIndex;

    private Integer pageSize;
}
