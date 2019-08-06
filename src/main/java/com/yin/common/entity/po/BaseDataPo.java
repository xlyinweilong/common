package com.yin.common.entity.po;


import com.yin.common.utils.GenerateUtil;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseDataPo implements Serializable {

    @Id
    @Column(name = "id", length = 32)
    private String id = GenerateUtil.createUUID();

    @Column(name = "tn_id", length = 20)
    private String tnId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDataPo that = (BaseDataPo) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
