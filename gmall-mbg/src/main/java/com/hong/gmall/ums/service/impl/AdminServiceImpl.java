package com.hong.gmall.ums.service.impl;

import com.hong.gmall.ums.entity.Admin;
import com.hong.gmall.ums.mapper.AdminMapper;
import com.hong.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Hch
 * @since 2020-02-20
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
