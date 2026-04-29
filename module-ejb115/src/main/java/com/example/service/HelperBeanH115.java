package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH115 {

    @EJB
    private HelperBeanG115 helperBeanG115;

    public String identify() {
        return "HelperBeanH115";
    }
}
