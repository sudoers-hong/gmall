package com.hong.gmall.ums.service.impl;

import com.hong.gmall.ums.entity.Member;
import com.hong.gmall.ums.mapper.MemberMapper;
import com.hong.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Hch
 * @since 2020-02-20
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
