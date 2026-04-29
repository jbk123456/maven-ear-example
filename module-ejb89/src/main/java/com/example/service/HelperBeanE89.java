package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE89 {

    @EJB
    private HelperBeanD89 helperBeanD89;

    public String identify() {
        return "HelperBeanE89";
    }
}
