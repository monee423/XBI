package com.henry.springbootinit.service;

import com.henry.springbootinit.model.entity.PostThumb;
import com.baomidou.mybatisplus.extension.service.IService;
import com.henry.springbootinit.model.entity.User;
import com.henry.springbootinit.model.entity.Chart;

/**
 * 帖子点赞服务
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostThumbInner(long userId, long postId);

    /**
    * @author monee
    * @description 针对表【chart(图表信息表)】的数据库操作Service
    * @createDate 2024-03-26 10:24:14
    */
    interface ChartService extends IService<Chart> {

    }
}
