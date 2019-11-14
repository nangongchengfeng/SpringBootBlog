package com.lrm.web.admin;

import com.lrm.po.Type;
import com.lrm.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

<<<<<<< HEAD
=======
/**
 * Created by limi on 2017/10/16.
 */
>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36

@Controller
@RequestMapping("/admin")
public class TypeController {

    @Autowired
    private TypeService typeService;

<<<<<<< HEAD
    /**
     * 查看分类列表
     * @param pageable
     * @param model
     * @return
     */
=======
>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36
    @GetMapping("/types")
    public String types(@PageableDefault(size = 3,sort = {"id"},direction = Sort.Direction.DESC)
                                    Pageable pageable, Model model) {
        model.addAttribute("page",typeService.listType(pageable));
        return "admin/types";
    }

<<<<<<< HEAD
    /**
     * 添加的接口
     * @param model
     * @return
     */
=======
>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36
    @GetMapping("/types/input")
    public String input(Model model) {
        model.addAttribute("type", new Type());
        return "admin/types-input";
    }

<<<<<<< HEAD
    /**
     * 修改的接口
     * @param id
     * @param model
     * @return
     */
=======
>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36
    @GetMapping("/types/{id}/input")
    public String editInput(@PathVariable Long id, Model model) {
        model.addAttribute("type", typeService.getType(id));
        return "admin/types-input";
    }

<<<<<<< HEAD
    /**
     * 添加数据的提交
     * @param type
     * @param result
     * @param attributes
     * @return
     */
=======

>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36
    @PostMapping("/types")
    public String post(@Valid Type type,BindingResult result, RedirectAttributes attributes) {
        Type type1 = typeService.getTypeByName(type.getName());
        if (type1 != null) {
            result.rejectValue("name","nameError","不能添加重复的分类");
        }
        if (result.hasErrors()) {
            return "admin/types-input";
        }
        Type t = typeService.saveType(type);
        if (t == null ) {
            attributes.addFlashAttribute("message", "新增失败");
        } else {
            attributes.addFlashAttribute("message", "新增成功");
        }
        return "redirect:/admin/types";
    }

<<<<<<< HEAD
    /**
     * 修改数据的提交
     * @param type
     * @param result
     * @param id
     * @param attributes
     * @return
     */
=======

>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36
    @PostMapping("/types/{id}")
    public String editPost(@Valid Type type, BindingResult result,@PathVariable Long id, RedirectAttributes attributes) {
        Type type1 = typeService.getTypeByName(type.getName());
        if (type1 != null) {
            result.rejectValue("name","nameError","不能添加重复的分类");
        }
        if (result.hasErrors()) {
            return "admin/types-input";
        }
        Type t = typeService.updateType(id,type);
        if (t == null ) {
            attributes.addFlashAttribute("message", "更新失败");
        } else {
            attributes.addFlashAttribute("message", "更新成功");
        }
        return "redirect:/admin/types";
    }

    /**
     * 删除数据
     * @param id
     * @param attributes
     * @return
     */
    @GetMapping("/types/{id}/delete")
    public String delete(@PathVariable Long id,RedirectAttributes attributes) {
        typeService.deleteType(id);
        attributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/types";
    }


}
