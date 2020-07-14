package com.lambdashane.javaorders.models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;

    private String type;

    public Payment(String type)
    {
        this.type = type;
    }

    public Payment()
    {
    }

    public long getPaymentid()
    {
        return paymentid;
    }

    public void setPaymentid(long paymentid)
    {
        this.paymentid = paymentid;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
