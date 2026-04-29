package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF71 {

    @EJB
    private HelperBeanE71 helperBeanE71;

    public String identify() {
        return "HelperBeanF71";
    }
}
