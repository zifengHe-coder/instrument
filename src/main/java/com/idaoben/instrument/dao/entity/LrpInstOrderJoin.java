package com.idaoben.instrument.dao.entity;

import com.idaoben.web.common.entity.Description;
import com.idaoben.web.common.entity.TrackableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author hezifeng
 * @create 2022/10/31 10:50
 */
@Entity
@Table(name = "lrp_inst_order_join")
@Description("结果对应上机单关联表")
public class LrpInstOrderJoin extends TrackableObject {

    /**
     * [机构编号] -- 机构编号。
     */
    @Description("[机构编号] -- 机构编号")
    @Column
    private String agentCode;

    /**
     * [仪器id] -- 仪器表的主键id
     */
    @Description("[仪器id] -- 仪器表的主键id")
    @Column
    private Long instId;

    /**
     * [仪器上机单id] -- 仪器上机单的主键id， 如果单向仪器回传的结果则写结果单的id.
     */
    @Description("[仪器上机单id] -- 仪器上机单的主键id， 如果单向仪器回传的结果则写结果单的id.")
    @Column
    private Long instOrderId;

    /**
     * [结果单id] -- 结果单的主键id.
     */
    @Description("[结果单id] -- 结果单的主键id.")
    @Column
    private Long instResultId;

    /**
     * [是否已同步] -- 标志位， 是否同步: 0--待同步， 1 -- 已同步.
     */
    @Description("[是否已同步] -- 标志位， 是否同步: 0--待同步， 1 -- 已同步.")
    @Column
    private Integer isSync;

    /**
     * [创建时间] -- 记录的创建时间，每条记录只会记录一次，此时间无任何业务意义，记录服务器的时间。
     */
    @Description("[创建时间] -- 记录的创建时间，每条记录只会记录一次，此时间无任何业务意义，记录服务器的时间。")
    @Column
    private String createAt;

    /**
     * [修改时间] -- 记录最后修改时间， 此记录其他字段值被修改，必须写此字段内容，此时间无任何业务意义， 记录服务器的时间。
     */
    @Description("[修改时间] -- 记录最后修改时间， 此记录其他字段值被修改，必须写此字段内容，此时间无任何业务意义， 记录服务器的时间。")
    @Column
    private String updateAt;

    /**
     * [是否处理] -- 标志位， 是否处理: 0--待处理， 1 -- 已处理.
     */
    @Description("[是否处理] -- 标志位， 是否处理: 0--待处理， 1 -- 已处理.")
    @Column(name="status",columnDefinition="int default 0")
    private Integer status;

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public Long getInstId() {
        return instId;
    }

    public void setInstId(Long instId) {
        this.instId = instId;
    }

    public Long getInstOrderId() {
        return instOrderId;
    }

    public void setInstOrderId(Long instOrderId) {
        this.instOrderId = instOrderId;
    }

    public Long getInstResultId() {
        return instResultId;
    }

    public void setInstResultId(Long instResultId) {
        this.instResultId = instResultId;
    }

    public Integer getIsSync() {
        return isSync;
    }

    public void setIsSync(Integer isSync) {
        this.isSync = isSync;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}

