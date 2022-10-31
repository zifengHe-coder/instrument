package com.idaoben.instrument.dao.entity;

import com.idaoben.instrument.dao.utils.TrackableObjectSnowFlakeNew;
import com.idaoben.web.common.entity.Description;
import com.idaoben.web.common.entity.TrackableObject;

import javax.persistence.*;
import java.time.ZonedDateTime;

/**
 * @author hezifeng
 * @create 2022/10/31 10:48
 */
@Entity
@Table(name = "lrp_inst_result")
@Description("仪器结果单")
public class LrpInstResult extends TrackableObject {
    /**
     * [机构编号] -- 机构编号。
     */
    @Description("[机构编号] -- 机构编号")
    @Column
    private String agentCode;

    /**
     * [id]
     */
    @Column(name = "id")
    private Long id;

    @Description("仪器ID")
    @Column(name = "inst_id",length = 20)
    private Long instId;

    @Description("仪器编码")
    @Column(name = "inst_code")
    private String instCode;

    @Description("[原始结果] -- 原始结果，仪器在解释中的中间结果，用于校对突发性解释错误，当结果解释存在异常可通过此字段内容溯源")
    @Column(name = "raw_data",columnDefinition = "TEXT")
    private String rawData;

    @Description("[传输时间] -- 接受结果的时间")
    @Column(name = "receive_time")
    private ZonedDateTime receiveTime;

    @Description("[是否质控] -- 结果是否是质控结果，0 -- 非质控结果，1 -- 质控结果")
    @Column(name = "is_qc",nullable = false)
    private Long isQc;

    @Description("[条码号] -- 仪器检测回传的结果解释出来的条码号")
    @Column(name = "barcode",length = 19)
    private String barcode;

    @Description("[流水号] -- 对应样本号")
    @Column(name = "seq_no",length = 50)
    private String seqNo;

    @Description("[批次号] -- 结果的批次号")
    @Column(name = "batch_no",length = 20)
    private String batchNo;

    @Lob
    @Basic(fetch= FetchType.LAZY)
    @Description("[其他结果] -- 仪器其他结果内容，其他结果内容，这些结果内容关联到样本号。微生物仪器有TAT时间的传回来，用此字段装载")
    @Column(name = "other_content")
    private String otherContent;

    @Description("[其他结果内容类型] -- 此类型字段用于描述什么方式来解释其他结果内容。以方便称项在处理其他结果走不同逻辑")
    @Column(name = "other_content_type",length = 64)
    private String otherContentType;

    @Description("[建议解释] -- 标本的建议解释描述")
    @Column(name = "report_remark",length = 1500)
    private String reportRemark;

    @Description("同步过来华胜系统保存的时间")
    @Column
    private String createAt;

    @Column(name = "creation_time")
    @Description("仪器表数据创建时间")
    private String creationTime;


    /**
     * [修改时间] -- 记录最后修改时间， 此记录其他字段值被修改，必须写此字段内容，此时间无任何业务意义， 记录服务器的时间。
     */
    @Description("[修改时间] -- 记录最后修改时间， 此记录其他字段值被修改，必须写此字段内容，此时间无任何业务意义， 记录服务器的时间。")
    @Column
    private String updateAt;

    @Description("同步表ID")
    @Column
    private Long relatedId;

    public Long getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(Long relatedId) {
        this.relatedId = relatedId;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public Long getInstId() {
        return instId;
    }

    public void setInstId(Long instId) {
        this.instId = instId;
    }

    public String getRawData() {
        return rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    public ZonedDateTime getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(ZonedDateTime receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Long getIsQc() {
        return isQc;
    }

    public void setIsQc(Long isQc) {
        this.isQc = isQc;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getOtherContent() {
        return otherContent;
    }

    public void setOtherContent(String otherContent) {
        this.otherContent = otherContent;
    }

    public String getOtherContentType() {
        return otherContentType;
    }

    public void setOtherContentType(String otherContentType) {
        this.otherContentType = otherContentType;
    }

    public String getReportRemark() {
        return reportRemark;
    }

    public void setReportRemark(String reportRemark) {
        this.reportRemark = reportRemark;
    }

    public String getInstCode() {
        return instCode;
    }

    public void setInstCode(String instCode) {
        this.instCode = instCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

}

