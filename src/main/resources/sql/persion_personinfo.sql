-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: persion
-- ------------------------------------------------------
-- Server version	5.7.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `personinfo`
--

DROP TABLE IF EXISTS `personinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personinfo` (
  `xuhao` int(11) NOT NULL,
  `louming` varchar(45) DEFAULT NULL,
  `louhao` varchar(50) DEFAULT NULL COMMENT '楼号',
  `menhao` varchar(50) DEFAULT NULL COMMENT '门号',
  `paihao` varchar(50) DEFAULT NULL COMMENT '牌号',
  `xingming` varchar(50) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(10) DEFAULT NULL COMMENT '性别',
  `shenfengzhenghao` varchar(50) DEFAULT NULL COMMENT '身份证号',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `zhengzhimianmao` varchar(10) DEFAULT NULL COMMENT '政治面貌',
  `xueli` varchar(50) DEFAULT NULL COMMENT '学历',
  `lianxidianhua` int(12) DEFAULT NULL COMMENT '联系电话',
  `dierlianxirendianhua` int(12) DEFAULT NULL COMMENT '第二联系人电话',
  `hunyinzhuangtai` varchar(10) DEFAULT NULL COMMENT '婚姻状态',
  `hujidi` varchar(50) DEFAULT NULL COMMENT '户籍地',
  `fangdongxinxi` int(11) DEFAULT NULL COMMENT '房东信息',
  `huzhuxinxi` varchar(10) DEFAULT NULL COMMENT '户主信息',
  `qianrushijian` datetime DEFAULT NULL COMMENT '迁入时间',
  `qianchushijian` datetime DEFAULT NULL COMMENT '迁出时间',
  `siwangshijian` datetime DEFAULT NULL COMMENT '死亡时间',
  `zhuxiaoshijian` datetime DEFAULT NULL COMMENT '注销时间',
  `teshubiaoqianshu` varchar(50) DEFAULT NULL COMMENT '特殊标签数',
  `dujulaorenD` int(11) DEFAULT NULL COMMENT '独居老人红D',
  `kongchaolaorenK` int(11) DEFAULT NULL COMMENT '空巢老人红K',
  `jingshenzhangaiJ` int(11) DEFAULT NULL COMMENT '精神障碍红J',
  `liushouertongL` int(11) DEFAULT NULL COMMENT '留守儿童红L',
  `yiqinggeliY` int(11) DEFAULT NULL COMMENT '疫情隔离红Y',
  `dibaorenyuanD` int(11) DEFAULT NULL COMMENT '低保人员橙D',
  `canjirenyuanC` int(11) DEFAULT NULL COMMENT '残疾人员橙C',
  `kunnanrenyuanN` int(11) DEFAULT NULL COMMENT '困难人员橙N',
  `yiqingjujiaY` int(11) DEFAULT NULL COMMENT '疫情居家橙Y',
  `shangfangrenyuanF` int(11) DEFAULT NULL COMMENT '上访人员橙F',
  `xingshirenyuanS` int(11) DEFAULT NULL COMMENT '刑释人员黄S',
  `shejiaorenyuanJ` int(11) DEFAULT NULL COMMENT '社矫人员黄J',
  `xidurenyuanD` int(11) DEFAULT NULL COMMENT '吸毒人员黄D',
  `buliangshaonianQ` int(11) DEFAULT NULL COMMENT '不良少年黄Q',
  `xiejiaorenyuanX` int(11) DEFAULT NULL COMMENT '邪教人员黄X',
  `bashiyihshangB` int(11) DEFAULT NULL COMMENT '80以上黄B',
  `liudongrenyuanL` int(11) DEFAULT NULL COMMENT '流动人员蓝L',
  `tuiyijunrenT` int(11) DEFAULT NULL COMMENT '退役军人蓝T',
  `yulingfunvF` int(11) DEFAULT NULL COMMENT '育龄妇女蓝F',
  `changzhudizhi` varchar(250) DEFAULT NULL COMMENT '常住地址',
  `suoxuezhuanye` varchar(250) DEFAULT NULL COMMENT '所学专业',
  `shentizhuangtai` varchar(50) DEFAULT NULL COMMENT '身体状态',
  `shofouzaixue` varchar(50) DEFAULT NULL COMMENT '是否在学',
  `fuyiqingkuang` varchar(50) DEFAULT NULL COMMENT '服役情况',
  `gerenjiaofei` varchar(50) DEFAULT NULL COMMENT '个人缴费',
  `qiyejiaofei` varchar(50) DEFAULT NULL COMMENT '企业缴费',
  `chengxiaojiaofei` varchar(50) DEFAULT NULL COMMENT '城乡缴费',
  `xiangshouzdorqitajfzc` varchar(50) DEFAULT NULL COMMENT '享受征地或其它政策缴费',
  `zhongduanjiaofei` varchar(50) DEFAULT NULL COMMENT '中断缴费',
  `weicanbao` varchar(50) DEFAULT NULL COMMENT '未参保',
  `hukouxingzhi` varchar(200) DEFAULT NULL,
  `jiushiyedengji` varchar(50) DEFAULT NULL COMMENT '是否办理了就失业登记',
  `gongzuojingli` varchar(250) DEFAULT NULL COMMENT '工作经历',
  `jinengtechang` varchar(250) DEFAULT NULL COMMENT '技能特长',
  `jinenggangwei` varchar(50) DEFAULT NULL COMMENT '技能岗位',
  `gangweijingyan` varchar(50) DEFAULT NULL COMMENT '岗位经验',
  `wunong` varchar(50) DEFAULT NULL COMMENT '务农',
  `linghuojiuye` varchar(50) DEFAULT NULL COMMENT '灵活就业',
  `shiye` varchar(250) DEFAULT NULL COMMENT '失业',
  `youjiuyeyuanwang` varchar(250) DEFAULT NULL COMMENT '有就业愿望',
  `youchuangyeyuanwang` varchar(50) DEFAULT NULL COMMENT '有创业愿望',
  `youpeixunyixiang` varchar(50) DEFAULT NULL COMMENT '有培训意向',
  `zaizhi` varchar(50) DEFAULT NULL COMMENT '在职',
  `suozaidanwei` varchar(50) DEFAULT NULL COMMENT '所在单位',
  `wujiuyeyuanwang` varchar(250) DEFAULT NULL COMMENT '无就业愿望',
  `yuanyin` varchar(250) DEFAULT NULL COMMENT '原因',
  `lianxiren` varchar(50) DEFAULT NULL COMMENT '联系人',
  `lianxidianhua1` varchar(50) DEFAULT NULL COMMENT '联系电话1',
  `lianxidianhua2` varchar(50) DEFAULT NULL COMMENT '联系电话2',
  `gudingdianhua` varchar(50) DEFAULT NULL COMMENT '固定电话',
  `qiuzhigangwei` varchar(250) DEFAULT NULL COMMENT '求职岗位',
  `gangweiyaoqiu` varchar(250) DEFAULT NULL COMMENT '岗位要求',
  `xinziyaoqiu` varchar(50) DEFAULT NULL COMMENT '薪资要求',
  `gongzuojianlikaishishijian1` datetime DEFAULT NULL COMMENT '工作简历开始时间1',
  `gongzuojianlijieshushijian1` datetime DEFAULT NULL COMMENT '工作简历结束时间1',
  `gongzuojianlidanwei1` varchar(50) DEFAULT NULL COMMENT '工作简历单位1',
  `gongzuojianligangwei1` varchar(250) DEFAULT NULL COMMENT '工作简历岗位1',
  `gongzuojianlimiaoshu1` varchar(250) DEFAULT NULL COMMENT '工作简历工作描述1',
  `gongzuojianlixiangmujiangyan1` varchar(250) DEFAULT NULL COMMENT '工作简历项目经验1',
  `gongzuojianlikaishishijian2` datetime DEFAULT NULL COMMENT '工作简历开始时间2',
  `gongzuojianlijieshushijian2` datetime DEFAULT NULL COMMENT '工作简历结束时间2',
  `gongzuojianlidanwei2` varchar(250) DEFAULT NULL COMMENT '工作简历单位2',
  `gongzuojianlidgangwei2` varchar(250) DEFAULT NULL COMMENT '工作简历岗位2',
  `gongzuojianligongzuomiaoshu2` varchar(250) DEFAULT NULL COMMENT '工作简历工作描述2',
  `gongzuojianlixiangmujiangyan2` varchar(250) DEFAULT NULL COMMENT '工作简历项目经验2',
  `gongzuojianlikaishishijian3` datetime DEFAULT NULL COMMENT '工作简历开始时间3',
  `gongzuojianlijieshushijian3` datetime DEFAULT NULL COMMENT '工作简历结束时间3',
  `gongzuojianlidanwei3` varchar(250) DEFAULT NULL COMMENT '工作简历单位3',
  `gongzuojianlidgangwei3` varchar(250) DEFAULT NULL COMMENT '工作简历岗位3',
  `gongzuojianligongzuomiaoshu3` varchar(250) DEFAULT NULL COMMENT '工作简历工作描述3',
  `gongzuojianlixiangmujiangyan3` varchar(250) DEFAULT NULL COMMENT '工作简历项目经验3',
  `canjiaguodepeixunzhonglei` varchar(250) DEFAULT NULL COMMENT '参加过的培训种类',
  `xiwangcanjiapeixunzhonglei` varchar(250) DEFAULT NULL COMMENT '希望参加培训种类',
  `zizhuchuangyeyixiang` varchar(50) DEFAULT NULL COMMENT '自主创业意向',
  `chuangyepeixun` varchar(50) DEFAULT NULL COMMENT '创业培训',
  `qiyedanbaodaikuan` varchar(50) DEFAULT NULL COMMENT '创业担保贷款',
  `gangweibutie` varchar(50) DEFAULT NULL COMMENT '岗位补贴',
  `baoxianbutie` varchar(250) DEFAULT NULL COMMENT '保险补贴',
  `zufangbutie` varchar(250) DEFAULT NULL COMMENT '租房补贴',
  `qitachuangyexuqiu` varchar(50) DEFAULT NULL COMMENT '其它创业需求',
  `kuozhanshuxing1` varchar(200) DEFAULT NULL,
  `kuozhanshuxing2` varchar(200) DEFAULT NULL,
  `kuozhanshuxing3` varchar(200) DEFAULT NULL,
  `kuozhanshuxing4` varchar(200) DEFAULT NULL,
  `kuozhanshuxing5` varchar(200) DEFAULT NULL,
  `kuozhanshuxing6` varchar(200) DEFAULT NULL,
  `kuozhanshuxing7` varchar(200) DEFAULT NULL,
  `kuozhanshuxing8` varchar(200) DEFAULT NULL,
  `kuozhanshuxing9` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`xuhao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personinfo`
--

LOCK TABLES `personinfo` WRITE;
/*!40000 ALTER TABLE `personinfo` DISABLE KEYS */;
INSERT INTO `personinfo` VALUES (1,'谊龙花园','1','1','101','林树','女','120223199801261213',23,'群众','高中',12,11,'11','天津',NULL,'张三','2020-01-01 00:00:00','2020-01-01 00:00:00','2020-01-01 00:00:00','2020-01-01 00:00:00',NULL,1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,1,1,1,'天津市','软件工程','健康','否','服役','是','是','是','是','是','是','务农','否',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `personinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-07 14:00:47
