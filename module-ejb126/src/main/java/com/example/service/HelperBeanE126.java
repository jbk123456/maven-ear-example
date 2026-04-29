package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE126 {

    @EJB
    private HelperBeanD126 helperBeanD126;

    public String identify() {
        return "HelperBeanE126";
    }
}
