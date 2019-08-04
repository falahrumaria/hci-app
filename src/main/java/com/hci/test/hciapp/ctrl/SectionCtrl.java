package com.hci.test.hciapp.ctrl;

import com.hci.test.hciapp.response.SectionResp;
import com.hci.test.hciapp.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/section")
public class SectionCtrl {

    @Autowired
    private SectionService service;

    @GetMapping(value = "/{id}")
    public SectionResp getOne(@PathVariable("id") String id) {
        return service.get(Integer.parseInt(id));
    }
}
