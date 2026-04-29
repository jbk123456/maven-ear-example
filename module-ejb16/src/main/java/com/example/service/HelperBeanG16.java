package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG16 {

    @EJB
    private HelperBeanF16 helperBeanF16;

    public String identify() {
        return "HelperBeanG16";
    }
}
