package com.o3dr.services.android.lib.drone.action;

import com.o3dr.services.android.lib.util.Utils;

public class GimbalActions {

    //Private to prevent instantiation
    private GimbalActions(){}

    public static final String GIMBAL_PITCH = "gimbal_pitch";
    public static final String GIMBAL_YAW = "gimbal_yaw";
    public static final String GIMBAL_ROLL = "gimbal_roll";

    public static final String ACTION_SET_GIMBAL_ORIENTATION = Utils.PACKAGE_NAME + ".action.gimbal" +
            ".SET_GIMBAL_ORIENTATION";

}
