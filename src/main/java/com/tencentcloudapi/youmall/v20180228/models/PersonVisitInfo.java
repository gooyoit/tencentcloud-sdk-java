package com.tencentcloudapi.youmall.v20180228.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class PersonVisitInfo  extends AbstractModel{


    /**
    * 用户ID
    */
    @SerializedName("PersonId")
    @Expose
    private Integer PersonId;

    /**
    * 用户到访ID
    */
    @SerializedName("VisitId")
    @Expose
    private Integer VisitId;

    /**
    * 到访时间：Unix时间戳
    */
    @SerializedName("InTime")
    @Expose
    private Integer InTime;

    /**
    * 抓拍到的头像，这里返回的是图片内容的Base64编码
    */
    @SerializedName("CapturedPicture")
    @Expose
    private String CapturedPicture;

    /**
    * 口罩类型：0不戴口罩，1戴口罩
    */
    @SerializedName("MaskType")
    @Expose
    private Integer MaskType;

    /**
    * 眼镜类型：0不戴眼镜，1普通眼镜 , 2墨镜
    */
    @SerializedName("GlassType")
    @Expose
    private Integer GlassType;

    /**
    * 发型：0 短发,  1长发
    */
    @SerializedName("HairType")
    @Expose
    private Integer HairType;

    /**
     * 获取用户ID
     * @return PersonId 用户ID
     */
    public Integer getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置用户ID
     * @param PersonId 用户ID
     */
    public void setPersonId(Integer PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * 获取用户到访ID
     * @return VisitId 用户到访ID
     */
    public Integer getVisitId() {
        return this.VisitId;
    }

    /**
     * 设置用户到访ID
     * @param VisitId 用户到访ID
     */
    public void setVisitId(Integer VisitId) {
        this.VisitId = VisitId;
    }

    /**
     * 获取到访时间：Unix时间戳
     * @return InTime 到访时间：Unix时间戳
     */
    public Integer getInTime() {
        return this.InTime;
    }

    /**
     * 设置到访时间：Unix时间戳
     * @param InTime 到访时间：Unix时间戳
     */
    public void setInTime(Integer InTime) {
        this.InTime = InTime;
    }

    /**
     * 获取抓拍到的头像，这里返回的是图片内容的Base64编码
     * @return CapturedPicture 抓拍到的头像，这里返回的是图片内容的Base64编码
     */
    public String getCapturedPicture() {
        return this.CapturedPicture;
    }

    /**
     * 设置抓拍到的头像，这里返回的是图片内容的Base64编码
     * @param CapturedPicture 抓拍到的头像，这里返回的是图片内容的Base64编码
     */
    public void setCapturedPicture(String CapturedPicture) {
        this.CapturedPicture = CapturedPicture;
    }

    /**
     * 获取口罩类型：0不戴口罩，1戴口罩
     * @return MaskType 口罩类型：0不戴口罩，1戴口罩
     */
    public Integer getMaskType() {
        return this.MaskType;
    }

    /**
     * 设置口罩类型：0不戴口罩，1戴口罩
     * @param MaskType 口罩类型：0不戴口罩，1戴口罩
     */
    public void setMaskType(Integer MaskType) {
        this.MaskType = MaskType;
    }

    /**
     * 获取眼镜类型：0不戴眼镜，1普通眼镜 , 2墨镜
     * @return GlassType 眼镜类型：0不戴眼镜，1普通眼镜 , 2墨镜
     */
    public Integer getGlassType() {
        return this.GlassType;
    }

    /**
     * 设置眼镜类型：0不戴眼镜，1普通眼镜 , 2墨镜
     * @param GlassType 眼镜类型：0不戴眼镜，1普通眼镜 , 2墨镜
     */
    public void setGlassType(Integer GlassType) {
        this.GlassType = GlassType;
    }

    /**
     * 获取发型：0 短发,  1长发
     * @return HairType 发型：0 短发,  1长发
     */
    public Integer getHairType() {
        return this.HairType;
    }

    /**
     * 设置发型：0 短发,  1长发
     * @param HairType 发型：0 短发,  1长发
     */
    public void setHairType(Integer HairType) {
        this.HairType = HairType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "VisitId", this.VisitId);
        this.setParamSimple(map, prefix + "InTime", this.InTime);
        this.setParamSimple(map, prefix + "CapturedPicture", this.CapturedPicture);
        this.setParamSimple(map, prefix + "MaskType", this.MaskType);
        this.setParamSimple(map, prefix + "GlassType", this.GlassType);
        this.setParamSimple(map, prefix + "HairType", this.HairType);

    }
}

