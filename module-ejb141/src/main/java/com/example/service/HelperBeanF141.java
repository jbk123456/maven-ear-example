package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF141 {

    @EJB
    private HelperBeanE141 helperBeanE141;

    public String identify() {
        return "HelperBeanF141";
    }
}
