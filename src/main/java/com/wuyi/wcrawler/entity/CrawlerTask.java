package com.wuyi.wcrawler.entity;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author wuyi5
 * @date 2017/8/29
 */
public class CrawlerTask {

    public static final int CREATED = 0;
    public static final int CRAWLING = 1;
    public static final int NORMALEND = 2;
    public static final int ABNORMALEND = 3;
    private int id;

    /**
     * 0: 初始状态
     * 1: 正在爬取
     * 2: 正常结束
     * 3: 异常终止
     * */
    private int status;
    /**
     * 当前爬取总数
     * */
    private AtomicInteger curAmount = new AtomicInteger(0);
    /**
     * 目标爬取总数
     * */
    private int tarAmount;
    private long startTime;
    private long endedTime;
    private long spendTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public AtomicInteger getCurAmount() {
        return curAmount;
    }

    public void setCurAmount(AtomicInteger curAmount) {
        this.curAmount = curAmount;
    }

    public int getTarAmount() {
        return tarAmount;
    }

    public void setTarAmount(int tarAmount) {
        this.tarAmount = tarAmount;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndedTime() {
        return endedTime;
    }

    public void setEndedTime(long endedTime) {
        this.endedTime = endedTime;
    }

    public long getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(long spendTime) {
        this.spendTime = spendTime;
    }

    @Override
    public String toString() {
        return "CrawlerTask{" +
                "id=" + id +
                ", status=" + status +
                ", curAmount=" + curAmount +
                ", tarAmount=" + tarAmount +
                ", startTime=" + startTime +
                ", endedTime=" + endedTime +
                ", spendTime=" + spendTime +
                '}';
    }
}
