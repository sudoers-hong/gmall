package com.hong.gmall.pms.service.impl;

import com.hong.gmall.pms.entity.Comment;
import com.hong.gmall.pms.mapper.CommentMapper;
import com.hong.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Hch
 * @since 2020-02-20
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
