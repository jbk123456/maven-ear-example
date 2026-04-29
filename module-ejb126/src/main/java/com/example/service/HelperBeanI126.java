package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI126 {

    @EJB
    private HelperBeanH126 helperBeanH126;

    public String identify() {
        return "HelperBeanI126";
    }
}
