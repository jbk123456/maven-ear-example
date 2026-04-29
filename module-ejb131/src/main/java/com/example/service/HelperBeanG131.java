package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG131 {

    @EJB
    private HelperBeanF131 helperBeanF131;

    public String identify() {
        return "HelperBeanG131";
    }
}
