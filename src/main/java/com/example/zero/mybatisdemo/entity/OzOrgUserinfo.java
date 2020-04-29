package com.example.zero.mybatisdemo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ProjectName: [mybatis-demo]
 * Package:     [com.example.zero.mybatisdemo.entity.OzOrgUserinfo]
 * Description: 用户信息
 * CreateDate:  2020/3/30 23:08
 *
 * @author 0.0.0
 * @version 1.0
 */
@Data
public class OzOrgUserinfo implements Serializable {
    /**
     * id
     */
    private long iD;

    /**
     * 组织架构ID
     */
    private long oUINFOID;

    /**
     * 用户姓名
     */
    private String nAME;

    /**
     * 用户姓名拼音
     */
    private String nAMEPINYIN;

    /**
     * 登录名称
     */
    private String lOGINNAME;

    /**
     * 人员称谓
     */
    private String uSERINFOTITLE;

    /**
     * 排序号
     */
    private String oRDERNO;

    /**
     *
     */
    private BigDecimal sTATUS;

    /**
     * 是否为缺省信息
     */
    private String iSDEFAULT;

    /**
     * 用户职务ID
     */
    private long jOBTITLEID;

    /**
     * 职务级别ID
     */
    private long jOBLEVELID;

    /**
     * 手机号码
     */
    private String mOBILE;

    /**
     * 联系电话
     */
    private String tELEPHONE;

    /**
     * 电子邮件
     */
    private String eMAIL;

    /**
     * 家庭电话
     */
    private String hOMENO;

    /**
     * 传真号码
     */
    private String fAXNO;

    /**
     * 联系地址
     */
    private String aDDRESS;

    /**
     * 邮政编码
     */
    private String zIPCODE;

    /**
     * 办公室
     */
    private String oFFICE;

    /**
     * 身份证号码
     */
    private String cARDID;

    /**
     * 性别
     */
    private String gENDER;

    /**
     * 出生日期
     */
    private Date bIRTHDAY;

    /**
     * 参加工作日期
     */
    private Date wORKDATE;

    /**
     * 工作证号码
     */
    private String eMPLOYERID;

    /**
     * 入职日期
     */
    private Date eMPLOYEDDATE;

    /**
     * 备注信息
     */
    private String mEMOS;

    /**
     * 第三方系统的ID
     */
    private String tHIRDID;

    /**
     * 直属上级
     */
    private String sUPERIOR;

    /**
     * 丁丁号
     */
    private String dDH;

    /**
     * 微信号
     */
    private String wEIXINH;

    /**
     * QQ号
     */
    private String qQH;

    /**
     * 津贴
     */
    private String aVATAR;
}
