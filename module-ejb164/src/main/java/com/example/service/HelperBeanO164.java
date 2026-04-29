package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO164 {

    @EJB
    private HelperBeanN164 helperBeanN164;

    public String identify() {
        return "HelperBeanO164";
    }
}
