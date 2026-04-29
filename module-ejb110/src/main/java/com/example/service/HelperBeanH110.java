package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH110 {

    @EJB
    private HelperBeanG110 helperBeanG110;

    public String identify() {
        return "HelperBeanH110";
    }
}
