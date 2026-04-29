package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL47 {

    @EJB
    private HelperBeanK47 helperBeanK47;

    public String identify() {
        return "HelperBeanL47";
    }
}
