package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI40 {

    @EJB
    private HelperBeanH40 helperBeanH40;

    public String identify() {
        return "HelperBeanI40";
    }
}
