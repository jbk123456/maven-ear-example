package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF131 {

    @EJB
    private HelperBeanE131 helperBeanE131;

    public String identify() {
        return "HelperBeanF131";
    }
}
