package com.yin.common.entity.vo.in;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BasePageVo implements Serializable {

    private Integer pageIndex;

    private Integer pageSize;
}
