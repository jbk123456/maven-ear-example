package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH155 {

    @EJB
    private HelperBeanG155 helperBeanG155;

    public String identify() {
        return "HelperBeanH155";
    }
}
