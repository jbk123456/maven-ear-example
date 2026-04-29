package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH143 {

    @EJB
    private HelperBeanG143 helperBeanG143;

    public String identify() {
        return "HelperBeanH143";
    }
}
