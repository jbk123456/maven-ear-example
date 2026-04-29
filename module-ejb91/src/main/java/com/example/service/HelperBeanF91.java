package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF91 {

    @EJB
    private HelperBeanE91 helperBeanE91;

    public String identify() {
        return "HelperBeanF91";
    }
}
