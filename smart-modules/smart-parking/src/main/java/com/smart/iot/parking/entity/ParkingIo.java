package com.smart.iot.parking.entity;

import tk.mybatis.mapper.annotation.Version;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 出入口
 *
 * @author Mr.AG
 * @email
 *@version 2022-08-16 17:19:40
 */
@Table(name = "parking_io")
public class ParkingIo implements Serializable {
	private static final long serialVersionUID = 1L;

	    //出入口id
	@Id
    private String parkingIoId;
	//
	@Version
	@Column(name = "version")
	private Integer version;

	//朝向：090180270=上右下左
    @Column(name = "angle")
    private Integer angle;

	    //所属区层
    @Column(name = "parking_area_id")
    private String parkingAreaId;

	    //停车场
    @Column(name = "parking_id")
    private String parkingId;

	    //出入口名称
    @Column(name = "parking_io_name")
    private String parkingIoName;

	    //出入口名称（中文）
    @Column(name = "parking_io_name_ch")
    private String parkingIoNameCh;

	    //1=入口；2=出口
    @Column(name = "parking_io_type")
    private String parkingIoType;

	    //横向坐标
    @Column(name = "x")
    private Integer x;

	    //纵向坐标
    @Column(name = "y")
    private Integer y;

	    //缩放比例：100=1:1
    @Column(name = "zoom")
    private Integer zoom;

	    //最新照到的车牌
    @Column(name = "io_lastplate")
    private String ioLastplate;

	    //摄像头sn
    @Column(name = "camera_sn")
    private String cameraSn;

	    //有效标志(y:有效；n：无效)
    @Column(name = "enabled_flag")
    private String enabledFlag;

	    //创建时间
    @Column(name = "crt_time")
    private Date crtTime;

	    //创建人id
    @Column(name = "crt_user")
    private String crtUser;

	    //创建人
    @Column(name = "crt_name")
    private String crtName;

	    //创建主机
    @Column(name = "crt_host")
    private String crtHost;

	    //最后更新时间
    @Column(name = "upd_time")
    private Date updTime;

	    //最后更新人id
    @Column(name = "upd_user")
    private String updUser;

	    //最后更新人
    @Column(name = "upd_name")
    private String updName;

	    //最后更新主机
    @Column(name = "upd_host")
    private String updHost;

	    //
    @Column(name = "attr1")
    private String attr1;

	    //
    @Column(name = "attr2")
    private String attr2;

	    //
    @Column(name = "attr3")
    private String attr3;

	    //
    @Column(name = "attr4")
    private String attr4;

	    //
    @Column(name = "attr5")
    private String attr5;

	    //
    @Column(name = "attr6")
    private String attr6;

	    //
    @Column(name = "attr7")
    private String attr7;

	    //
    @Column(name = "attr8")
    private String attr8;

	    //租户id
    @Column(name = "tenant_id")
    private String tenantId;

	    //
    @Column(name = "crt_user_id")
    private String crtUserId;


