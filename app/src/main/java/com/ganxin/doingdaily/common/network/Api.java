package com.ganxin.doingdaily.common.network;

import com.ganxin.doingdaily.common.data.model.NewsChannel;
import com.ganxin.doingdaily.common.data.model.NewsContent;
import com.ganxin.doingdaily.common.data.model.WechatCategory;
import com.ganxin.doingdaily.common.data.model.WechatContent;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Description : Api定义接口  <br/>
 * author : WangGanxin <br/>
 * date : 2016/10/31 <br/>
 * email : ganxinvip@163.com <br/>
 */
public interface Api {
    /**
     * 获取新闻频道
     * @return
     */
    @GET("109-34")
    Observable<NewsChannel> getNewsChannel();

    /**
     * 获取新闻内容
     * @param options
     * @return
     */
    @GET("109-35")
    Observable<NewsContent> getNewsContent(@QueryMap Map<String,String> options);

    /**
     * 获取微信精选文章类别
     * @return
     */
    @GET("582-1")
    Observable<WechatCategory> getWechatCategory();

    /**
     * 获取微信精选文章列表
     * @return
     */
    @GET("582-2")
    Observable<WechatContent> getWechatCategoryContent(@QueryMap Map<String,String> options);
}
