package com.xuqian.gs.mq.model;

import com.xuqian.gs.mq.msg.BaseMessage;

import java.io.Serializable;

public abstract class BusinessMessage implements Serializable {

    public final static int SUCCESS = 0;
    public final static int FAIL = 1;
    protected String msgId;
    protected BaseMessage msgParams;
    protected MessageSource msgSource;
    protected MessageType msgType;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public BaseMessage getMsgParams() {
        return msgParams;
    }

    public void setMsgParams(BaseMessage msgParams) {
        this.msgParams = msgParams;
    }

    public MessageSource getMsgSource() {
        return msgSource;
    }

    public void setMsgSource(MessageSource msgSource) {
        this.msgSource = msgSource;
    }

    public MessageType getMsgType() {
        return msgType;
    }

    public void setMsgType(MessageType msgType) {
        this.msgType = msgType;
    }
}
