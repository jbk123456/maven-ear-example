package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG103 {

    @EJB
    private HelperBeanF103 helperBeanF103;

    public String identify() {
        return "HelperBeanG103";
    }
}
