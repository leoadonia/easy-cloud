package com.dq.easy.cloud.pay.model.payment.pojo.dto;

import java.math.BigDecimal;

import com.dq.easy.cloud.pay.model.base.constant.DqCurType;
import com.dq.easy.cloud.pay.model.base.pojo.dto.DqBasePayDTO;
import com.dq.easy.cloud.pay.model.payment.config.dto.DqPayConfigStorageInf;
import com.dq.easy.cloud.pay.model.payment.utils.DqPayUtils;
import com.dq.easy.cloud.pay.model.transaction.inf.DqTransactionType;

/**
 * 
 * <p>
 * 支付订单信息
 * </p>
 *
 * @author daiqi 创建时间 2018年2月23日 下午3:03:43
 */
public class DqPayOrderDTO extends DqBasePayDTO{
	// 商品名称
	private String subject;
	// 商品描述
	private String body;
	// 价格
	private BigDecimal price;
	// 商户订单号
	private String outTradeNo;
	// 银行卡类型
	private String bankType;
	// 设备信息，
	private String deviceInfo;
	// 支付创建ip
	private String spbillCreateIp;
	// 付款条码串 与设备号类似？？？
	private String authCode;
	// WAP支付链接
	private String wapUrl;
	// WAP支付网页名称
	private String wapName;
	// 微信会员唯一标识
	private String openid;
	// 交易类型
	private DqTransactionType transactionType;
	// 支付币种
	private DqCurType dqCurType;

	public DqPayOrderDTO() {
		
	}

	@Override
	public void buildSignParamters(DqPayConfigStorageInf dqPayConfigStorage, DqTransactionType dqTransactionType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void putSignSignData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void buildSign(DqPayConfigStorageInf dqPayConfigStorage) {
		// TODO Auto-generated method stub
		
	}

	public DqPayOrderDTO(String subject, String body, BigDecimal price, String outTradeNo,
			DqTransactionType transactionType) {
		this.subject = subject;
		this.body = body;
		this.price = price;
		this.outTradeNo = outTradeNo;
		this.transactionType = transactionType;
	}

	public DqPayOrderDTO(String subject, String body, BigDecimal price, String outTradeNo) {
		this.subject = subject;
		this.body = body;
		this.price = price;
		this.outTradeNo = outTradeNo;
	}

	public static DqPayOrderDTO newInstance(String subject, String body, BigDecimal price, String outTradeNo){
		return new DqPayOrderDTO(subject, body, price, outTradeNo);
	}
	
	public DqPayOrderDTO buildTransactionType(DqTransactionType transactionType){
		this.transactionType = transactionType;
		return this;
	}
	
	public int getPriceOfCent(){
		return DqPayUtils.yuanToCent(price);
	}
	
	public DqCurType getDqCurType() {
		return dqCurType;
	}

	public void setDqCurType(DqCurType dqCurType) {
		this.dqCurType = dqCurType;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 获取商户订单号
	 * 
	 * @return 商户订单号
	 */
	public String getOutTradeNo() {
		return outTradeNo;
	}

	/**
	 * 设置商户订单号
	 * 
	 * @param outTradeNo
	 *            商户订单号
	 */
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public DqTransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(DqTransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getSpbillCreateIp() {
		return spbillCreateIp;
	}

	public void setSpbillCreateIp(String spbillCreateIp) {
		this.spbillCreateIp = spbillCreateIp;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getWapUrl() {
		return wapUrl;
	}

	public void setWapUrl(String wapUrl) {
		this.wapUrl = wapUrl;
	}

	public String getWapName() {
		return wapName;
	}

	public void setWapName(String wapName) {
		this.wapName = wapName;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	@Override
	public String toString() {
		return "PayOrder{" + "subject='" + subject + '\'' + ", body='" + body + '\'' + ", price=" + price
				+ ", outTradeNo='" + outTradeNo + '\'' + ", bankType='" + bankType + '\'' + ", deviceInfo='"
				+ deviceInfo + '\'' + ", spbillCreateIp='" + spbillCreateIp + '\'' + ", authCode='" + authCode + '\''
				+ ", wapUrl='" + wapUrl + '\'' + ", wapName='" + wapName + '\'' + ", openid='" + openid + '\''
				+ ", transactionType=" + transactionType + ", dqCurType=" + dqCurType + '}';
	}

	
}
