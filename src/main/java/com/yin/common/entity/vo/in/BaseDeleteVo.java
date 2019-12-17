package com.yin.common.entity.vo.in;

import com.yin.common.entity.vo.BaseVo;
import lombok.Data;

import java.util.List;

@Data
public class BaseDeleteVo extends BaseVo {
    private List<String> ids;
    private String id;
}
