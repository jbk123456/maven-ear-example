package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG125 {

    @EJB
    private HelperBeanF125 helperBeanF125;

    public String identify() {
        return "HelperBeanG125";
    }
}
