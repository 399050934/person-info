package com.management.personinfo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * (Personinfo)实体类
 *
 * @author makejava
 * @since 2020-07-04 10:50:39
 */
@Entity
@Table(name = "personinfo")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class PersonInfo implements Serializable {
    private static final long serialVersionUID = 391807117141431523L;
    /**
     * 序号
     */
    @Id
    @Basic
    @Column(name = "xuhao")
    private Integer xuhao;

    /**
     * 楼名
     */
    @Column(name = "louming")
    private String louming;

    /**
     * 楼号
     */
    @Column(name = "louhao")
    private String louhao;

    /**
     * 门号
     */
    @Column(name = "menhao")
    private String menhao;
    /**
     * 牌号
     */
    @Column(name = "paihao")
    private String paihao;

    /**
     * 姓名
     */
    @Column(name = "xingming")
    private String xingming;
    /**
     * 性别
     */
    @Column(name = "xingbie")
    private String xingbie;
    /**
     * 身份证号
     */
    @Column(name = "shenfengzhenghao")
    private String shenfengzhenghao;
    /**
     * 年龄
     */
    @Column(name = "nianling")
    private Integer nianling;
    /**
     * 政治面貌
     */
    @Column(name = "zhengzhimianmao")
    private String zhengzhimianmao;
    /**
     * 学历
     */
    @Column(name = "xueli")
    private String xueli;
    /**
     * 联系电话
     */
    @Column(name = "lianxidianhua")
    private Integer lianxidianhua;
    /**
     * 第二联系人电话
     */
    @Column(name = "dierlianxirendianhua")
    private Integer dierlianxirendianhua;
    /**
     * 婚姻状态
     */
    @Column(name = "hunyinzhuangtai")
    private String hunyinzhuangtai;
    /**
     * 户籍地
     */
    @Column(name = "hujidi")
    private String hujidi;
    /**
     * 房东信息
     */
    @Column(name = "fangdongxinxi")
    private Integer fangdongxinxi;
    /**
     * 户主信息
     */
    @Column(name = "huzhuxinxi")
    private String huzhuxinxi;
    /**
     * 迁入时间
     */
    @Column(name = "qianrushijian")
    private Date qianrushijian;
    /**
     * 迁出时间
     */
    @Column(name = "qianchushijian")
    private Date qianchushijian;
    /**
     * 死亡时间
     */
    @Column(name = "siwangshijian")
    private Date siwangshijian;
    /**
     * 注销时间
     */
    @Column(name = "zhuxiaoshijian")
    private Date zhuxiaoshijian;
    /**
     * 特殊标签数
     */
    @Column(name = "teshubiaoqianshu")
    private String teshubiaoqianshu;
    /**
     * 独居老人红D
     */
    @Column(name = "dujulaorend")
    private Integer dujulaorend;
    /**
     * 空巢老人红K
     */
    @Column(name = "kongchaolaorenk")
    private Integer kongchaolaorenk;
    /**
     * 精神障碍红J
     */
    @Column(name = "jingshenzhangaij")
    private Integer jingshenzhangaij;
    /**
     * 留守儿童红L
     */
    @Column(name = "liushouertongl")
    private Integer liushouertongl;
    /**
     * 疫情隔离红Y
     */
    @Column(name = "yiqinggeliy")
    private Integer yiqinggeliy;
    /**
     * 低保人员橙D
     */
    @Column(name = "dibaorenyuand")
    private Integer dibaorenyuand;
    /**
     * 残疾人员橙C
     */
    @Column(name = "canjirenyuanc")
    private Integer canjirenyuanc;
    /**
     * 困难人员橙N
     */
    @Column(name = "kunnanrenyuann")
    private Integer kunnanrenyuann;
    /**
     * 疫情居家橙Y
     */
    @Column(name = "yiqingjujiay")
    private Integer yiqingjujiay;
    /**
     * 上访人员橙F
     */
    @Column(name = "shangfangrenyuanf")
    private Integer shangfangrenyuanf;
    /**
     * 刑释人员黄S
     */
    @Column(name = "xingshirenyuans")
    private Integer xingshirenyuans;
    /**
     * 社矫人员黄J
     */
    @Column(name = "shejiaorenyuanj")
    private Integer shejiaorenyuanj;
    /**
     * 吸毒人员黄D
     */
    @Column(name = "xidurenyuand")
    private Integer xidurenyuand;
    /**
     * 不良少年黄Q
     */
    @Column(name = "buliangshaonianq")
    private Integer buliangshaonianq;
    /**
     * 邪教人员黄X
     */
    @Column(name = "xiejiaorenyuanx")
    private Integer xiejiaorenyuanx;
    /**
     * 80以上黄B
     */
    @Column(name = "bashiyihshangb")
    private Integer bashiyihshangb;
    /**
     * 流动人员蓝L
     */
    @Column(name = "liudongrenyuanl")
    private Integer liudongrenyuanl;
    /**
     * 退役军人蓝T
     */
    @Column(name = "tuiyijunrent")
    private Integer tuiyijunrent;
    /**
     * 育龄妇女蓝F
     */
    @Column(name = "yulingfunvf")
    private Integer yulingfunvf;
    /**
     * 常住地址
     */
    @Column(name = "changzhudizhi")
    private String changzhudizhi;
    /**
     * 所学专业
     */
    @Column(name = "suoxuezhuanye")
    private String suoxuezhuanye;
    /**
     * 身体状态
     */
    @Column(name = "shentizhuangtai")
    private String shentizhuangtai;
    /**
     * 是否在学
     */
    @Column(name = "shofouzaixue")
    private String shofouzaixue;
    /**
     * 服役情况
     */
    @Column(name = "fuyiqingkuang")
    private String fuyiqingkuang;
    /**
     * 个人缴费
     */
    @Column(name = "gerenjiaofei")
    private String gerenjiaofei;
    /**
     * 企业缴费
     */
    @Column(name = "qiyejiaofei")
    private String qiyejiaofei;
    /**
     * 城乡缴费
     */
    @Column(name = "chengxiaojiaofei")
    private String chengxiaojiaofei;
    /**
     * 享受征地或其它政策缴费
     */
    @Column(name = "xiangshouzdorqitajfzc")
    private String xiangshouzdorqitajfzc;
    /**
     * 中断缴费
     */
    @Column(name = "zhongduanjiaofei")
    private String zhongduanjiaofei;
    /**
     * 未参保
     */
    @Column(name = "weicanbao")
    private String weicanbao;
    /**
     * 户口性质
     */
    @Column(name = "hukouxingzhi")
    private String hukouxingzhi;
    /**
     * 是否办理了就失业登记
     */
    @Column(name = "jiushiyedengji")
    private String jiushiyedengji;
    /**
     * 工作经历
     */
    @Column(name = "gongzuojingli")
    private String gongzuojingli;
    /**
     * 技能特长
     */
    @Column(name = "jinengtechang")
    private String jinengtechang;
    /**
     * 技能岗位
     */
    @Column(name = "jinenggangwei")
    private String jinenggangwei;
    /**
     * 岗位经验
     */
    @Column(name = "gangweijingyan")
    private String gangweijingyan;
    /**
     * 务农
     */
    @Column(name = "wunong")
    private String wunong;
    /**
     * 灵活就业
     */
    @Column(name = "linghuojiuye")
    private String linghuojiuye;
    /**
     * 失业
     */
    @Column(name = "shiye")
    private String shiye;
    /**
     * 有就业愿望
     */
    @Column(name = "youjiuyeyuanwang")
    private String youjiuyeyuanwang;
    /**
     * 有创业愿望
     */
    @Column(name = "youchuangyeyuanwang")
    private String youchuangyeyuanwang;
    /**
     * 有培训意向
     */
    @Column(name = "youpeixunyixiang")
    private String youpeixunyixiang;
    /**
     * 在职
     */
    @Column(name = "zaizhi")
    private String zaizhi;
    /**
     * 所在单位
     */
    @Column(name = "suozaidanwei")
    private String suozaidanwei;
    /**
     * 无就业愿望
     */
    @Column(name = "wujiuyeyuanwang")
    private String wujiuyeyuanwang;
    /**
     * 原因
     */
    @Column(name = "yuanyin")
    private String yuanyin;
    /**
     * 联系人
     */
    @Column(name = "lianxiren")
    private String lianxiren;
    /**
     * 联系电话1
     */
    @Column(name = "lianxidianhua1")
    private String lianxidianhua1;
    /**
     * 联系电话2
     */
    @Column(name = "lianxidianhua2")
    private String lianxidianhua2;
    /**
     * 固定电话
     */
    @Column(name = "gudingdianhua")
    private String gudingdianhua;
    /**
     * 求职岗位
     */
    @Column(name = "qiuzhigangwei")
    private String qiuzhigangwei;
    /**
     * 岗位要求
     */
    @Column(name = "gangweiyaoqiu")
    private String gangweiyaoqiu;
    /**
     * 薪资要求
     */
    @Column(name = "xinziyaoqiu")
    private String xinziyaoqiu;
    /**
     * 工作简历开始时间1
     */
    @Column(name = "gongzuojianlikaishishijian1")
    private Date gongzuojianlikaishishijian1;
    /**
     * 工作简历结束时间1
     */
    @Column(name = "gongzuojianlijieshushijian1")
    private Date gongzuojianlijieshushijian1;
    /**
     * 工作简历单位1
     */
    @Column(name = "gongzuojianlidanwei1")
    private String gongzuojianlidanwei1;
    /**
     * 工作简历岗位1
     */
    @Column(name = "gongzuojianligangwei1")
    private String gongzuojianligangwei1;
    /**
     * 工作简历工作描述1
     */
    @Column(name = "gongzuojianlimiaoshu1")
    private String gongzuojianlimiaoshu1;
    /**
     * 工作简历项目经验1
     */
    @Column(name = "gongzuojianlixiangmujiangyan1")
    private String gongzuojianlixiangmujiangyan1;
    /**
     * 工作简历开始时间2
     */
    @Column(name = "gongzuojianlikaishishijian2")
    private Date gongzuojianlikaishishijian2;
    /**
     * 工作简历结束时间2
     */
    @Column(name = "gongzuojianlijieshushijian2")
    private Date gongzuojianlijieshushijian2;
    /**
     * 工作简历单位2
     */
    @Column(name = "gongzuojianlidanwei2")
    private String gongzuojianlidanwei2;
    /**
     * 工作简历岗位2
     */
    @Column(name = "gongzuojianlidgangwei2")
    private String gongzuojianlidgangwei2;
    /**
     * 工作简历工作描述2
     */
    @Column(name = "gongzuojianligongzuomiaoshu2")
    private String gongzuojianligongzuomiaoshu2;
    /**
     * 工作简历项目经验2
     */
    @Column(name = "gongzuojianlixiangmujiangyan2")
    private String gongzuojianlixiangmujiangyan2;
    /**
     * 工作简历开始时间3
     */
    @Column(name = "gongzuojianlikaishishijian3")
    private Date gongzuojianlikaishishijian3;
    /**
     * 工作简历结束时间3
     */
    @Column(name = "gongzuojianlijieshushijian3")
    private Date gongzuojianlijieshushijian3;
    /**
     * 工作简历单位3
     */
    @Column(name = "gongzuojianlidanwei3")
    private String gongzuojianlidanwei3;
    /**
     * 工作简历岗位3
     */
    @Column(name = "gongzuojianlidgangwei3")
    private String gongzuojianlidgangwei3;
    /**
     * 工作简历工作描述3
     */
    @Column(name = "gongzuojianligongzuomiaoshu3")
    private String gongzuojianligongzuomiaoshu3;
    /**
     * 工作简历项目经验3
     */
    @Column(name = "gongzuojianlixiangmujiangyan3")
    private String gongzuojianlixiangmujiangyan3;
    /**
     * 参加过的培训种类
     */
    @Column(name = "canjiaguodepeixunzhonglei")
    private String canjiaguodepeixunzhonglei;
    /**
     * 希望参加培训种类
     */
    @Column(name = "xiwangcanjiapeixunzhonglei")
    private String xiwangcanjiapeixunzhonglei;
    /**
     * 自主创业意向
     */
    @Column(name = "zizhuchuangyeyixiang")
    private String zizhuchuangyeyixiang;
    /**
     * 创业培训
     */
    @Column(name = "chuangyepeixun")
    private String chuangyepeixun;
    /**
     * 创业担保贷款
     */
    @Column(name = "qiyedanbaodaikuan")
    private String qiyedanbaodaikuan;
    /**
     * 岗位补贴
     */
    @Column(name = "gangweibutie")
    private String gangweibutie;
    /**
     * 保险补贴
     */
    @Column(name = "baoxianbutie")
    private String baoxianbutie;
    /**
     * 租房补贴
     */
    @Column(name = "zufangbutie")
    private String zufangbutie;
    /**
     * 其它创业需求
     */
    @Column(name = "qitachuangyexuqiu")
    private String qitachuangyexuqiu;
    @Column(name = "kuozhanshuxing1")
    private String kuozhanshuxing1;
    @Column(name = "kuozhanshuxing2")
    private String kuozhanshuxing2;
    @Column(name = "kuozhanshuxing3")
    private String kuozhanshuxing3;
    @Column(name = "kuozhanshuxing4")
    private String kuozhanshuxing4;
    @Column(name = "kuozhanshuxing5")
    private String kuozhanshuxing5;
    @Column(name = "kuozhanshuxing6")
    private String kuozhanshuxing6;
    @Column(name = "kuozhanshuxing7")
    private String kuozhanshuxing7;
    @Column(name = "kuozhanshuxing8")
    private String kuozhanshuxing8;
    @Column(name = "kuozhanshuxing9")
    private String kuozhanshuxing9;


    public Integer getXuhao() {
        return xuhao;
    }

    public void setXuhao(Integer xuhao) {
        this.xuhao = xuhao;
    }

    public String getLouming() {
        return louming;
    }

    public void setLouming(String louming) {
        this.louming = louming;
    }

    public String getLouhao() {
        return louhao;
    }

    public void setLouhao(String louhao) {
        this.louhao = louhao;
    }

    public String getMenhao() {
        return menhao;
    }

    public void setMenhao(String menhao) {
        this.menhao = menhao;
    }

    public String getPaihao() {
        return paihao;
    }

    public void setPaihao(String paihao) {
        this.paihao = paihao;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public String getShenfengzhenghao() {
        return shenfengzhenghao;
    }

    public void setShenfengzhenghao(String shenfengzhenghao) {
        this.shenfengzhenghao = shenfengzhenghao;
    }

    public Integer getNianling() {
        return nianling;
    }

    public void setNianling(Integer nianling) {
        this.nianling = nianling;
    }

    public String getZhengzhimianmao() {
        return zhengzhimianmao;
    }

    public void setZhengzhimianmao(String zhengzhimianmao) {
        this.zhengzhimianmao = zhengzhimianmao;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    public Integer getLianxidianhua() {
        return lianxidianhua;
    }

    public void setLianxidianhua(Integer lianxidianhua) {
        this.lianxidianhua = lianxidianhua;
    }

    public Integer getDierlianxirendianhua() {
        return dierlianxirendianhua;
    }

    public void setDierlianxirendianhua(Integer dierlianxirendianhua) {
        this.dierlianxirendianhua = dierlianxirendianhua;
    }

    public String getHunyinzhuangtai() {
        return hunyinzhuangtai;
    }

    public void setHunyinzhuangtai(String hunyinzhuangtai) {
        this.hunyinzhuangtai = hunyinzhuangtai;
    }

    public String getHujidi() {
        return hujidi;
    }

    public void setHujidi(String hujidi) {
        this.hujidi = hujidi;
    }

    public Integer getFangdongxinxi() {
        return fangdongxinxi;
    }

    public void setFangdongxinxi(Integer fangdongxinxi) {
        this.fangdongxinxi = fangdongxinxi;
    }

    public String getHuzhuxinxi() {
        return huzhuxinxi;
    }

    public void setHuzhuxinxi(String huzhuxinxi) {
        this.huzhuxinxi = huzhuxinxi;
    }

    public Date getQianrushijian() {
        return qianrushijian;
    }

    public void setQianrushijian(Date qianrushijian) {
        this.qianrushijian = qianrushijian;
    }

    public Date getQianchushijian() {
        return qianchushijian;
    }

    public void setQianchushijian(Date qianchushijian) {
        this.qianchushijian = qianchushijian;
    }

    public Date getSiwangshijian() {
        return siwangshijian;
    }

    public void setSiwangshijian(Date siwangshijian) {
        this.siwangshijian = siwangshijian;
    }

    public Date getZhuxiaoshijian() {
        return zhuxiaoshijian;
    }

    public void setZhuxiaoshijian(Date zhuxiaoshijian) {
        this.zhuxiaoshijian = zhuxiaoshijian;
    }

    public String getTeshubiaoqianshu() {
        return teshubiaoqianshu;
    }

    public void setTeshubiaoqianshu(String teshubiaoqianshu) {
        this.teshubiaoqianshu = teshubiaoqianshu;
    }

    public Integer getDujulaorend() {
        return dujulaorend;
    }

    public void setDujulaorend(Integer dujulaorend) {
        this.dujulaorend = dujulaorend;
    }

    public Integer getKongchaolaorenk() {
        return kongchaolaorenk;
    }

    public void setKongchaolaorenk(Integer kongchaolaorenk) {
        this.kongchaolaorenk = kongchaolaorenk;
    }

    public Integer getJingshenzhangaij() {
        return jingshenzhangaij;
    }

    public void setJingshenzhangaij(Integer jingshenzhangaij) {
        this.jingshenzhangaij = jingshenzhangaij;
    }

    public Integer getLiushouertongl() {
        return liushouertongl;
    }

    public void setLiushouertongl(Integer liushouertongl) {
        this.liushouertongl = liushouertongl;
    }

    public Integer getYiqinggeliy() {
        return yiqinggeliy;
    }

    public void setYiqinggeliy(Integer yiqinggeliy) {
        this.yiqinggeliy = yiqinggeliy;
    }

    public Integer getDibaorenyuand() {
        return dibaorenyuand;
    }

    public void setDibaorenyuand(Integer dibaorenyuand) {
        this.dibaorenyuand = dibaorenyuand;
    }

    public Integer getCanjirenyuanc() {
        return canjirenyuanc;
    }

    public void setCanjirenyuanc(Integer canjirenyuanc) {
        this.canjirenyuanc = canjirenyuanc;
    }

    public Integer getKunnanrenyuann() {
        return kunnanrenyuann;
    }

    public void setKunnanrenyuann(Integer kunnanrenyuann) {
        this.kunnanrenyuann = kunnanrenyuann;
    }

    public Integer getYiqingjujiay() {
        return yiqingjujiay;
    }

    public void setYiqingjujiay(Integer yiqingjujiay) {
        this.yiqingjujiay = yiqingjujiay;
    }

    public Integer getShangfangrenyuanf() {
        return shangfangrenyuanf;
    }

    public void setShangfangrenyuanf(Integer shangfangrenyuanf) {
        this.shangfangrenyuanf = shangfangrenyuanf;
    }

    public Integer getXingshirenyuans() {
        return xingshirenyuans;
    }

    public void setXingshirenyuans(Integer xingshirenyuans) {
        this.xingshirenyuans = xingshirenyuans;
    }

    public Integer getShejiaorenyuanj() {
        return shejiaorenyuanj;
    }

    public void setShejiaorenyuanj(Integer shejiaorenyuanj) {
        this.shejiaorenyuanj = shejiaorenyuanj;
    }

    public Integer getXidurenyuand() {
        return xidurenyuand;
    }

    public void setXidurenyuand(Integer xidurenyuand) {
        this.xidurenyuand = xidurenyuand;
    }

    public Integer getBuliangshaonianq() {
        return buliangshaonianq;
    }

    public void setBuliangshaonianq(Integer buliangshaonianq) {
        this.buliangshaonianq = buliangshaonianq;
    }

    public Integer getXiejiaorenyuanx() {
        return xiejiaorenyuanx;
    }

    public void setXiejiaorenyuanx(Integer xiejiaorenyuanx) {
        this.xiejiaorenyuanx = xiejiaorenyuanx;
    }

    public Integer getBashiyihshangb() {
        return bashiyihshangb;
    }

    public void setBashiyihshangb(Integer bashiyihshangb) {
        this.bashiyihshangb = bashiyihshangb;
    }

    public Integer getLiudongrenyuanl() {
        return liudongrenyuanl;
    }

    public void setLiudongrenyuanl(Integer liudongrenyuanl) {
        this.liudongrenyuanl = liudongrenyuanl;
    }

    public Integer getTuiyijunrent() {
        return tuiyijunrent;
    }

    public void setTuiyijunrent(Integer tuiyijunrent) {
        this.tuiyijunrent = tuiyijunrent;
    }

    public Integer getYulingfunvf() {
        return yulingfunvf;
    }

    public void setYulingfunvf(Integer yulingfunvf) {
        this.yulingfunvf = yulingfunvf;
    }

    public String getChangzhudizhi() {
        return changzhudizhi;
    }

    public void setChangzhudizhi(String changzhudizhi) {
        this.changzhudizhi = changzhudizhi;
    }

    public String getSuoxuezhuanye() {
        return suoxuezhuanye;
    }

    public void setSuoxuezhuanye(String suoxuezhuanye) {
        this.suoxuezhuanye = suoxuezhuanye;
    }

    public String getShentizhuangtai() {
        return shentizhuangtai;
    }

    public void setShentizhuangtai(String shentizhuangtai) {
        this.shentizhuangtai = shentizhuangtai;
    }

    public String getShofouzaixue() {
        return shofouzaixue;
    }

    public void setShofouzaixue(String shofouzaixue) {
        this.shofouzaixue = shofouzaixue;
    }

    public String getFuyiqingkuang() {
        return fuyiqingkuang;
    }

    public void setFuyiqingkuang(String fuyiqingkuang) {
        this.fuyiqingkuang = fuyiqingkuang;
    }

    public String getGerenjiaofei() {
        return gerenjiaofei;
    }

    public void setGerenjiaofei(String gerenjiaofei) {
        this.gerenjiaofei = gerenjiaofei;
    }

    public String getQiyejiaofei() {
        return qiyejiaofei;
    }

    public void setQiyejiaofei(String qiyejiaofei) {
        this.qiyejiaofei = qiyejiaofei;
    }

    public String getChengxiaojiaofei() {
        return chengxiaojiaofei;
    }

    public void setChengxiaojiaofei(String chengxiaojiaofei) {
        this.chengxiaojiaofei = chengxiaojiaofei;
    }

    public String getXiangshouzdorqitajfzc() {
        return xiangshouzdorqitajfzc;
    }

    public void setXiangshouzdorqitajfzc(String xiangshouzdorqitajfzc) {
        this.xiangshouzdorqitajfzc = xiangshouzdorqitajfzc;
    }

    public String getZhongduanjiaofei() {
        return zhongduanjiaofei;
    }

    public void setZhongduanjiaofei(String zhongduanjiaofei) {
        this.zhongduanjiaofei = zhongduanjiaofei;
    }

    public String getWeicanbao() {
        return weicanbao;
    }

    public void setWeicanbao(String weicanbao) {
        this.weicanbao = weicanbao;
    }

    public String getHukouxingzhi() {
        return hukouxingzhi;
    }

    public void setHukouxingzhi(String hukouxingzhi) {
        this.hukouxingzhi = hukouxingzhi;
    }

    public String getJiushiyedengji() {
        return jiushiyedengji;
    }

    public void setJiushiyedengji(String jiushiyedengji) {
        this.jiushiyedengji = jiushiyedengji;
    }

    public String getGongzuojingli() {
        return gongzuojingli;
    }

    public void setGongzuojingli(String gongzuojingli) {
        this.gongzuojingli = gongzuojingli;
    }

    public String getJinengtechang() {
        return jinengtechang;
    }

    public void setJinengtechang(String jinengtechang) {
        this.jinengtechang = jinengtechang;
    }

    public String getJinenggangwei() {
        return jinenggangwei;
    }

    public void setJinenggangwei(String jinenggangwei) {
        this.jinenggangwei = jinenggangwei;
    }

    public String getGangweijingyan() {
        return gangweijingyan;
    }

    public void setGangweijingyan(String gangweijingyan) {
        this.gangweijingyan = gangweijingyan;
    }

    public String getWunong() {
        return wunong;
    }

    public void setWunong(String wunong) {
        this.wunong = wunong;
    }

    public String getLinghuojiuye() {
        return linghuojiuye;
    }

    public void setLinghuojiuye(String linghuojiuye) {
        this.linghuojiuye = linghuojiuye;
    }

    public String getShiye() {
        return shiye;
    }

    public void setShiye(String shiye) {
        this.shiye = shiye;
    }

    public String getYoujiuyeyuanwang() {
        return youjiuyeyuanwang;
    }

    public void setYoujiuyeyuanwang(String youjiuyeyuanwang) {
        this.youjiuyeyuanwang = youjiuyeyuanwang;
    }

    public String getYouchuangyeyuanwang() {
        return youchuangyeyuanwang;
    }

    public void setYouchuangyeyuanwang(String youchuangyeyuanwang) {
        this.youchuangyeyuanwang = youchuangyeyuanwang;
    }

    public String getYoupeixunyixiang() {
        return youpeixunyixiang;
    }

    public void setYoupeixunyixiang(String youpeixunyixiang) {
        this.youpeixunyixiang = youpeixunyixiang;
    }

    public String getZaizhi() {
        return zaizhi;
    }

    public void setZaizhi(String zaizhi) {
        this.zaizhi = zaizhi;
    }

    public String getSuozaidanwei() {
        return suozaidanwei;
    }

    public void setSuozaidanwei(String suozaidanwei) {
        this.suozaidanwei = suozaidanwei;
    }

    public String getWujiuyeyuanwang() {
        return wujiuyeyuanwang;
    }

    public void setWujiuyeyuanwang(String wujiuyeyuanwang) {
        this.wujiuyeyuanwang = wujiuyeyuanwang;
    }

    public String getYuanyin() {
        return yuanyin;
    }

    public void setYuanyin(String yuanyin) {
        this.yuanyin = yuanyin;
    }

    public String getLianxiren() {
        return lianxiren;
    }

    public void setLianxiren(String lianxiren) {
        this.lianxiren = lianxiren;
    }

    public String getLianxidianhua1() {
        return lianxidianhua1;
    }

    public void setLianxidianhua1(String lianxidianhua1) {
        this.lianxidianhua1 = lianxidianhua1;
    }

    public String getLianxidianhua2() {
        return lianxidianhua2;
    }

    public void setLianxidianhua2(String lianxidianhua2) {
        this.lianxidianhua2 = lianxidianhua2;
    }

    public String getGudingdianhua() {
        return gudingdianhua;
    }

    public void setGudingdianhua(String gudingdianhua) {
        this.gudingdianhua = gudingdianhua;
    }

    public String getQiuzhigangwei() {
        return qiuzhigangwei;
    }

    public void setQiuzhigangwei(String qiuzhigangwei) {
        this.qiuzhigangwei = qiuzhigangwei;
    }

    public String getGangweiyaoqiu() {
        return gangweiyaoqiu;
    }

    public void setGangweiyaoqiu(String gangweiyaoqiu) {
        this.gangweiyaoqiu = gangweiyaoqiu;
    }

    public String getXinziyaoqiu() {
        return xinziyaoqiu;
    }

    public void setXinziyaoqiu(String xinziyaoqiu) {
        this.xinziyaoqiu = xinziyaoqiu;
    }

    public Date getGongzuojianlikaishishijian1() {
        return gongzuojianlikaishishijian1;
    }

    public void setGongzuojianlikaishishijian1(Date gongzuojianlikaishishijian1) {
        this.gongzuojianlikaishishijian1 = gongzuojianlikaishishijian1;
    }

    public Date getGongzuojianlijieshushijian1() {
        return gongzuojianlijieshushijian1;
    }

    public void setGongzuojianlijieshushijian1(Date gongzuojianlijieshushijian1) {
        this.gongzuojianlijieshushijian1 = gongzuojianlijieshushijian1;
    }

    public String getGongzuojianlidanwei1() {
        return gongzuojianlidanwei1;
    }

    public void setGongzuojianlidanwei1(String gongzuojianlidanwei1) {
        this.gongzuojianlidanwei1 = gongzuojianlidanwei1;
    }

    public String getGongzuojianligangwei1() {
        return gongzuojianligangwei1;
    }

    public void setGongzuojianligangwei1(String gongzuojianligangwei1) {
        this.gongzuojianligangwei1 = gongzuojianligangwei1;
    }

    public String getGongzuojianlimiaoshu1() {
        return gongzuojianlimiaoshu1;
    }

    public void setGongzuojianlimiaoshu1(String gongzuojianlimiaoshu1) {
        this.gongzuojianlimiaoshu1 = gongzuojianlimiaoshu1;
    }

    public String getGongzuojianlixiangmujiangyan1() {
        return gongzuojianlixiangmujiangyan1;
    }

    public void setGongzuojianlixiangmujiangyan1(String gongzuojianlixiangmujiangyan1) {
        this.gongzuojianlixiangmujiangyan1 = gongzuojianlixiangmujiangyan1;
    }

    public Date getGongzuojianlikaishishijian2() {
        return gongzuojianlikaishishijian2;
    }

    public void setGongzuojianlikaishishijian2(Date gongzuojianlikaishishijian2) {
        this.gongzuojianlikaishishijian2 = gongzuojianlikaishishijian2;
    }

    public Date getGongzuojianlijieshushijian2() {
        return gongzuojianlijieshushijian2;
    }

    public void setGongzuojianlijieshushijian2(Date gongzuojianlijieshushijian2) {
        this.gongzuojianlijieshushijian2 = gongzuojianlijieshushijian2;
    }

    public String getGongzuojianlidanwei2() {
        return gongzuojianlidanwei2;
    }

    public void setGongzuojianlidanwei2(String gongzuojianlidanwei2) {
        this.gongzuojianlidanwei2 = gongzuojianlidanwei2;
    }

    public String getGongzuojianlidgangwei2() {
        return gongzuojianlidgangwei2;
    }

    public void setGongzuojianlidgangwei2(String gongzuojianlidgangwei2) {
        this.gongzuojianlidgangwei2 = gongzuojianlidgangwei2;
    }

    public String getGongzuojianligongzuomiaoshu2() {
        return gongzuojianligongzuomiaoshu2;
    }

    public void setGongzuojianligongzuomiaoshu2(String gongzuojianligongzuomiaoshu2) {
        this.gongzuojianligongzuomiaoshu2 = gongzuojianligongzuomiaoshu2;
    }

    public String getGongzuojianlixiangmujiangyan2() {
        return gongzuojianlixiangmujiangyan2;
    }

    public void setGongzuojianlixiangmujiangyan2(String gongzuojianlixiangmujiangyan2) {
        this.gongzuojianlixiangmujiangyan2 = gongzuojianlixiangmujiangyan2;
    }

    public Date getGongzuojianlikaishishijian3() {
        return gongzuojianlikaishishijian3;
    }

    public void setGongzuojianlikaishishijian3(Date gongzuojianlikaishishijian3) {
        this.gongzuojianlikaishishijian3 = gongzuojianlikaishishijian3;
    }

    public Date getGongzuojianlijieshushijian3() {
        return gongzuojianlijieshushijian3;
    }

    public void setGongzuojianlijieshushijian3(Date gongzuojianlijieshushijian3) {
        this.gongzuojianlijieshushijian3 = gongzuojianlijieshushijian3;
    }

    public String getGongzuojianlidanwei3() {
        return gongzuojianlidanwei3;
    }

    public void setGongzuojianlidanwei3(String gongzuojianlidanwei3) {
        this.gongzuojianlidanwei3 = gongzuojianlidanwei3;
    }

    public String getGongzuojianlidgangwei3() {
        return gongzuojianlidgangwei3;
    }

    public void setGongzuojianlidgangwei3(String gongzuojianlidgangwei3) {
        this.gongzuojianlidgangwei3 = gongzuojianlidgangwei3;
    }

    public String getGongzuojianligongzuomiaoshu3() {
        return gongzuojianligongzuomiaoshu3;
    }

    public void setGongzuojianligongzuomiaoshu3(String gongzuojianligongzuomiaoshu3) {
        this.gongzuojianligongzuomiaoshu3 = gongzuojianligongzuomiaoshu3;
    }

    public String getGongzuojianlixiangmujiangyan3() {
        return gongzuojianlixiangmujiangyan3;
    }

    public void setGongzuojianlixiangmujiangyan3(String gongzuojianlixiangmujiangyan3) {
        this.gongzuojianlixiangmujiangyan3 = gongzuojianlixiangmujiangyan3;
    }

    public String getCanjiaguodepeixunzhonglei() {
        return canjiaguodepeixunzhonglei;
    }

    public void setCanjiaguodepeixunzhonglei(String canjiaguodepeixunzhonglei) {
        this.canjiaguodepeixunzhonglei = canjiaguodepeixunzhonglei;
    }

    public String getXiwangcanjiapeixunzhonglei() {
        return xiwangcanjiapeixunzhonglei;
    }

    public void setXiwangcanjiapeixunzhonglei(String xiwangcanjiapeixunzhonglei) {
        this.xiwangcanjiapeixunzhonglei = xiwangcanjiapeixunzhonglei;
    }

    public String getZizhuchuangyeyixiang() {
        return zizhuchuangyeyixiang;
    }

    public void setZizhuchuangyeyixiang(String zizhuchuangyeyixiang) {
        this.zizhuchuangyeyixiang = zizhuchuangyeyixiang;
    }

    public String getChuangyepeixun() {
        return chuangyepeixun;
    }

    public void setChuangyepeixun(String chuangyepeixun) {
        this.chuangyepeixun = chuangyepeixun;
    }

    public String getQiyedanbaodaikuan() {
        return qiyedanbaodaikuan;
    }

    public void setQiyedanbaodaikuan(String qiyedanbaodaikuan) {
        this.qiyedanbaodaikuan = qiyedanbaodaikuan;
    }

    public String getGangweibutie() {
        return gangweibutie;
    }

    public void setGangweibutie(String gangweibutie) {
        this.gangweibutie = gangweibutie;
    }

    public String getBaoxianbutie() {
        return baoxianbutie;
    }

    public void setBaoxianbutie(String baoxianbutie) {
        this.baoxianbutie = baoxianbutie;
    }

    public String getZufangbutie() {
        return zufangbutie;
    }

    public void setZufangbutie(String zufangbutie) {
        this.zufangbutie = zufangbutie;
    }

    public String getQitachuangyexuqiu() {
        return qitachuangyexuqiu;
    }

    public void setQitachuangyexuqiu(String qitachuangyexuqiu) {
        this.qitachuangyexuqiu = qitachuangyexuqiu;
    }

    public String getKuozhanshuxing1() {
        return kuozhanshuxing1;
    }

    public void setKuozhanshuxing1(String kuozhanshuxing1) {
        this.kuozhanshuxing1 = kuozhanshuxing1;
    }

    public String getKuozhanshuxing2() {
        return kuozhanshuxing2;
    }

    public void setKuozhanshuxing2(String kuozhanshuxing2) {
        this.kuozhanshuxing2 = kuozhanshuxing2;
    }

    public String getKuozhanshuxing3() {
        return kuozhanshuxing3;
    }

    public void setKuozhanshuxing3(String kuozhanshuxing3) {
        this.kuozhanshuxing3 = kuozhanshuxing3;
    }

    public String getKuozhanshuxing4() {
        return kuozhanshuxing4;
    }

    public void setKuozhanshuxing4(String kuozhanshuxing4) {
        this.kuozhanshuxing4 = kuozhanshuxing4;
    }

    public String getKuozhanshuxing5() {
        return kuozhanshuxing5;
    }

    public void setKuozhanshuxing5(String kuozhanshuxing5) {
        this.kuozhanshuxing5 = kuozhanshuxing5;
    }

    public String getKuozhanshuxing6() {
        return kuozhanshuxing6;
    }

    public void setKuozhanshuxing6(String kuozhanshuxing6) {
        this.kuozhanshuxing6 = kuozhanshuxing6;
    }

    public String getKuozhanshuxing7() {
        return kuozhanshuxing7;
    }

    public void setKuozhanshuxing7(String kuozhanshuxing7) {
        this.kuozhanshuxing7 = kuozhanshuxing7;
    }

    public String getKuozhanshuxing8() {
        return kuozhanshuxing8;
    }

    public void setKuozhanshuxing8(String kuozhanshuxing8) {
        this.kuozhanshuxing8 = kuozhanshuxing8;
    }

    public String getKuozhanshuxing9() {
        return kuozhanshuxing9;
    }

    public void setKuozhanshuxing9(String kuozhanshuxing9) {
        this.kuozhanshuxing9 = kuozhanshuxing9;
    }

}