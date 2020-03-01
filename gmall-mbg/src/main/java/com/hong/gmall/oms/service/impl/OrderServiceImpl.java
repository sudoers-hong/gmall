package com.hong.gmall.oms.service.impl;

import com.hong.gmall.oms.entity.Order;
import com.hong.gmall.oms.mapper.OrderMapper;
import com.hong.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Hch
 * @since 2020-02-20
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
