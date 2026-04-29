package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI69 {

    @EJB
    private HelperBeanH69 helperBeanH69;

    public String identify() {
        return "HelperBeanI69";
    }
}
