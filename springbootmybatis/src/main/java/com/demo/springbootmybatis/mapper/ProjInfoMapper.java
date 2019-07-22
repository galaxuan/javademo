package com.demo.springbootmybatis.mapper;

import com.demo.springbootmybatis.entity.ProjInfo;

/**
 * @program: javademo
 * @description:
 * @author: wang gang
 * @create: 2019-06-28 14:41
 */
public interface ProjInfoMapper {

    public ProjInfo findProjInfoByName(String projName);

    public ProjInfo findProjInfoByNewCode(long newCode);
}