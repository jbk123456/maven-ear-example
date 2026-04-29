package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH66 {

    @EJB
    private HelperBeanG66 helperBeanG66;

    public String identify() {
        return "HelperBeanH66";
    }
}
