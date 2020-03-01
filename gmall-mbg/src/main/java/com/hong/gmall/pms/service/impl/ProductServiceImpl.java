package com.hong.gmall.pms.service.impl;

import com.hong.gmall.pms.entity.Product;
import com.hong.gmall.pms.mapper.ProductMapper;
import com.hong.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Hch
 * @since 2020-02-20
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
