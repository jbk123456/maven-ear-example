package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI119 {

    @EJB
    private HelperBeanH119 helperBeanH119;

    public String identify() {
        return "HelperBeanI119";
    }
}
