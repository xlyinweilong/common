package com.yin.common.entity.vo.out;

import lombok.Data;

import java.util.List;

/**
 * 返回的分页VO
 *
 * @author yin.weilong
 * @date 2018.11.11
 */
@Data
public class BackPageVo<T> {

    private List<T> content;
    private Long totalElements;
}
