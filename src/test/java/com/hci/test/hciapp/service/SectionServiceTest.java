package com.hci.test.hciapp.service;

import com.hci.test.hciapp.entity.SectionEntity;
import com.hci.test.hciapp.entity.SectionOrderEntity;
import com.hci.test.hciapp.entity.UserEntity;
import com.hci.test.hciapp.entity.UserGroupEntity;
import com.hci.test.hciapp.repo.UserRepo;
import com.hci.test.hciapp.response.SectionResp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SectionServiceTest {

    @InjectMocks
    private SectionService service;
    @Mock
    private UserRepo userRepo;

    @Test
    public void testGet() {
        SectionEntity se1 = new SectionEntity(1, "PromoCard");
        SectionEntity se2 = new SectionEntity(2, "CategoryCard");
        SectionEntity se3 = new SectionEntity(3, "FlashSaleCard");
        SectionEntity se4 = new SectionEntity(4, "HistoryCard");
        SectionEntity se5 = new SectionEntity(5, "NewsCard");
        SectionOrderEntity soe = new SectionOrderEntity(2, 2, se1, se4, se3, se2, se5);
        UserGroupEntity uge = new UserGroupEntity(2, soe);
        UserEntity ue = new UserEntity(2, 2, uge);
        Mockito.when(userRepo.findById(2)).thenReturn(ue);

        SectionResp resp = service.get(2);

        assertEquals("PromoCard", resp.getModules().get(0).getModuleName());
        assertEquals("HistoryCard", resp.getModules().get(1).getModuleName());
        assertEquals("FlashSaleCard", resp.getModules().get(2).getModuleName());
        assertEquals("CategoryCard", resp.getModules().get(3).getModuleName());
        assertEquals("NewsCard", resp.getModules().get(4).getModuleName());
    }
}