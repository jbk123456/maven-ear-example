package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE135 {

    @EJB
    private HelperBeanD135 helperBeanD135;

    public String identify() {
        return "HelperBeanE135";
    }
}
