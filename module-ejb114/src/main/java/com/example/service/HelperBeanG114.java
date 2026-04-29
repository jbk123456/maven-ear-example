package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG114 {

    @EJB
    private HelperBeanF114 helperBeanF114;

    public String identify() {
        return "HelperBeanG114";
    }
}
