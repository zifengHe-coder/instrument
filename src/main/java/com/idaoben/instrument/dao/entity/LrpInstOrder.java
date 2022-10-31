package com.idaoben.instrument.dao.entity;

import com.idaoben.instrument.common.GenderType;
import com.idaoben.instrument.dao.utils.TrackableObjectSnowFlakeNew;
import com.idaoben.web.common.entity.Description;
import com.idaoben.web.common.entity.TrackableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.ZonedDateTime;

/**
 * @author hezifeng
 * @create 2022/10/31 10:45
 */
@Entity
@Table(name = "lrp_inst_order")
@Description("上机单")
public class LrpInstOrder extends TrackableObject {
    @Description("仪器ID")
    @Column(name = "inst_id",length = 20)
    private Long instrumentId;

    @Description("条码号")
    @Column(name = "barcode",length = 19)
    private String barcode;

    @Description("样本接收时间")
    @Column(name = "take_at")
    private ZonedDateTime takeAt;

    @Description("病人名称")
    @Column(name = "subject_name",length = 30)
    private String subjectName;

    @Description("[性别] 0-未知 1-男 2-女")
    @Column(name = "sex_id")
    private GenderType sexId;

    @Description("计算年龄")
    @Column(name = "caculated_age",length = 11)
    private Integer caculatedAge;

    @Description("[是否复查条码] 0-非复查条码 1-复查条码")
    @Column(name = "is_recheck")
    private boolean recheck=false;

    @Description("[是否qc条码] -- 标志位，是否qc条码,0--非qc条码,1--qc条码")
    @Column(name = "is_qc")
    private boolean qc=false;

    @Description("[lis系统ID数字类型] -- 上机单是由lis发起，需要记录下lis系统的ID，用于溯源，大部分系统的ID要不是数字要不是字符串，如果是数字用此字段记录，并且lis_str_id也记录相同ID")
    @Column(name = "lis_str_id",length = 20)
    private Long lisStrId;

    @Description("[lis系统ID字符串类型] -- lis系统如果使用guid作为主键则需记录此字段，并且lis_int_id填0")
    @Column(name = "lrp_str_id",length = 36)
    private String lrpStrId;

    public Long getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(Long instrumentId) {
        this.instrumentId = instrumentId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public ZonedDateTime getTakeAt() {
        return takeAt;
    }

    public void setTakeAt(ZonedDateTime takeAt) {
        this.takeAt = takeAt;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public GenderType getSexId() {
        return sexId;
    }

    public void setSexId(GenderType sexId) {
        this.sexId = sexId;
    }

    public Integer getCaculatedAge() {
        return caculatedAge;
    }

    public void setCaculatedAge(Integer caculatedAge) {
        this.caculatedAge = caculatedAge;
    }

    public boolean isRecheck() {
        return recheck;
    }

    public void setRecheck(boolean recheck) {
        this.recheck = recheck;
    }

    public boolean isQc() {
        return qc;
    }

    public void setQc(boolean qc) {
        this.qc = qc;
    }

    public Long getLisStrId() {
        return lisStrId;
    }

    public void setLisStrId(Long lisStrId) {
        this.lisStrId = lisStrId;
    }

    public String getLrpStrId() {
        return lrpStrId;
    }

    public void setLrpStrId(String lrpStrId) {
        this.lrpStrId = lrpStrId;
    }
}
