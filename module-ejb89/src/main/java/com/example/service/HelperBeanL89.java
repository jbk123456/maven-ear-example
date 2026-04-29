package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL89 {

    @EJB
    private HelperBeanK89 helperBeanK89;

    public String identify() {
        return "HelperBeanL89";
    }
}
