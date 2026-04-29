package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI16 {

    @EJB
    private HelperBeanH16 helperBeanH16;

    public String identify() {
        return "HelperBeanI16";
    }
}
