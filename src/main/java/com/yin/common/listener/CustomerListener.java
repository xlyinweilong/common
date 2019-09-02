package com.yin.common.listener;

import com.yin.common.entity.po.BaseDataPo;
import com.yin.common.entity.po.BaseLongPo;
import com.yin.common.entity.po.BaseTnPo;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class CustomerListener {

    @PreUpdate
    public void preUpdate(Object source) {
        this.setTnId(source);
    }


    @PreRemove
    public void preRemove(Object source) {
        this.setTnId(source);
    }

    @PrePersist
    public void prePersist(Object source) {
        this.setTnId(source);
    }

    private void setTnId(Object source){
        if(source instanceof BaseTnPo) {
            BaseTnPo baseTnPo = (BaseTnPo) source;
            baseTnPo.setTnId("11");
        }
    }

}
