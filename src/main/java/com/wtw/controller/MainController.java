package com.wtw.controller;

import com.wtw.service.api.ITicketService;
import com.wtw.response.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ITicketService ticketService;

    @GetMapping("/index")
    public String toIndex() {
        return "index";
    }

    @ResponseBody
    @GetMapping("/make/{num}")
    public ResultEntity<List<List<Integer>>> make(@PathVariable("num") Integer num) {
        List<List<Integer>> res = ticketService.make(num);
        return ResultEntity.successWithData(res);
    }

}
