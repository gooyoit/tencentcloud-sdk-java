package com.tencentcloudapi.youmall.v20180228.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeZoneTrafficInfoResponse  extends AbstractModel{


    /**
    * 公司ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 门店ID
    */
    @SerializedName("ShopId")
    @Expose
    private Integer ShopId;

    /**
    * 查询结果总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 区域客流信息列表
    */
    @SerializedName("ZoneTrafficInfoSet")
    @Expose
    private ZoneTrafficInfo [] ZoneTrafficInfoSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取公司ID
     * @return CompanyId 公司ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * 设置公司ID
     * @param CompanyId 公司ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * 获取门店ID
     * @return ShopId 门店ID
     */
    public Integer getShopId() {
        return this.ShopId;
    }

    /**
     * 设置门店ID
     * @param ShopId 门店ID
     */
    public void setShopId(Integer ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * 获取查询结果总数
     * @return TotalCount 查询结果总数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置查询结果总数
     * @param TotalCount 查询结果总数
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取区域客流信息列表
     * @return ZoneTrafficInfoSet 区域客流信息列表
     */
    public ZoneTrafficInfo [] getZoneTrafficInfoSet() {
        return this.ZoneTrafficInfoSet;
    }

    /**
     * 设置区域客流信息列表
     * @param ZoneTrafficInfoSet 区域客流信息列表
     */
    public void setZoneTrafficInfoSet(ZoneTrafficInfo [] ZoneTrafficInfoSet) {
        this.ZoneTrafficInfoSet = ZoneTrafficInfoSet;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ZoneTrafficInfoSet.", this.ZoneTrafficInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

