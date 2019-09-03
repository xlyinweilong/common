package com.yin.common.entity.po;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author yin.weilong
 * @date 2019.08.31
 */
@MappedSuperclass
@Data
public abstract class BaseLongPo extends BaseTnPo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

}
