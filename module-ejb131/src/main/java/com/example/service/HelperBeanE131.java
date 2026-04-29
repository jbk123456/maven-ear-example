package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE131 {

    @EJB
    private HelperBeanD131 helperBeanD131;

    public String identify() {
        return "HelperBeanE131";
    }
}
