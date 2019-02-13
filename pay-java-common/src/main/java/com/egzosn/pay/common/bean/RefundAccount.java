package com.egzosn.pay.common.bean;

public enum RefundAccount {

    UNSETTLED_FUNDS("未结算资金退款", "REFUND_SOURCE_UNSETTLED_FUNDS"),
    RECHARGE_FUNDS("可用余额退款", "REFUND_SOURCE_RECHARGE_FUNDS");

    private String name;
    private String source;

    RefundAccount(String name, String source) {
        this.name = name;
        this.source = source;
    }

    public String getName(){
        return name;
    }

    public String getSource() {
        return source;
    }
}
