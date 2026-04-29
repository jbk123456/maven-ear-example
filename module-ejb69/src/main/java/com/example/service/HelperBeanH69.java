package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH69 {

    @EJB
    private HelperBeanG69 helperBeanG69;

    public String identify() {
        return "HelperBeanH69";
    }
}
