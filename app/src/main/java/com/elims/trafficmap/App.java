package com.elims.trafficmap;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.elims.trafficmap.bean.RouteInfo;
import com.elims.trafficmap.bean.VideoBean;
import com.elims.trafficmap.fragments.map.IMap;
import com.elims.trafficmap.fragments.video.VideoListAdapter;
import com.waynell.videolist.widget.TextureVideoView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smile on 2016/9/23.
 */

public class App extends Application {

    public static App sInstance;
    public TextureVideoView preVideoView = null;
    public int prePosition = -1;
    public VideoListAdapter.VideoHolder preVideoHolder = null;
    public VideoBean preVideoBean = null;
    public TextureVideoView fullVideoView = null;
    public VideoListAdapter adapter = null;
    public String videoPath = null;
    public LatLng nowLatLng = null;
    public List<RouteInfo> routeInfos = new ArrayList<>();
    public IMap iMap = null;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        // 在使用 SDK 各组间之前初始化 context 信息，传入 ApplicationContext
        SDKInitializer.initialize(this);
    }
}
