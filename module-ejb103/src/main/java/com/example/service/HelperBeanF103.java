package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF103 {

    @EJB
    private HelperBeanE103 helperBeanE103;

    public String identify() {
        return "HelperBeanF103";
    }
}
