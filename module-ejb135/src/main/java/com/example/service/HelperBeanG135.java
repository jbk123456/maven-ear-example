package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG135 {

    @EJB
    private HelperBeanF135 helperBeanF135;

    public String identify() {
        return "HelperBeanG135";
    }
}
