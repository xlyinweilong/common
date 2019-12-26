package com.yin.common.entity.vo.in;

import com.yin.common.entity.vo.BaseVo;
import lombok.Data;

import java.util.List;

@Data
public class BaseIdsVo extends BaseVo {
    private List<String> ids;
}
