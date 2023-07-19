package com.smart.iot.parking.vo;

import com.smart.iot.parking.entity.LotMsg;
import com.smart.iot.parking.entity.Parking;
import com.smart.iot.parking.entity.ParkingSpace;
import com.smart.iot.parking.entity.Plate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 停车记录表
 *
 * @author Mr.AG
 * @email 
 *@version 2022-08-08 11:32:56
 */
public class LotMsgVo implements Serializable {
	private static final long serialVersionUID = 1L;

	    //
    @Id
	private String lmId;

	    //开始时间
    private String beginDate;

	    //停车时间
    private String lotTime;

	    //结束时间
    private String endDate;
	//结束时间
	private String phone;

	//车牌id
    private String plateId;

	    //车位id
    private String spaceId;

	//停车场编号
	//停车场id
    private String parkingId;

	//有效标志(y:有效；n：无效)
    private String enabledFlag;

	    //创建时间
    private Date crtTime;

	    //创建人id
    private String crtUser;

	    //创建人
    private String crtName;

	    //创建主机
    private String crtHost;

	    //最后更新时间
    private Date updTime;

	    //最后更新人id
    private String updUser;

	    //最后更新人
    private String updName;

	    //最后更新主机
    private String updHost;

	    //
    private String attr1;

	    //
    private String attr2;

	    //
    private String attr3;

	    //
    private String attr4;

	    //
    private String attr5;

	    //
    private String attr6;

	    //
    private String attr7;

	    //
    private String attr8;

	    //租户id
    private String tenantId;

	    //
    private String crtUserId;

    private Parking parking;

	private ParkingSpace parkingSpace;

	private Plate plate;

	public Plate getPlate() {
		return plate;
	}

	public void setPlate(Plate plate) {
		this.plate = plate;
	}

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

	public ParkingSpace getParkingSpace() {
		return parkingSpace;
	}

	public void setParkingSpace(ParkingSpace parkingSpace) {
		this.parkingSpace = parkingSpace;
	}


	public LotMsgVo(LotMsg lotMsg) {
		this.lmId = lotMsg.getLmId();
		this.beginDate = lotMsg.getBeginDate();
		this.lotTime = lotMsg.getLotTime();
		this.endDate = lotMsg.getEndDate();
		this.phone = lotMsg.getPhone();
		this.plateId = lotMsg.getPlateId();
		this.spaceId = lotMsg.getSpaceId();
		this.parkingId = lotMsg.getParkingId();
		this.enabledFlag = lotMsg.getEnabledFlag();
		this.crtTime = lotMsg.getCrtTime();
		this.crtUser = lotMsg.getCrtUser();
		this.crtName = lotMsg.getCrtName();
		this.crtHost = lotMsg.getCrtHost();
		this.updTime = lotMsg.getUpdTime();
		this.updUser = lotMsg.getUpdUser();
		this.updName = lotMsg.getUpdName();
		this.updHost = lotMsg.getUpdHost();
		this.attr1 = lotMsg.getAttr1();
		this.attr2 = lotMsg.getAttr2();
		this.attr3 = lotMsg.getAttr3();
		this.attr4 = lotMsg.getAttr4();
		this.attr5 = lotMsg.getAttr5();
		this.attr6 = lotMsg.getAttr6();
		this.attr7 = lotMsg.getAttr7();
		this.attr8 = lotMsg.getAttr8();
		this.tenantId = lotMsg.getTenantId();
		this.crtUserId = lotMsg.getCrtUserId();
	}


	/**
	 * 设置：
	 */
	public void setLmId(String lmId) {
		this.lmId = lmId;
	}
	/**
	 * 获取：
	 */
	public String getLmId() {
		return lmId;
	}
	/**
	 * 设置：开始时间
	 */
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	/**
	 * 获取：开始时间
	 */
	public String getBeginDate() {
		return beginDate;
	}
	/**
	 * 设置：停车时间
	 */
	public void setLotTime(String lotTime) {
		this.lotTime = lotTime;
	}
	/**
	 * 获取：停车时间
	 */
	public String getLotTime() {
		return lotTime;
	}
	/**
	 * 设置：结束时间
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取：结束时间
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * 设置：电话号码
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：电话号码
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置：车牌id
	 */
	public void setPlateId(String plateId) {
		this.plateId = plateId;
	}
	/**
	 * 获取：车牌id
	 */
	public String getPlateId() {
		return plateId;
	}
	/**
	 * 设置：车位id
	 */
	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}
	/**
	 * 获取：车位id
	 */
	public String getSpaceId() {
		return spaceId;
	}
	/**
	 * 设置：停车场编号
	 */
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}
	/**
	 * 获取：停车场编号
	 */
	public String getParkingId() {
		return parkingId;
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
}
