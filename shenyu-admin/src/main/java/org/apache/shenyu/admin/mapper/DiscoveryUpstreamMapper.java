/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.shenyu.admin.model.entity.DiscoveryUpstreamDO;
import org.apache.shenyu.admin.validation.ExistProvider;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface DiscoveryUpstreamMapper extends ExistProvider {

    /**
     * id existed.
     *
     * @param key id
     * @return true or false
     */
    @Override
    Boolean existed(@Param("id") Serializable key);

    /**
     * selectByIds.
     *
     * @param ids id list
     * @return discoveryUpstreamDO list
     */
    List<DiscoveryUpstreamDO> selectByIds(@Param("ids") List<String> ids);

    /**
     * insert.
     *
     * @param discoveryUpstreamDO discoveryUpstreamDO
     * @return rows int
     */
    int insert(DiscoveryUpstreamDO discoveryUpstreamDO);

    /**
     * update.
     *
     * @param discoveryUpstreamDO discoveryUpstreamDO
     * @return rows int
     */
    int update(DiscoveryUpstreamDO discoveryUpstreamDO);

    /**
     * deleteByIds.
     *
     * @param ids id list
     * @return rows int
     */
    int deleteByIds(@Param("ids") List<String> ids);
}
