package com.yin.common.service;

import com.alibaba.fastjson.JSONObject;
import com.yin.common.controller.BaseJson;
import com.yin.common.entity.bo.UserSessionBo;
import com.yin.common.entity.vo.LoginUserVo;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 登录服务
 *
 * @author yin.weilong
 * @date 2019.03.15
 */
@Service
public class CommonLoginService {

    @Value("${erp.login.url}")
    private String loginUrl;

    /**
     * 登录
     *
     * @param loginUserVo
     * @return
     */
    public BaseJson login(LoginUserVo loginUserVo) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        BaseJson baseJson = null;
        try {
            // 创建Http Post请求
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("username", loginUserVo.getUsername());
            jsonObject.put("password", loginUserVo.getPassword());
            HttpPost httpPost = new HttpPost(loginUrl + "/api/user/login/login");
            // 创建请求内容
            StringEntity entity = new StringEntity(jsonObject.toJSONString(), ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
            // 执行http请求
            response = httpClient.execute(httpPost);
            String resultString = EntityUtils.toString(response.getEntity(), "utf-8");
            JSONObject rs = JSONObject.parseObject(resultString);
            baseJson = BaseJson.getSuccess();
            baseJson.setCode((Integer) rs.get("code"));
            baseJson.setMessage((String) rs.get("message"));
            UserSessionBo bo = JSONObject.parseObject(rs.getJSONObject("data").toJSONString(), UserSessionBo.class);
            baseJson.setData(bo);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return baseJson;
    }
}
