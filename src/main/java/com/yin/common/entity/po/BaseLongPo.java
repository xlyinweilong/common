package com.yin.common.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yin.common.listener.CustomerListener;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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
