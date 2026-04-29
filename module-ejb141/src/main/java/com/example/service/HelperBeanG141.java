package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG141 {

    @EJB
    private HelperBeanF141 helperBeanF141;

    public String identify() {
        return "HelperBeanG141";
    }
}
