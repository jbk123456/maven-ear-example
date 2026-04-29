package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE147 {

    @EJB
    private HelperBeanD147 helperBeanD147;

    public String identify() {
        return "HelperBeanE147";
    }
}
