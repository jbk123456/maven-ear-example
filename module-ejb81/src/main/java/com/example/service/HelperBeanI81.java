package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI81 {

    @EJB
    private HelperBeanH81 helperBeanH81;

    public String identify() {
        return "HelperBeanI81";
    }
}
