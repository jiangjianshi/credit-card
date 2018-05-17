package com.br.creditcard.mapper;

import java.util.List;
import java.util.Map;

public interface ActivityDao {

  /**
   * 根据条件查询活动信息
   */
  List<Map<String, Object>> getSimpleActivityByCondition(Map<String, Object> paramMap);

  /**
   * 根据条件查询活动信息总数
   */
  Integer getSimpleActivityTotalByCondition(Map<String, Object> paramMap);

  /**
   * 添加或者修改活动信息
   */
  Integer addActivity(Map<String, Object> paramMap);

  /**
   * 修改活动信息
   */
  Integer updateActivity(Map<String, Object> paramMap);

  /**
   * 删除活动信息
   */
  Integer deleteActivity(Map<String, Object> paramMap);

  List<Map<String, Object>> selectById();
}
