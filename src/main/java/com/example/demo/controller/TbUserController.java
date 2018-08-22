package com.example.demo.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.demo.entity.TbUser;
import com.example.demo.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 小混蛋
 * @since 2018-08-22
 */
@Controller
@RequestMapping("/tbUser")
public class TbUserController {
    @Autowired
    private TbUserService tbUserService;
    @RequestMapping("/all")
    @ResponseBody
    public List<TbUser> getAll(){
        return tbUserService.selectList(new EntityWrapper<TbUser>());
    }
}

