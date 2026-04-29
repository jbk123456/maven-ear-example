package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH119 {

    @EJB
    private HelperBeanG119 helperBeanG119;

    public String identify() {
        return "HelperBeanH119";
    }
}
