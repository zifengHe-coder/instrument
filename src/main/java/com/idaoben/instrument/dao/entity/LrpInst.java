package com.idaoben.instrument.dao.entity;

import com.idaoben.instrument.dao.utils.TrackableObjectSnowFlakeNew;
import com.idaoben.web.common.entity.Description;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author hezifeng
 * @create 2022/10/28 11:54
 */
@Entity
@Table(name = "lrp_inst")
@Description("仪器表")
@Data
public class LrpInst extends TrackableObjectSnowFlakeNew {
    /**
     * [机构编号] -- 机构编号。
     */
    @Description("[机构编号] -- 机构编号")
    @Column
    private String agentCode;

    /**
     * [id]
     */
    @Description("[原id] -- 数据源id")
    @Column(name = "id")
    private Long id;

    /**
     * [仪器名称] -- 仪器名称， 仪器中文名称。
     */
    @Description("[仪器名称] -- 仪器名称， 仪器中文名称。")
    @Column
    private String instName;

    /**
     * [仪器型号] -- 仪器厂家定的仪器型号.
     */
    @Description("[仪器型号] -- 仪器厂家定的仪器型号.")
    @Column
    private String model;

    /**
     * [仪器编码] -- 仪器编码，在整个lrp平台上的仪器编码都是唯一， 通过仪器编码与系统进行对接， 这个编码要有意义并且能通过肉眼能识别基本属性.
     */
    @Description("[仪器编码] -- 仪器编码，在整个lrp平台上的仪器编码都是唯一， 通过仪器编码与系统进行对接， 这个编码要有意义并且能通过肉眼能识别基本属性.")
    @Column
    private String instCode;

    /**
     * [固定资产编码] -- 固定资产编码， 企业的固定资产编码. 可以通过此编码找到仪器的更多信息.
     */
    @Description("[固定资产编码] -- 固定资产编码， 企业的固定资产编码. 可以通过此编码找到仪器的更多信息.")
    @Column
    private String assetsCode;

    /**
     * [供应商] -- 仪器从哪里采购， 仪器对接及问题跟进.
     */
    @Description("[供应商] -- 仪器从哪里采购， 仪器对接及问题跟进.")
    @Column
    private String vendor;

    /**
     * [设备制造商] -- 仪器是哪个厂家生产的.
     */
    @Description("[设备制造商] -- 仪器是哪个厂家生产的.")
    @Column
    private String manufacture;

    /**
     * [设备安装时间] -- 仪器安装时间， 也可以存仪器开始对接的时间.
     */
    @Description("[设备安装时间] -- 仪器安装时间， 也可以存仪器开始对接的时间.")
    @Column
    private String setupDate;

    /**
     * [设备联系人] -- 设备联系人，问题跟进用。
     */
    @Description("[设备联系人] -- 设备联系人，问题跟进用。")
    @Column
    private String contactMan;

    /**
     * [联系电话] -- 设备联系人的联系电话
     */
    @Description("[联系电话] -- 设备联系人的联系电话")
    @Column
    private String contactPhone;

    /**
     * [通讯方式]-- 通讯方式(socket、serialport、txt、excel、access)
     */
    @Description("[通讯方式]-- 通讯方式(socket、serialport、txt、excel、access)")
    @Column
    private String comMode;

    /**
     * [结果解释类名] -- 结果解释的类名， 用于反射自动加载解释类名， 新接仪器会不断扩解析类.
     */
    @Description("[结果解释类名] -- 结果解释的类名， 用于反射自动加载解释类名， 新接仪器会不断扩解析类.")
    @Column
    private String className;

    /**
     * [串口号] -- 仪器是通过串口通讯，需要配置串口号， 通过串口转发器转发也是配置串口号.端口号: 1— com1， 2—com2… 入此类摧总共有15个端口号。
     */
    @Description("[串口号] -- 仪器是通过串口通讯，需要配置串口号， 通过串口转发器转发也是配置串口号.端口号: 1— com1， 2—com2… 入此类摧总共有15个端口号。")
    @Column
    private String comPort;

    /**
     * [波特率] — 串口的波特率， 内容如下：1200，2400，4800，9600，1920，38400，115200 波特率(常用9600)
     */
    @Description("[波特率] — 串口的波特率， 内容如下：1200，2400，4800，9600，1920，38400，115200 波特率(常用9600)")
    @Column
    private Integer baudrate;

    /**
     * [数据位] — 串口的数据位 内容：1，2，3，4，5，6，7，8 数据位(默认8)
     */
    @Description("[数据位] — 串口的数据位 内容：1，2，3，4，5，6，7，8 数据位(默认8)")
    @Column
    private Integer dataBit;

