package com.tencentcloudapi.dts.v20180330.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateSyncCheckJobRequest  extends AbstractModel{


    /**
    * 灾备同步任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
     * 获取灾备同步任务ID
     * @return JobId 灾备同步任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * 设置灾备同步任务ID
     * @param JobId 灾备同步任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);

    }
}

