package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC131 {

    @EJB
    private HelperBeanB131 helperBeanB131;

    public String identify() {
        return "HelperBeanC131";
    }
}
