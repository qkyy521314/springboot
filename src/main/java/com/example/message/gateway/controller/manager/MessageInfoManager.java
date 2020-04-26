package com.example.message.gateway.controller.manager;

import com.example.message.gateway.entity.po.MessageInfo;
import com.example.message.gateway.service.MessageInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/messageInfo")
public class MessageInfoManager {

    @Resource
    private MessageInfoService messageInfoService;

    @RequestMapping("/list")
    public String appList(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        PageInfo<MessageInfo> messageInfoList = messageInfoService.listPushInfoByPage(pageNum, pageSize);
        model.addAttribute("messageInfoList", messageInfoList.getList());
        model.addAttribute("pageInfo", messageInfoList);
        return "messageInfo/listPage";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        messageInfoService.delete(id.longValue());
        return "redirect:/messageInfo/list";
    }
}