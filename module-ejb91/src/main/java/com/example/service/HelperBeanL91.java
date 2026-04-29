package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL91 {

    @EJB
    private HelperBeanK91 helperBeanK91;

    public String identify() {
        return "HelperBeanL91";
    }
}
