package com.example.message.gateway.controller.manager;

import com.example.message.gateway.entity.po.Template;
import com.example.message.gateway.service.TemplateService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/template")
public class TemplateManager {

    @Resource
    private TemplateService templateService;

    @RequestMapping("/insertPage")
    public String index() {
        return "template/insertPage";
    }

    @RequestMapping("/list")
    public String appList(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        PageInfo<Template> templateList = templateService.listTemplateByPage(pageNum, pageSize);
        model.addAttribute("templateList", templateList.getList());
        model.addAttribute("pageInfo", templateList);
        return "template/listPage";
    }

    @RequestMapping("/insert")
    public String insert(Template template) {
        templateService.insert(template);
        return "redirect:/template/list";
    }

    @GetMapping("/delete/{templateID}")
    public String delete(@PathVariable Integer templateID) {
        templateService.delete(templateID);
        return "redirect:/template/list";
    }

    @GetMapping("/update/{templateID}")
    public String updatePer(Model model, @PathVariable Integer templateID) {
        Template template = templateService.findTemplateById(templateID);
        model.addAttribute("template", template);
        return "template/updatePage";
    }

    @PostMapping("/update")
    public String update(Template template) {
        templateService.change(template);
        return "redirect:/template/list";
    }
}