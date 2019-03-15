package com.yin.common.entity.vo.in;

import com.yin.common.entity.vo.BaseVo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BaseDeleteVo extends BaseVo {
    private List<String> ids;
}
