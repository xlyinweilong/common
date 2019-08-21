package com.yin.common.listener;

import com.yin.common.entity.po.BaseDataPo;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class CustomerListener {

    @PreUpdate
    public void preUpdate(Object source) {
        BaseDataPo baseDataPo = (BaseDataPo) source;
        baseDataPo.setTnId("11");
        System.out.println("@PrePersist：" + source);
    }


    @PreRemove
    public void preRemove(Object source) {
        BaseDataPo baseDataPo = (BaseDataPo) source;
        baseDataPo.setTnId("11");
        System.out.println("@PrePersist：" + source);
    }

    @PrePersist
    public void prePersist(Object source) {
        BaseDataPo baseDataPo = (BaseDataPo) source;
        baseDataPo.setTnId("11");
        System.out.println("@PrePersist：" + source);
    }

}
