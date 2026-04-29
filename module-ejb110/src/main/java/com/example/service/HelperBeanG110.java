package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG110 {

    @EJB
    private HelperBeanF110 helperBeanF110;

    public String identify() {
        return "HelperBeanG110";
    }
}
