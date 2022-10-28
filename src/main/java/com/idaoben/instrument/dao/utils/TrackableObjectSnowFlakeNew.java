package com.idaoben.instrument.dao.utils;


import com.idaoben.web.common.entity.Description;
import com.idaoben.web.common.validation.CommonValidationGroup;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author hezifeng
 * @create 2022/10/28 11:48
 */
@MappedSuperclass
public abstract class TrackableObjectSnowFlakeNew {
    @Id
    @Column(name="new_id", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(groups = CommonValidationGroup.Edit.class, message = "ID不能为空")
    @Description("ID")
    private Long newId;

    public Long getNewId() {
        return newId;
    }

    public void setNewId(Long newId) {
        this.newId = newId;
    }
}
