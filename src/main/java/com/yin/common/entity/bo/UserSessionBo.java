package com.yin.common.entity.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用户状态BO
 *
 * @author yin
 */
@Data
public class UserSessionBo implements Serializable {

    private String id;

    private String tnId;

    private String account;

    private String name;

    private String avatar = "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif";

    private String token;

    private String introduction;

    private List<String> roles;

    private List<String> powers;

    private List<String> goodsGroupIds;

    private List<String> warehouseGroupIds;

    private List<String> channelGroupIds;

    private List<String> supplierGroupIds;


}
