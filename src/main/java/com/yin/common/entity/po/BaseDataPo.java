package com.yin.common.entity.po;


import com.yin.common.utils.GenerateUtil;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@Data
@MappedSuperclass
public abstract class BaseDataPo extends BaseTnPo {

    @Id
    @Column(name = "id", length = 32)
    private String id = GenerateUtil.createUUID();

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
