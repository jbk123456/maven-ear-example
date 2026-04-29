package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI164 {

    @EJB
    private HelperBeanH164 helperBeanH164;

    public String identify() {
        return "HelperBeanI164";
    }
}
