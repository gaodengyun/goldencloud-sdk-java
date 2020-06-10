package com.goldencloud.invoice.models;

import com.goldencloud.common.ApiField;

public class InvoiceBlueYunnan {
    private String useDate;
    private String ticketName;

    @ApiField(name="use_date")
    public String getUseDate() {
        return useDate;
    }

    public InvoiceBlueYunnan setUseDate(String useDate) {
        this.useDate = useDate;
        return this;
    }

    public String getTicketName() {
        return ticketName;
    }

    @ApiField(name="ticket_name")
    public InvoiceBlueYunnan setTicketName(String ticketName) {
        this.ticketName = ticketName;
        return this;
    }
}
