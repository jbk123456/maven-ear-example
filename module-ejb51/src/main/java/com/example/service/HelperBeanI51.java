package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI51 {

    @EJB
    private HelperBeanH51 helperBeanH51;

    public String identify() {
        return "HelperBeanI51";
    }
}
