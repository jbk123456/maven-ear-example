package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH1 {

    @EJB
    private HelperBeanG1 helperBeanG1;

    public String identify() {
        return "HelperBeanH1";
    }
}
