package com.hong.gmall.oms.service.impl;

import com.hong.gmall.oms.entity.OrderItem;
import com.hong.gmall.oms.mapper.OrderItemMapper;
import com.hong.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Hch
 * @since 2020-02-20
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
