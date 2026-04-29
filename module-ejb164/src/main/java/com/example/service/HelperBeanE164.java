package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE164 {

    @EJB
    private HelperBeanD164 helperBeanD164;

    public String identify() {
        return "HelperBeanE164";
    }
}
