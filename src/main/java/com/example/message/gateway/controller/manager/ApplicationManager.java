package com.example.message.gateway.controller.manager;

import com.example.message.gateway.entity.po.Application;
import com.example.message.gateway.service.ApplicationService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/app")
public class ApplicationManager {

    @Resource
    private ApplicationService applicationService;

    @RequestMapping("/insertPage")
    public String index() {
        return "application/insertPage";
    }

    @RequestMapping("/list")
    public String appList(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        PageInfo<Application> applicationList = applicationService.listApplicationByPage(pageNum, pageSize);
        model.addAttribute("applicationList", applicationList.getList());
        model.addAttribute("pageInfo", applicationList);
        return "application/listPage";
    }

    @RequestMapping("/insert")
    public String insert(Application application, Model model) {
        applicationService.insert(application);
        return "redirect:/app/list";
    }

    @GetMapping("/delete/{appID}")
    public String delete(@PathVariable Integer appID) {
        applicationService.delete(appID);
        return "redirect:/app/list";
    }

    @GetMapping("/update/{appID}")
    public String update(Model model, @PathVariable Integer appID) {
        Application application = applicationService.findApplicationById(appID);
        model.addAttribute("app", application);
        return "application/updatePage";
    }

    @PostMapping("/update")
    public String updateUser(Application app) {
        applicationService.change(app);
        return "redirect:/app/list";
    }
}