package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI29 {

    @EJB
    private HelperBeanH29 helperBeanH29;

    public String identify() {
        return "HelperBeanI29";
    }
}
