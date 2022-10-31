package com.idaoben.instrument.dao.entity;

import com.idaoben.instrument.dao.utils.TrackableObjectSnowFlakeNew;
import com.idaoben.web.common.entity.Description;
import com.idaoben.web.common.entity.TrackableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.ZonedDateTime;

/**
 * @author hezifeng
 * @create 2022/10/31 10:47
 */
@Entity
@Table(name = "lrp_inst_item_result")
@Description("项目结果表")
public class LrpInstItemResult extends TrackableObject {
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

    @Description("[结果单ID] -- 仪器结果单主键ID")
    @Column(name = "inst_result_id")
    private Long instResultId;

    @Description("[项目通道号] -- 项目通道号")
    @Column(name = "channel_code",length = 30)
    private String channelCode;

    @Description("[结果值] -- 经解释后的项目结果值")
    @Column(name = "result_value",length = 170)
    private String resultValue;

    @Description("[OD值] -- 免疫结果的od值")
    @Column(name = "od_value",length = 10)
    private String odValue;

    @Description("[项目建议与解释] -- 仪器回传的项目建议解释，唐筛仪器地贫有建议解释")
    @Column(name = "result_comment",length = 1000)
    private String resultComment;

    @Description("[条码号] -- 条码/流水号")
    @Column(name = "barcode",length = 19)
    private String barcode;

    @Description("[流水号] -- 单项仪器回传的流水号")
    @Column(name = "seq_no")
    private String seqNo;

    @Description("[检测时间] -- 检测时间")
    @Column(name = "test_time")
    private ZonedDateTime testTime;

    @Description("[批次号] -- 结果批次号")
    @Column(name = "batch_no",length = 20)
    private String batchNo;

    @Description("[是否质控] -- 是否质控结果， 0 -- 非质控结果，1 -- 质控结果")
    @Column(name = "is_qc")
    private Long isQc;

    @Description("[临界值] -- 仪器结果临界值")
    @Column(name = "cutoff_value",length = 20,nullable = false)
    private String cutoffValue;

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

    public Long getInstResultId() {
        return instResultId;
    }

    public void setInstResultId(Long instResultId) {
        this.instResultId = instResultId;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getResultValue() {
        return resultValue;
    }

    public void setResultValue(String resultValue) {
        this.resultValue = resultValue;
    }

    public String getOdValue() {
        return odValue;
    }

    public void setOdValue(String odValue) {
        this.odValue = odValue;
    }

    public String getResultComment() {
        return resultComment;
    }

    public void setResultComment(String resultComment) {
        this.resultComment = resultComment;
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

    public ZonedDateTime getTestTime() {
        return testTime;
    }

    public void setTestTime(ZonedDateTime testTime) {
        this.testTime = testTime;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Long getIsQc() {
        return isQc;
    }

    public void setIsQc(Long isQc) {
        this.isQc = isQc;
    }

    public String getCutoffValue() {
        return cutoffValue;
    }

    public void setCutoffValue(String cutoffValue) {
        this.cutoffValue = cutoffValue;
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


}