    /**
     * [停止位] — 串口停止位，内容: 1，2，3 停止位(none = 0，one = 1，two = 2，onepointfive = 3)
     */
    @Description("[停止位] — 串口停止位，内容: 1，2，3 停止位(none = 0，one = 1，two = 2，onepointfive = 3)")
    @Column
    private Integer stopBit;

    /**
     * [奇偶校验位] — 串口的奇偶校验位，内容：0— 无校验， 1—奇校验， 2—偶校验。 奇偶校验位(none = 0， odd = 1， even = 2， mark = 3， space = 4)
     */
    @Description("[奇偶校验位] — 串口的奇偶校验位，内容：0— 无校验， 1—奇校验， 2—偶校验。 奇偶校验位(none = 0， odd = 1， even = 2， mark = 3， space = 4)")
    @Column
    private Integer parity;

    /**
     * [协议] — 串口通讯协议 ，1 — xonxof， 2 — rts or cts， 3 — asts 流控制(none = 0， xonxoff = 1， requesttosend = 2， requesttosendxonxoff = 3)
     */
    @Description("[协议] — 串口通讯协议 ，1 — xonxof， 2 — rts or cts， 3 — asts 流控制(none = 0， xonxoff = 1， requesttosend = 2， requesttosendxonxoff = 3)")
    @Column
    private Integer handshake;

    /**
     * [主机ip] — 主机ip或服务器地址 ip地址
     */
    @Description("[主机ip] — 主机ip或服务器地址 ip地址")
    @Column
    private String ipAddress;

    /**
     * [端口] — 服务器端口 端口号
     */
    @Description("[端口] — 服务器端口 端口号")
    @Column
    private String port;

    /**
     * [数据库读取参数] -- odbc， access ， sqlite 数据库读取方式的链接字符串.
     */
    @Description("[数据库读取参数] -- odbc， access ， sqlite 数据库读取方式的链接字符串.")
    @Column
    private String dataSource;

    /**
     * [文件路径] -- 仪器结果以文件形式存放， 此路径指向文件存放的目录， 包括smb网络路径.
     */
    @Description("[文件路径] -- 仪器结果以文件形式存放， 此路径指向文件存放的目录， 包括smb网络路径.")
    @Column
    private String filePath;

    /**
     * [回应码] — 回应码 响应符
     */
    @Description("[回应码] — 回应码 响应符")
    @Column
    private Integer responseCode;

    /**
     * [回应遇到码] — 遇到相关符号需要回发响应符
     */
    @Description("[回应遇到码] — 遇到相关符号需要回发响应符")
    @Column
    private String responseAt;

    /**
     * [响应开始符]
     */
    @Description("[响应开始符]")
    @Column
    private Integer startCode;

    /**
     * [结束码] — 响应结束符
     */
    @Description("")
    @Column
    private Integer endCode;

    /**
     * [发送开始符] -- 发送开始符
     */
    @Description("[发送开始符] -- 发送开始符")
    @Column
    private Integer requestStart;

    /**
     * [发送结束符] -- 发送结束符
     */
    @Description("[发送结束符] -- 发送结束符")
    @Column
    private Integer requestEnd;

    /**
     * [字符集] -- 字符集(ascii、utf-8、gb2312)
     */
    @Description("[字符集] -- 字符集(ascii、utf-8、gb2312)")
    @Column
    private String characterset;

    /**
     * [是否再用] -- 关键性标志， 是否可用:0 -- 不可用， 1 -- 可用， 可用的仪器在控制台启动的时候读取并启动仪器联机.
     */
    @Description("[是否再用] -- 关键性标志， 是否可用:0 -- 不可用， 1 -- 可用， 可用的仪器在控制台启动的时候读取并启动仪器联机.")
    @Column
    private Integer isUse;

    /**
     * [解析间隔时间] — 仪器解析间隔时间 任务执行间隔
     */
    @Description("[解析间隔时间] — 仪器解析间隔时间 任务执行间隔")
    @Column
    private Integer parseTime;

    /**
     * [通信模式] — 通讯模式标志位： 0— 无通信， 1— 单向，2— 双向（无校验位），3— 双向（带校验位）， 4—其它，默认值为无通信。
     */
    @Description("[通信模式] — 通讯模式标志位： 0— 无通信， 1— 单向，2— 双向（无校验位），3— 双向（带校验位）， 4—其它，默认值为无通信。")
    @Column
    private Integer transferMode;

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
     * [以条码为业务主键] -- 标志位， 1 -- 以条码为业务主键， 0 or null 以流水号为业务主键
     */
    @Description("[以条码为业务主键] -- 标志位， 1 -- 以条码为业务主键， 0 or null 以流水号为业务主键")
    @Column
    private Integer isUsedBarcode;
}
