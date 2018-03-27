package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 她是龙 on 2018/3/27.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}

