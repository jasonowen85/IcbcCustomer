package com.netease.nim.uikit.session.module;

import android.content.Intent;

import com.netease.nim.uikit.session.actions.PickImageAction;

/**
 * Created by hasee on 2017/1/18.
 */
public interface RequsetPermission {
    // 发送权限的请求
    void requestPermissionAudio(String[] permession);// 发送权限的请求
    void requestPermissionCarame(String[] permession);
    void requestPermissionSDcard(String[] permession);
    void requestPermissionLocation(String[] permession);
    void requestPermissionCallPhone(String[] permession);
}
