package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/22 0022.
 */

public class Suggestion {

    public Air air;
    public Comf comf;
    public Cw cw;
    public Drsg drsg;
    public Flu flu;
    public Sport sport;
    public Trav trav;
    public Uv uv;

    public class Air{
        public String brf;
        @SerializedName("txt")
        public String info;
    }

    public class Comf{
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class Cw{
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class Drsg{
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class Flu{
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class Trav{
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class Uv{
        public String brf;
        @SerializedName("txt")
        public String info;
    }
}
