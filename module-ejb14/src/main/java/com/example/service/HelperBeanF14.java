package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF14 {

    @EJB
    private HelperBeanE14 helperBeanE14;

    public String identify() {
        return "HelperBeanF14";
    }
}
