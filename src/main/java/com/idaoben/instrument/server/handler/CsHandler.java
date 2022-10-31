package com.idaoben.instrument.server.handler;

import com.idaoben.instrument.vo.CsMsgVo;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.tomcat.util.buf.HexUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 威士达处理器
 * @author hezifeng
 * @create 2022/10/31 15:50
 */
@Component
@ConditionalOnProperty(
        name = "inst.cs5100",
        havingValue = "enable"
)
public class CsHandler extends IoHandlerAdapter {
    private final static Logger log = LoggerFactory.getLogger(CsHandler.class);
    @Resource
    private ThreadPoolTaskExecutor asyncTaskExecutor;

    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
        log.error(cause.getMessage());
        session.close(true);
    }

    @Override
    public void sessionCreated(IoSession session) throws Exception {
        log.info("sessionId: " + session.getId() + "创建连接");
    }

    @Override
    public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
        session.close(true);
    }

    @Override
    public void sessionOpened(IoSession session) throws Exception {
        log.info("sessionId：" + session.getId() + "打开连接");
    }

    @Override
    public void sessionClosed(IoSession session) throws Exception {
        log.info("sessionId：" + session.getId() + "关闭连接");
    }

    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        log.info("sessionId:" + session.getId());
        //  log.info("当前处理线程" + Thread.currentThread().getName());
        IoBuffer msg = (IoBuffer) message;
        String hexString = HexUtils.toHexString(msg.array());
        log.info("收到的消息:" + hexString);
        //todo 接收参数并解析成对应json
//        Map<String, String> map = AnalysisHexUtils.analysisHex(hexString);
//        if (null != map) {
//            for (Map.Entry<String, String> entry : map.entrySet()) {
//                log.info(String.format("%s : %s", entry.getKey(), entry.getValue()));
//            }
//            String sensorCode = map.get(AnalysisHexUtils.EQUIPMENT_SERIAL_NUMBER);
//            Sensor sensor = sensorService.findOne(Sort.unsorted(), Filter.eq("code", sensorCode));
//            log.info("能否下发参数" + (sensor != null && map.containsKey(AnalysisHexUtils.EQUIPMENT_PARAMETER)));
//            if (sensor != null && map.containsKey(AnalysisHexUtils.EQUIPMENT_PARAMETER)) {
//                log.info("下发参数成功");
//                //如果是回复参数
//                sensor.setStatus(IssueStatusEnum.ISSUE_SUCCESS);
//                sensorService.saveAndFlush(sensor);
//                return;
//            }
//            String serverResponse = SensorDataAnalysis.calculateResponse(map.get("currentFrameFlow"), SensorDataAnalysis.ResponseDataEnum.RESPONSE_EQUIPMENT);
//            if (sensor != null && IssueStatusEnum.ISSUING.equals(sensor.getStatus())) {
//                //如果需要下发参数
//                log.info("正在下发参数");
//                serverResponse = SensorDataAnalysis.calculateIssueParameterResponse(map.get("currentFrameFlow"), sensor);
//                sensor.setStatus(IssueStatusEnum.ISSUE_FAIL);
//                sensorService.saveAndFlush(sensor);
//            }
//            responseSensor(serverResponse, session);
//            asyncTaskExecutor.execute(new handleDataThread(map, saveSensorData));
//        }
    }


    //回复设备消息
    public void responseSensor(String serverResponse, IoSession session) {
        byte[] bytes = HexUtils.fromHexString(serverResponse);
        IoBuffer ioBuffer = IoBuffer.allocate(bytes.length);
        ioBuffer.put(bytes);
        log.info("content:" + HexUtils.toHexString(ioBuffer.array()));
        ioBuffer.flip();
        session.write(ioBuffer);
    }




    static class handleDataThread implements Runnable {
        public handleDataThread() {
        }

        public handleDataThread(Map<String, String> map,CsMsgVo msg) {
            this.map = map;
            this.msg=msg;
        }

        private CsMsgVo msg;
        private Map<String, String> map;

        public Map<String, String> getMap() {
            return map;
        }

        public void setMap(Map<String, String> map) {
            this.map = map;
        }

        public CsMsgVo getMsg() {
            return msg;
        }

        public void setMsg(CsMsgVo msg) {
            this.msg = msg;
        }

        @Override
        public void run() {
            //todo 数据入库
//            saveSensorData.saveSensorData(map);
        }
    }
}
