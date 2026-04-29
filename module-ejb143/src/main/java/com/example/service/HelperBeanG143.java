package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG143 {

    @EJB
    private HelperBeanF143 helperBeanF143;

    public String identify() {
        return "HelperBeanG143";
    }
}