	/**
	 * 设置：出入口id
	 */
	public void setParkingIoId(String parkingIoId) {
		this.parkingIoId = parkingIoId;
	}
	/**
	 * 获取：出入口id
	 */
	public String getParkingIoId() {
		return parkingIoId;
	}
	/**
	 * 设置：朝向：090180270=上右下左
	 */
	public void setAngle(Integer angle) {
		this.angle = angle;
	}
	/**
	 * 获取：朝向：090180270=上右下左
	 */
	public Integer getAngle() {
		return angle;
	}
	/**
	 * 设置：所属区层
	 */
	public void setParkingAreaId(String parkingAreaId) {
		this.parkingAreaId = parkingAreaId;
	}
	/**
	 * 获取：所属区层
	 */
	public String getParkingAreaId() {
		return parkingAreaId;
	}
	/**
	 * 设置：停车场
	 */
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}
	/**
	 * 获取：停车场
	 */
	public String getParkingId() {
		return parkingId;
	}
	/**
	 * 设置：出入口名称
	 */
	public void setParkingIoName(String parkingIoName) {
		this.parkingIoName = parkingIoName;
	}
	/**
	 * 获取：出入口名称
	 */
	public String getParkingIoName() {
		return parkingIoName;
	}
	/**
	 * 设置：出入口名称（中文）
	 */
	public void setParkingIoNameCh(String parkingIoNameCh) {
		this.parkingIoNameCh = parkingIoNameCh;
	}
	/**
	 * 获取：出入口名称（中文）
	 */
	public String getParkingIoNameCh() {
		return parkingIoNameCh;
	}
	/**
	 * 设置：1=入口；2=出口
	 */
	public void setParkingIoType(String parkingIoType) {
		this.parkingIoType = parkingIoType;
	}
	/**
	 * 获取：1=入口；2=出口
	 */
	public String getParkingIoType() {
		return parkingIoType;
	}
	/**
	 * 设置：横向坐标
	 */
	public void setX(Integer x) {
		this.x = x;
	}
	/**
	 * 获取：横向坐标
	 */
	public Integer getX() {
		return x;
	}
	/**
	 * 设置：纵向坐标
	 */
	public void setY(Integer y) {
		this.y = y;
	}
	/**
	 * 获取：纵向坐标
	 */
	public Integer getY() {
		return y;
	}
	/**
	 * 设置：缩放比例：100=1:1
	 */
	public void setZoom(Integer zoom) {
		this.zoom = zoom;
	}
	/**
	 * 获取：缩放比例：100=1:1
	 */
	public Integer getZoom() {
		return zoom;
	}
	/**
	 * 设置：最新照到的车牌
	 */
	public void setIoLastplate(String ioLastplate) {
		this.ioLastplate = ioLastplate;
	}
	/**
	 * 获取：最新照到的车牌
	 */
	public String getIoLastplate() {
		return ioLastplate;
	}
	/**
	 * 设置：摄像头sn
	 */
	public void setCameraSn(String cameraSn) {
		this.cameraSn = cameraSn;
	}
	/**
	 * 获取：摄像头sn
	 */
	public String getCameraSn() {
		return cameraSn;
	}
	/**
	 * 设置：有效标志(y:有效；n：无效)
	 */
	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}
	/**
	 * 获取：有效标志(y:有效；n：无效)
	 */
	public String getEnabledFlag() {
		return enabledFlag;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCrtTime() {
		return crtTime;
	}
	/**
	 * 设置：创建人id
	 */
	public void setCrtUser(String crtUser) {
		this.crtUser = crtUser;
	}
	/**
	 * 获取：创建人id
	 */
	public String getCrtUser() {
		return crtUser;
	}
	/**
	 * 设置：创建人
	 */
	public void setCrtName(String crtName) {
		this.crtName = crtName;
	}
	/**
	 * 获取：创建人
	 */
	public String getCrtName() {
		return crtName;
	}
	/**
	 * 设置：创建主机
	 */
	public void setCrtHost(String crtHost) {
		this.crtHost = crtHost;
	}
	/**
	 * 获取：创建主机
	 */
	public String getCrtHost() {
		return crtHost;
	}
	/**
	 * 设置：最后更新时间
	 */
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
	/**
	 * 获取：最后更新时间
	 */
	public Date getUpdTime() {
		return updTime;
	}
	/**
	 * 设置：最后更新人id
	 */
	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}
	/**
	 * 获取：最后更新人id
	 */
	public String getUpdUser() {
		return updUser;
	}
	/**
	 * 设置：最后更新人
	 */
	public void setUpdName(String updName) {
		this.updName = updName;
	}
	/**
	 * 获取：最后更新人
	 */
	public String getUpdName() {
		return updName;
	}
	/**
	 * 设置：最后更新主机
	 */
	public void setUpdHost(String updHost) {
		this.updHost = updHost;
	}
	/**
	 * 获取：最后更新主机
	 */
	public String getUpdHost() {
		return updHost;
	}
	/**
	 * 设置：
	 */
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	/**
	 * 获取：
	 */
	public String getAttr1() {
		return attr1;
	}
	/**
	 * 设置：
	 */
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	/**
	 * 获取：
	 */
	public String getAttr2() {
		return attr2;
	}
	/**
	 * 设置：
	 */
	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}
	/**
	 * 获取：
	 */
	public String getAttr3() {
		return attr3;
	}
	/**
	 * 设置：
	 */
	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}
	/**
	 * 获取：
	 */
	public String getAttr4() {
		return attr4;
	}
	/**
	 * 设置：
	 */
	public void setAttr5(String attr5) {
		this.attr5 = attr5;
	}
	/**
	 * 获取：
	 */
	public String getAttr5() {
		return attr5;
	}
	/**
	 * 设置：
	 */
	public void setAttr6(String attr6) {
		this.attr6 = attr6;
	}
	/**
	 * 获取：
	 */
	public String getAttr6() {
		return attr6;
	}
	/**
	 * 设置：
	 */
	public void setAttr7(String attr7) {
		this.attr7 = attr7;
	}
	/**
	 * 获取：
	 */
	public String getAttr7() {
		return attr7;
	}
	/**
	 * 设置：
	 */
	public void setAttr8(String attr8) {
		this.attr8 = attr8;
	}
	/**
	 * 获取：
	 */
	public String getAttr8() {
		return attr8;
	}
	/**
	 * 设置：租户id
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	/**
	 * 获取：租户id
	 */
	public String getTenantId() {
		return tenantId;
	}
	/**
	 * 设置：
	 */
	public void setCrtUserId(String crtUserId) {
		this.crtUserId = crtUserId;
	}
	/**
	 * 获取：
	 */
	public String getCrtUserId() {
		return crtUserId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
