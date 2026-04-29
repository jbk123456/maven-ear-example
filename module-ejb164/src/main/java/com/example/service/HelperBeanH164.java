package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH164 {

    @EJB
    private HelperBeanG164 helperBeanG164;

    public String identify() {
        return "HelperBeanH164";
    }
}
