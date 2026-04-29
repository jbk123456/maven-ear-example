package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI13 {

    @EJB
    private HelperBeanH13 helperBeanH13;

    public String identify() {
        return "HelperBeanI13";
    }
}
