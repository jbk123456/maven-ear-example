package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH125 {

    @EJB
    private HelperBeanG125 helperBeanG125;

    public String identify() {
        return "HelperBeanH125";
    }
}
