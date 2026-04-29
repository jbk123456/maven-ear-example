package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI130 {

    @EJB
    private HelperBeanH130 helperBeanH130;

    public String identify() {
        return "HelperBeanI130";
    }
}
