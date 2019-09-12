package com.hci.test.hciapp.ctrl;

import com.hci.test.hciapp.response.Module;
import com.hci.test.hciapp.response.SectionResp;
import com.hci.test.hciapp.service.SectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(SectionCtrl.class)
public class SectionCtrlTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private SectionService service;

    @Test
    public void getTest() throws Exception {
        List<Module> modules = new ArrayList<>();
        modules.add(new Module("PromoCard", 1));
        modules.add(new Module("HistoryCard", 2));
        modules.add(new Module("FlashSaleCard", 3));
        modules.add(new Module("CategoryCard", 4));
        modules.add(new Module("NewsCard", 5));
        SectionResp resp = new SectionResp(modules);
        String expected = "{\"modules\":[{\"moduleName\":\"PromoCard\",\"moduleOrder\":1},{\"moduleName\":\"HistoryCard\"," +
                "\"moduleOrder\":2},{\"moduleName\":\"FlashSaleCard\",\"moduleOrder\":3},{\"moduleName\":\"CategoryCard\"," +
                "\"moduleOrder\":4},{\"moduleName\":\"NewsCard\",\"moduleOrder\":5}]}";
        Mockito.when(service.get(7)).thenReturn(resp);
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/api/section/7").accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        JSONAssert.assertEquals(expected, result.getResponse()
                .getContentAsString(), false);
    }
}