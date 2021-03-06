package com.xuqian.gs.mq.producer;

import com.xuqian.gs.mq.core.HookMessageEvent;

public class ProducerHookMessageEvent extends HookMessageEvent<String> {

    private boolean brokerConnect = false;
    private boolean running = false;

    public ProducerHookMessageEvent() {
        super();
    }

    public void disconnect(String addr) {
        synchronized (this) {
            if (isRunning()) {
                setBrokerConnect(false);
            }
        }
    }

    public boolean isBrokerConnect() {
        return brokerConnect;
    }

    public void setBrokerConnect(boolean brokerConnect) {
        this.brokerConnect = brokerConnect;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
