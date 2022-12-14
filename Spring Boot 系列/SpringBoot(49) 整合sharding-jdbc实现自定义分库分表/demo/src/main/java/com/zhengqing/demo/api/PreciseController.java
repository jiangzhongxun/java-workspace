package com.zhengqing.demo.api;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhengqing.demo.entity.User;
import com.zhengqing.demo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * precise
 * </p>
 *
 * @author zhengqingya
 * @description
 * @date 2021/01/13 10:11
 */
@Slf4j
@RestController
@RequestMapping("/api/precise")
@Api(tags = {"precise"})
public class PreciseController {

    @Autowired
    private IUserService demoService;

    @GetMapping("list/page")
    @ApiOperation("列表分页")
    public IPage<User> listPageForPrecise() {
        return this.demoService.listPageForPrecise();
    }

}
