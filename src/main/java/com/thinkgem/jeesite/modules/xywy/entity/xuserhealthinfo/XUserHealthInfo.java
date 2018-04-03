/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xuserhealthinfo;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户健康信息Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XUserHealthInfo extends DataEntity<XUserHealthInfo> {
	
	private static final long serialVersionUID = 1L;
	private Integer userHealthInfoId;		// user_health_info_id
	private Integer userHealthInfoUserid;		// user_health_info_userid
	private String userHealthInfoZilinengli;		// user_health_info_zilinengli
	private String userHealthInfoRenzhinengli;		// user_health_info_renzhinengli
	private String userHealthInfoShentimailv;		// user_health_info_shentimailv
	private String userHealthInfoShentitiwen;		// user_health_info_shentitiwen
	private String userHealthInfoShengao;		// user_health_info_shengao
	private String userHealthInfoTizhong;		// user_health_info_tizhong
	private String userHealthInfoYaowei;		// user_health_info_yaowei
	private String userHealthInfoTunwei;		// user_health_info_tunwei
	private String userHealthInfoHuxipinlv;		// user_health_info_huxipinlv
	private String userHealthInfoTizhizhishu;		// user_health_info_tizhizhishu
	private String userHealthInfoZuocexueya;		// user_health_info_zuocexueya
	private String userHealthInfoYoucexueya;		// user_health_info_youcexueya
	private String userHealthInfoYinshixiguan;		// user_health_info_yinshixiguan
	private String userHealthInfoDuanlianpinlv;		// user_health_info_duanlianpinlv
	private String userHealthInfoXiyanqingkuang;		// user_health_info_xiyanqingkuang
	private String userHealthInfoYinjiuqingkuang;		// user_health_info_yinjiuqingkuang
	private String userHealthInfoCongyeshijian;		// user_health_info_congyeshijian
	private String userHealthInfoShifouzaizhi;		// user_health_info_shifouzaizhi
	private String userHealthInfoZhiyegongzhong;		// user_health_info_zhiyegongzhong
	private String userHealthInfoZhiyebingqingkuang;		// user_health_info_zhiyebingqingkuang
	private String userHealthInfoFenchenfanghucuoshi;		// user_health_info_fenchenfanghucuoshi
	private String userHealthInfoFangshefanghucuoshi;		// user_health_info_fangshefanghucuoshi
	private String userHealthInfoWuliufanghucuoshi;		// user_health_info_wuliufanghucuoshi
	private String userHealthInfoHuaxuefanghucuoshi;		// user_health_info_huaxuefanghucuoshi
	private String userHealthInfoKouchun;		// user_health_info_kouchun
	private String userHealthInfoChilie;		// user_health_info_chilie
	private String userHealthInfoYanbu;		// user_health_info_yanbu
	private String userHealthInfoTingli;		// user_health_info_tingli
	private String userHealthInfoZuoyanshili;		// user_health_info_zuoyanshili
	private String userHealthInfoYouyanshili;		// user_health_info_youyanshili
	private String userHealthInfoJiaozhengzuoyan;		// user_health_info_jiaozhengzuoyan
	private String userHealthInfoJiaozhengyouyan;		// user_health_info_jiaozhengyouyan
	private String userHealthInfoPifu;		// user_health_info_pifu
	private String userHealthInfoKongmo;		// user_health_info_kongmo
	private String userHealthInfoLinbajie;		// user_health_info_linbajie
	private String userHealthInfoTongzhuangxiong;		// user_health_info_tongzhuangxiong
	private String userHealthInfoLuoyin;		// user_health_info_luoyin
	private String userHealthInfoXinlv;		// user_health_info_xinlv
	private String userHealthInfoXinlvv;		// user_health_info_xinlvv
	private String userHealthInfoZayin;		// user_health_info_zayin
	private String userHealthInfoXiongbuyatong;		// user_health_info_xiongbuyatong
	private String userHealthInfoFububaokuai;		// user_health_info_fububaokuai
	private String userHealthInfoPida;		// user_health_info_pida
	private String userHealthInfoGanda;		// user_health_info_ganda
	private String userHealthInfoFubuyidongzhuoyin;		// user_health_info_fubuyidongzhuoyin
	private String userHealthInfoXiazhishuizhong;		// user_health_info_xiazhishuizhong
	private String userHealthInfoZubeidongmai;		// user_health_info_zubeidongmai
	private String userHealthInfoGangmen;		// user_health_info_gangmen
	private String userHealthInfoRuxian;		// user_health_info_ruxian
	private String userHealthInfoGongjing;		// user_health_info_gongjing
	private String userHealthInfoGongti;		// user_health_info_gongti
	private String userHealthInfoWaiyin;		// user_health_info_waiyin
	private String userHealthInfoYindao;		// user_health_info_yindao
	private String userHealthInfoFujian;		// user_health_info_fujian
	private String userHealthInfoPenqiang;		// user_health_info_penqiang
	private String userHealthInfoQitabeizhu;		// user_health_info_qitabeizhu
	
	public XUserHealthInfo() {
		super();
	}

	public XUserHealthInfo(String id){
		super(id);
	}

	@NotNull(message="user_health_info_id不能为空")
	public Integer getUserHealthInfoId() {
		return userHealthInfoId;
	}

	public void setUserHealthInfoId(Integer userHealthInfoId) {
		this.userHealthInfoId = userHealthInfoId;
	}
	
	public Integer getUserHealthInfoUserid() {
		return userHealthInfoUserid;
	}

	public void setUserHealthInfoUserid(Integer userHealthInfoUserid) {
		this.userHealthInfoUserid = userHealthInfoUserid;
	}
	
	@Length(min=0, max=20, message="user_health_info_zilinengli长度必须介于 0 和 20 之间")
	public String getUserHealthInfoZilinengli() {
		return userHealthInfoZilinengli;
	}

	public void setUserHealthInfoZilinengli(String userHealthInfoZilinengli) {
		this.userHealthInfoZilinengli = userHealthInfoZilinengli;
	}
	
	@Length(min=0, max=20, message="user_health_info_renzhinengli长度必须介于 0 和 20 之间")
	public String getUserHealthInfoRenzhinengli() {
		return userHealthInfoRenzhinengli;
	}

	public void setUserHealthInfoRenzhinengli(String userHealthInfoRenzhinengli) {
		this.userHealthInfoRenzhinengli = userHealthInfoRenzhinengli;
	}
	
	@Length(min=0, max=20, message="user_health_info_shentimailv长度必须介于 0 和 20 之间")
	public String getUserHealthInfoShentimailv() {
		return userHealthInfoShentimailv;
	}

	public void setUserHealthInfoShentimailv(String userHealthInfoShentimailv) {
		this.userHealthInfoShentimailv = userHealthInfoShentimailv;
	}
	
	@Length(min=0, max=20, message="user_health_info_shentitiwen长度必须介于 0 和 20 之间")
	public String getUserHealthInfoShentitiwen() {
		return userHealthInfoShentitiwen;
	}

	public void setUserHealthInfoShentitiwen(String userHealthInfoShentitiwen) {
		this.userHealthInfoShentitiwen = userHealthInfoShentitiwen;
	}
	
	@Length(min=0, max=20, message="user_health_info_shengao长度必须介于 0 和 20 之间")
	public String getUserHealthInfoShengao() {
		return userHealthInfoShengao;
	}

	public void setUserHealthInfoShengao(String userHealthInfoShengao) {
		this.userHealthInfoShengao = userHealthInfoShengao;
	}
	
	@Length(min=0, max=20, message="user_health_info_tizhong长度必须介于 0 和 20 之间")
	public String getUserHealthInfoTizhong() {
		return userHealthInfoTizhong;
	}

	public void setUserHealthInfoTizhong(String userHealthInfoTizhong) {
		this.userHealthInfoTizhong = userHealthInfoTizhong;
	}
	
	@Length(min=0, max=20, message="user_health_info_yaowei长度必须介于 0 和 20 之间")
	public String getUserHealthInfoYaowei() {
		return userHealthInfoYaowei;
	}

	public void setUserHealthInfoYaowei(String userHealthInfoYaowei) {
		this.userHealthInfoYaowei = userHealthInfoYaowei;
	}
	
	@Length(min=0, max=20, message="user_health_info_tunwei长度必须介于 0 和 20 之间")
	public String getUserHealthInfoTunwei() {
		return userHealthInfoTunwei;
	}

	public void setUserHealthInfoTunwei(String userHealthInfoTunwei) {
		this.userHealthInfoTunwei = userHealthInfoTunwei;
	}
	
	@Length(min=0, max=20, message="user_health_info_huxipinlv长度必须介于 0 和 20 之间")
	public String getUserHealthInfoHuxipinlv() {
		return userHealthInfoHuxipinlv;
	}

	public void setUserHealthInfoHuxipinlv(String userHealthInfoHuxipinlv) {
		this.userHealthInfoHuxipinlv = userHealthInfoHuxipinlv;
	}
	
	@Length(min=0, max=20, message="user_health_info_tizhizhishu长度必须介于 0 和 20 之间")
	public String getUserHealthInfoTizhizhishu() {
		return userHealthInfoTizhizhishu;
	}

	public void setUserHealthInfoTizhizhishu(String userHealthInfoTizhizhishu) {
		this.userHealthInfoTizhizhishu = userHealthInfoTizhizhishu;
	}
	
	@Length(min=0, max=20, message="user_health_info_zuocexueya长度必须介于 0 和 20 之间")
	public String getUserHealthInfoZuocexueya() {
		return userHealthInfoZuocexueya;
	}

	public void setUserHealthInfoZuocexueya(String userHealthInfoZuocexueya) {
		this.userHealthInfoZuocexueya = userHealthInfoZuocexueya;
	}
	
	@Length(min=0, max=20, message="user_health_info_youcexueya长度必须介于 0 和 20 之间")
	public String getUserHealthInfoYoucexueya() {
		return userHealthInfoYoucexueya;
	}

	public void setUserHealthInfoYoucexueya(String userHealthInfoYoucexueya) {
		this.userHealthInfoYoucexueya = userHealthInfoYoucexueya;
	}
	
	@Length(min=0, max=20, message="user_health_info_yinshixiguan长度必须介于 0 和 20 之间")
	public String getUserHealthInfoYinshixiguan() {
		return userHealthInfoYinshixiguan;
	}

	public void setUserHealthInfoYinshixiguan(String userHealthInfoYinshixiguan) {
		this.userHealthInfoYinshixiguan = userHealthInfoYinshixiguan;
	}
	
	@Length(min=0, max=20, message="user_health_info_duanlianpinlv长度必须介于 0 和 20 之间")
	public String getUserHealthInfoDuanlianpinlv() {
		return userHealthInfoDuanlianpinlv;
	}

	public void setUserHealthInfoDuanlianpinlv(String userHealthInfoDuanlianpinlv) {
		this.userHealthInfoDuanlianpinlv = userHealthInfoDuanlianpinlv;
	}
	
	@Length(min=0, max=20, message="user_health_info_xiyanqingkuang长度必须介于 0 和 20 之间")
	public String getUserHealthInfoXiyanqingkuang() {
		return userHealthInfoXiyanqingkuang;
	}

	public void setUserHealthInfoXiyanqingkuang(String userHealthInfoXiyanqingkuang) {
		this.userHealthInfoXiyanqingkuang = userHealthInfoXiyanqingkuang;
	}
	
	@Length(min=0, max=20, message="user_health_info_yinjiuqingkuang长度必须介于 0 和 20 之间")
	public String getUserHealthInfoYinjiuqingkuang() {
		return userHealthInfoYinjiuqingkuang;
	}

	public void setUserHealthInfoYinjiuqingkuang(String userHealthInfoYinjiuqingkuang) {
		this.userHealthInfoYinjiuqingkuang = userHealthInfoYinjiuqingkuang;
	}
	
	@Length(min=0, max=20, message="user_health_info_congyeshijian长度必须介于 0 和 20 之间")
	public String getUserHealthInfoCongyeshijian() {
		return userHealthInfoCongyeshijian;
	}

	public void setUserHealthInfoCongyeshijian(String userHealthInfoCongyeshijian) {
		this.userHealthInfoCongyeshijian = userHealthInfoCongyeshijian;
	}
	
	@Length(min=0, max=20, message="user_health_info_shifouzaizhi长度必须介于 0 和 20 之间")
	public String getUserHealthInfoShifouzaizhi() {
		return userHealthInfoShifouzaizhi;
	}

	public void setUserHealthInfoShifouzaizhi(String userHealthInfoShifouzaizhi) {
		this.userHealthInfoShifouzaizhi = userHealthInfoShifouzaizhi;
	}
	
	@Length(min=0, max=20, message="user_health_info_zhiyegongzhong长度必须介于 0 和 20 之间")
	public String getUserHealthInfoZhiyegongzhong() {
		return userHealthInfoZhiyegongzhong;
	}

	public void setUserHealthInfoZhiyegongzhong(String userHealthInfoZhiyegongzhong) {
		this.userHealthInfoZhiyegongzhong = userHealthInfoZhiyegongzhong;
	}
	
	@Length(min=0, max=20, message="user_health_info_zhiyebingqingkuang长度必须介于 0 和 20 之间")
	public String getUserHealthInfoZhiyebingqingkuang() {
		return userHealthInfoZhiyebingqingkuang;
	}

	public void setUserHealthInfoZhiyebingqingkuang(String userHealthInfoZhiyebingqingkuang) {
		this.userHealthInfoZhiyebingqingkuang = userHealthInfoZhiyebingqingkuang;
	}
	
	@Length(min=0, max=20, message="user_health_info_fenchenfanghucuoshi长度必须介于 0 和 20 之间")
	public String getUserHealthInfoFenchenfanghucuoshi() {
		return userHealthInfoFenchenfanghucuoshi;
	}

	public void setUserHealthInfoFenchenfanghucuoshi(String userHealthInfoFenchenfanghucuoshi) {
		this.userHealthInfoFenchenfanghucuoshi = userHealthInfoFenchenfanghucuoshi;
	}
	
	@Length(min=0, max=20, message="user_health_info_fangshefanghucuoshi长度必须介于 0 和 20 之间")
	public String getUserHealthInfoFangshefanghucuoshi() {
		return userHealthInfoFangshefanghucuoshi;
	}

	public void setUserHealthInfoFangshefanghucuoshi(String userHealthInfoFangshefanghucuoshi) {
		this.userHealthInfoFangshefanghucuoshi = userHealthInfoFangshefanghucuoshi;
	}
	
	@Length(min=0, max=20, message="user_health_info_wuliufanghucuoshi长度必须介于 0 和 20 之间")
	public String getUserHealthInfoWuliufanghucuoshi() {
		return userHealthInfoWuliufanghucuoshi;
	}

	public void setUserHealthInfoWuliufanghucuoshi(String userHealthInfoWuliufanghucuoshi) {
		this.userHealthInfoWuliufanghucuoshi = userHealthInfoWuliufanghucuoshi;
	}
	
	@Length(min=0, max=20, message="user_health_info_huaxuefanghucuoshi长度必须介于 0 和 20 之间")
	public String getUserHealthInfoHuaxuefanghucuoshi() {
		return userHealthInfoHuaxuefanghucuoshi;
	}

	public void setUserHealthInfoHuaxuefanghucuoshi(String userHealthInfoHuaxuefanghucuoshi) {
		this.userHealthInfoHuaxuefanghucuoshi = userHealthInfoHuaxuefanghucuoshi;
	}
	
	@Length(min=0, max=20, message="user_health_info_kouchun长度必须介于 0 和 20 之间")
	public String getUserHealthInfoKouchun() {
		return userHealthInfoKouchun;
	}

	public void setUserHealthInfoKouchun(String userHealthInfoKouchun) {
		this.userHealthInfoKouchun = userHealthInfoKouchun;
	}
	
	@Length(min=0, max=20, message="user_health_info_chilie长度必须介于 0 和 20 之间")
	public String getUserHealthInfoChilie() {
		return userHealthInfoChilie;
	}

	public void setUserHealthInfoChilie(String userHealthInfoChilie) {
		this.userHealthInfoChilie = userHealthInfoChilie;
	}
	
	@Length(min=0, max=20, message="user_health_info_yanbu长度必须介于 0 和 20 之间")
	public String getUserHealthInfoYanbu() {
		return userHealthInfoYanbu;
	}

	public void setUserHealthInfoYanbu(String userHealthInfoYanbu) {
		this.userHealthInfoYanbu = userHealthInfoYanbu;
	}
	
	@Length(min=0, max=20, message="user_health_info_tingli长度必须介于 0 和 20 之间")
	public String getUserHealthInfoTingli() {
		return userHealthInfoTingli;
	}

	public void setUserHealthInfoTingli(String userHealthInfoTingli) {
		this.userHealthInfoTingli = userHealthInfoTingli;
	}
	
	@Length(min=0, max=20, message="user_health_info_zuoyanshili长度必须介于 0 和 20 之间")
	public String getUserHealthInfoZuoyanshili() {
		return userHealthInfoZuoyanshili;
	}

	public void setUserHealthInfoZuoyanshili(String userHealthInfoZuoyanshili) {
		this.userHealthInfoZuoyanshili = userHealthInfoZuoyanshili;
	}
	
	@Length(min=0, max=20, message="user_health_info_youyanshili长度必须介于 0 和 20 之间")
	public String getUserHealthInfoYouyanshili() {
		return userHealthInfoYouyanshili;
	}

	public void setUserHealthInfoYouyanshili(String userHealthInfoYouyanshili) {
		this.userHealthInfoYouyanshili = userHealthInfoYouyanshili;
	}
	
	@Length(min=0, max=20, message="user_health_info_jiaozhengzuoyan长度必须介于 0 和 20 之间")
	public String getUserHealthInfoJiaozhengzuoyan() {
		return userHealthInfoJiaozhengzuoyan;
	}

	public void setUserHealthInfoJiaozhengzuoyan(String userHealthInfoJiaozhengzuoyan) {
		this.userHealthInfoJiaozhengzuoyan = userHealthInfoJiaozhengzuoyan;
	}
	
	@Length(min=0, max=20, message="user_health_info_jiaozhengyouyan长度必须介于 0 和 20 之间")
	public String getUserHealthInfoJiaozhengyouyan() {
		return userHealthInfoJiaozhengyouyan;
	}

	public void setUserHealthInfoJiaozhengyouyan(String userHealthInfoJiaozhengyouyan) {
		this.userHealthInfoJiaozhengyouyan = userHealthInfoJiaozhengyouyan;
	}
	
	@Length(min=0, max=20, message="user_health_info_pifu长度必须介于 0 和 20 之间")
	public String getUserHealthInfoPifu() {
		return userHealthInfoPifu;
	}

	public void setUserHealthInfoPifu(String userHealthInfoPifu) {
		this.userHealthInfoPifu = userHealthInfoPifu;
	}
	
	@Length(min=0, max=20, message="user_health_info_kongmo长度必须介于 0 和 20 之间")
	public String getUserHealthInfoKongmo() {
		return userHealthInfoKongmo;
	}

	public void setUserHealthInfoKongmo(String userHealthInfoKongmo) {
		this.userHealthInfoKongmo = userHealthInfoKongmo;
	}
	
	@Length(min=0, max=20, message="user_health_info_linbajie长度必须介于 0 和 20 之间")
	public String getUserHealthInfoLinbajie() {
		return userHealthInfoLinbajie;
	}

	public void setUserHealthInfoLinbajie(String userHealthInfoLinbajie) {
		this.userHealthInfoLinbajie = userHealthInfoLinbajie;
	}
	
	@Length(min=0, max=20, message="user_health_info_tongzhuangxiong长度必须介于 0 和 20 之间")
	public String getUserHealthInfoTongzhuangxiong() {
		return userHealthInfoTongzhuangxiong;
	}

	public void setUserHealthInfoTongzhuangxiong(String userHealthInfoTongzhuangxiong) {
		this.userHealthInfoTongzhuangxiong = userHealthInfoTongzhuangxiong;
	}
	
	@Length(min=0, max=20, message="user_health_info_luoyin长度必须介于 0 和 20 之间")
	public String getUserHealthInfoLuoyin() {
		return userHealthInfoLuoyin;
	}

	public void setUserHealthInfoLuoyin(String userHealthInfoLuoyin) {
		this.userHealthInfoLuoyin = userHealthInfoLuoyin;
	}
	
	@Length(min=0, max=20, message="user_health_info_xinlv长度必须介于 0 和 20 之间")
	public String getUserHealthInfoXinlv() {
		return userHealthInfoXinlv;
	}

	public void setUserHealthInfoXinlv(String userHealthInfoXinlv) {
		this.userHealthInfoXinlv = userHealthInfoXinlv;
	}
	
	@Length(min=0, max=20, message="user_health_info_xinlvv长度必须介于 0 和 20 之间")
	public String getUserHealthInfoXinlvv() {
		return userHealthInfoXinlvv;
	}

	public void setUserHealthInfoXinlvv(String userHealthInfoXinlvv) {
		this.userHealthInfoXinlvv = userHealthInfoXinlvv;
	}
	
	@Length(min=0, max=20, message="user_health_info_zayin长度必须介于 0 和 20 之间")
	public String getUserHealthInfoZayin() {
		return userHealthInfoZayin;
	}

	public void setUserHealthInfoZayin(String userHealthInfoZayin) {
		this.userHealthInfoZayin = userHealthInfoZayin;
	}
	
	@Length(min=0, max=20, message="user_health_info_xiongbuyatong长度必须介于 0 和 20 之间")
	public String getUserHealthInfoXiongbuyatong() {
		return userHealthInfoXiongbuyatong;
	}

	public void setUserHealthInfoXiongbuyatong(String userHealthInfoXiongbuyatong) {
		this.userHealthInfoXiongbuyatong = userHealthInfoXiongbuyatong;
	}
	
	@Length(min=0, max=20, message="user_health_info_fububaokuai长度必须介于 0 和 20 之间")
	public String getUserHealthInfoFububaokuai() {
		return userHealthInfoFububaokuai;
	}

	public void setUserHealthInfoFububaokuai(String userHealthInfoFububaokuai) {
		this.userHealthInfoFububaokuai = userHealthInfoFububaokuai;
	}
	
	@Length(min=0, max=20, message="user_health_info_pida长度必须介于 0 和 20 之间")
	public String getUserHealthInfoPida() {
		return userHealthInfoPida;
	}

	public void setUserHealthInfoPida(String userHealthInfoPida) {
		this.userHealthInfoPida = userHealthInfoPida;
	}
	
	@Length(min=0, max=20, message="user_health_info_ganda长度必须介于 0 和 20 之间")
	public String getUserHealthInfoGanda() {
		return userHealthInfoGanda;
	}

	public void setUserHealthInfoGanda(String userHealthInfoGanda) {
		this.userHealthInfoGanda = userHealthInfoGanda;
	}
	
	@Length(min=0, max=20, message="user_health_info_fubuyidongzhuoyin长度必须介于 0 和 20 之间")
	public String getUserHealthInfoFubuyidongzhuoyin() {
		return userHealthInfoFubuyidongzhuoyin;
	}

	public void setUserHealthInfoFubuyidongzhuoyin(String userHealthInfoFubuyidongzhuoyin) {
		this.userHealthInfoFubuyidongzhuoyin = userHealthInfoFubuyidongzhuoyin;
	}
	
	@Length(min=0, max=20, message="user_health_info_xiazhishuizhong长度必须介于 0 和 20 之间")
	public String getUserHealthInfoXiazhishuizhong() {
		return userHealthInfoXiazhishuizhong;
	}

	public void setUserHealthInfoXiazhishuizhong(String userHealthInfoXiazhishuizhong) {
		this.userHealthInfoXiazhishuizhong = userHealthInfoXiazhishuizhong;
	}
	
	@Length(min=0, max=20, message="user_health_info_zubeidongmai长度必须介于 0 和 20 之间")
	public String getUserHealthInfoZubeidongmai() {
		return userHealthInfoZubeidongmai;
	}

	public void setUserHealthInfoZubeidongmai(String userHealthInfoZubeidongmai) {
		this.userHealthInfoZubeidongmai = userHealthInfoZubeidongmai;
	}
	
	@Length(min=0, max=20, message="user_health_info_gangmen长度必须介于 0 和 20 之间")
	public String getUserHealthInfoGangmen() {
		return userHealthInfoGangmen;
	}

	public void setUserHealthInfoGangmen(String userHealthInfoGangmen) {
		this.userHealthInfoGangmen = userHealthInfoGangmen;
	}
	
	@Length(min=0, max=20, message="user_health_info_ruxian长度必须介于 0 和 20 之间")
	public String getUserHealthInfoRuxian() {
		return userHealthInfoRuxian;
	}

	public void setUserHealthInfoRuxian(String userHealthInfoRuxian) {
		this.userHealthInfoRuxian = userHealthInfoRuxian;
	}
	
	@Length(min=0, max=20, message="user_health_info_gongjing长度必须介于 0 和 20 之间")
	public String getUserHealthInfoGongjing() {
		return userHealthInfoGongjing;
	}

	public void setUserHealthInfoGongjing(String userHealthInfoGongjing) {
		this.userHealthInfoGongjing = userHealthInfoGongjing;
	}
	
	@Length(min=0, max=20, message="user_health_info_gongti长度必须介于 0 和 20 之间")
	public String getUserHealthInfoGongti() {
		return userHealthInfoGongti;
	}

	public void setUserHealthInfoGongti(String userHealthInfoGongti) {
		this.userHealthInfoGongti = userHealthInfoGongti;
	}
	
	@Length(min=0, max=20, message="user_health_info_waiyin长度必须介于 0 和 20 之间")
	public String getUserHealthInfoWaiyin() {
		return userHealthInfoWaiyin;
	}

	public void setUserHealthInfoWaiyin(String userHealthInfoWaiyin) {
		this.userHealthInfoWaiyin = userHealthInfoWaiyin;
	}
	
	@Length(min=0, max=20, message="user_health_info_yindao长度必须介于 0 和 20 之间")
	public String getUserHealthInfoYindao() {
		return userHealthInfoYindao;
	}

	public void setUserHealthInfoYindao(String userHealthInfoYindao) {
		this.userHealthInfoYindao = userHealthInfoYindao;
	}
	
	@Length(min=0, max=20, message="user_health_info_fujian长度必须介于 0 和 20 之间")
	public String getUserHealthInfoFujian() {
		return userHealthInfoFujian;
	}

	public void setUserHealthInfoFujian(String userHealthInfoFujian) {
		this.userHealthInfoFujian = userHealthInfoFujian;
	}
	
	@Length(min=0, max=20, message="user_health_info_penqiang长度必须介于 0 和 20 之间")
	public String getUserHealthInfoPenqiang() {
		return userHealthInfoPenqiang;
	}

	public void setUserHealthInfoPenqiang(String userHealthInfoPenqiang) {
		this.userHealthInfoPenqiang = userHealthInfoPenqiang;
	}
	
	@Length(min=0, max=500, message="user_health_info_qitabeizhu长度必须介于 0 和 500 之间")
	public String getUserHealthInfoQitabeizhu() {
		return userHealthInfoQitabeizhu;
	}

	public void setUserHealthInfoQitabeizhu(String userHealthInfoQitabeizhu) {
		this.userHealthInfoQitabeizhu = userHealthInfoQitabeizhu;
	}
	
}