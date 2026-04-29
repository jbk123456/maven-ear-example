package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG14 {

    @EJB
    private HelperBeanF14 helperBeanF14;

    public String identify() {
        return "HelperBeanG14";
    }
}
