package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF135 {

    @EJB
    private HelperBeanE135 helperBeanE135;

    public String identify() {
        return "HelperBeanF135";
    }
}
