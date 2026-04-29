package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH33 {

    @EJB
    private HelperBeanG33 helperBeanG33;

    public String identify() {
        return "HelperBeanH33";
    }
}
