package com.example.message.gateway.controller.manager;

import com.example.message.gateway.entity.po.Provider;
import com.example.message.gateway.service.ProviderService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/provider")
public class ProviderManager {

    @Resource
    private ProviderService providerService;

    @RequestMapping("/insertPage")
    public String index() {
        return "provider/insertPage";
    }

    @RequestMapping("/list")
    public String appList(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        PageInfo<Provider> providerList = providerService.listProviderByPage(pageNum, pageSize);
        model.addAttribute("providerList", providerList.getList());
        model.addAttribute("pageInfo", providerList);
        return "provider/listPage";
    }

    @RequestMapping("/insert")
    public String insert(Provider provider) {
        providerService.insert(provider);
        return "redirect:/provider/list";
    }

    @GetMapping("/delete/{providerID}")
    public String delete(@PathVariable Integer providerID) {
        providerService.delete(providerID);
        return "redirect:/provider/list";
    }

    @GetMapping("/update/{providerID}")
    public String update(Model model, @PathVariable Integer providerID) {
        Provider provider = providerService.findProviderById(providerID);
        model.addAttribute("provider", provider);
        return "provider/updatePage";
    }

    @PostMapping("/update")
    public String updateUser(Provider provider) {
        providerService.change(provider);
        return "redirect:/provider/list";
    }
}