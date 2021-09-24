package com.wtw.service.impl;

import com.wtw.service.api.ITicketService;
import com.wtw.util.TicketUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketServiceImpl implements ITicketService {
    @Override
    public List<List<Integer>> make(Integer num) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            ans.add(TicketUtil.makeTicket());
        }
        return ans;
    }
}
