package com.hong.gmall.oms.service.impl;

import com.hong.gmall.oms.entity.CartItem;
import com.hong.gmall.oms.mapper.CartItemMapper;
import com.hong.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Hch
 * @since 2020-02-20
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
