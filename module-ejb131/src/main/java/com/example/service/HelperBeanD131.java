package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD131 {

    @EJB
    private HelperBeanC131 helperBeanC131;

    public String identify() {
        return "HelperBeanD131";
    }
}
