package com.yin.common.entity.po;

import com.yin.common.listener.CustomerListener;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author yin.weilong
 * @date 2019.08.31
 */
@MappedSuperclass
@Data
@EntityListeners({CustomerListener.class})
public abstract class BaseTnPo implements Serializable {

    @Column(name = "tn_id", length = 20)
    private String tnId;
}
