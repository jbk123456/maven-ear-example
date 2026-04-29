package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG105 {

    @EJB
    private HelperBeanF105 helperBeanF105;

    public String identify() {
        return "HelperBeanG105";
    }
}
