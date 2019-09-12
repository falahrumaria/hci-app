package com.hci.test.hciapp.service;

import com.hci.test.hciapp.entity.SectionOrderEntity;
import com.hci.test.hciapp.entity.UserEntity;
import com.hci.test.hciapp.repo.UserRepo;
import com.hci.test.hciapp.response.Module;
import com.hci.test.hciapp.response.SectionResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SectionService {

    @Autowired
    private UserRepo userRepo;

    public SectionResp get(int userId) {
        SectionResp resp = new SectionResp();
        SectionOrderEntity sectionOrder;
        try {
            sectionOrder = userRepo.findById(userId).getUserGroup().getSectionOrder();
        } catch (NullPointerException e) {
            return null;
        }
        List<Module> list = new ArrayList<>();
        list.add(new Module(sectionOrder.getSection1().getDescription(), 1));
        list.add(new Module(sectionOrder.getSection2().getDescription(), 2));
        list.add(new Module(sectionOrder.getSection3().getDescription(), 3));
        list.add(new Module(sectionOrder.getSection4().getDescription(), 4));
        list.add(new Module(sectionOrder.getSection5().getDescription(), 5));
        resp.setModules(list);
        return resp;
    }
}
