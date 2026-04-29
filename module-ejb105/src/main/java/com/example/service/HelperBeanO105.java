package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO105 {

    @EJB
    private HelperBeanN105 helperBeanN105;

    public String identify() {
        return "HelperBeanO105";
    }
}
