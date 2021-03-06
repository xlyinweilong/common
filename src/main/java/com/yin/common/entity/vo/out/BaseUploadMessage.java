package com.yin.common.entity.vo.out;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除消息
 *
 * @author yin.weilong
 * @date 2018.12.19
 */
@Data
public class BaseUploadMessage implements Serializable {

    /**
     * 处理一共多少数据
     */
    private Integer totalRowCount = 0;

    /**
     * 当前处理进度
     */
    private Integer nowRowCount = -1;

    /**
     * 错误文件路径
     */
    private String errorUrl;

    /**
     * 消耗时间
     */
    private String useTime;

    /**
     * 0正在处理进度，1处理完成，-1处理失败，2没有任务开始
     */
    private Integer status = 0;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 回传数据
     */
    private Object data;

    public BaseUploadMessage() {
    }

    public BaseUploadMessage(int status) {
        this.status = status;
    }

    public BaseUploadMessage(int status, String useTime) {
        this.status = status;
        this.useTime = useTime;
    }

    public BaseUploadMessage(int status, String useTime, String message) {
        this.status = status;
        this.useTime = useTime;
        this.message = message;
    }

    public BaseUploadMessage(String errorUrl, int status, String useTime) {
        this.errorUrl = errorUrl;
        this.status = status;
        this.useTime = useTime;
    }

    public BaseUploadMessage(int totalRowCount, int nowRowCount) {
        this.totalRowCount = totalRowCount;
        this.nowRowCount = nowRowCount;
    }

    public BaseUploadMessage(int status, String useTime, Object data) {
        this.status = status;
        this.useTime = useTime;
        this.data = data;
    }
}
