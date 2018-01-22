# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-01-22 08:25:51
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "computer_problems"
#

CREATE TABLE `computer_problems` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `userId` varchar(255) DEFAULT NULL COMMENT '工号',
  `name` varchar(255) DEFAULT NULL COMMENT '申报人',
  `dept` varchar(255) DEFAULT NULL COMMENT '部门',
  `departCode` varchar(255) DEFAULT NULL COMMENT '部门编码',
  `tel` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `detail` varchar(255) DEFAULT NULL COMMENT '问题详情',
  `img` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `flag` int(11) DEFAULT NULL COMMENT '状态',
  `type` int(11) DEFAULT NULL COMMENT '类别',
  `type_secondary` int(3) DEFAULT NULL COMMENT '二级类别',
  `leader` varchar(255) DEFAULT NULL COMMENT '负责人',
  `leader_name` varchar(255) DEFAULT NULL COMMENT '负责人姓名',
  `reback` varchar(255) DEFAULT NULL COMMENT '回复',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `done_time` varchar(255) DEFAULT NULL COMMENT '完成时间',
  `feedback_content_1` varchar(255) DEFAULT NULL COMMENT '故障反馈内容_1',
  `feedback_id_1` char(5) DEFAULT NULL COMMENT '故障反馈人ID_1',
  `feedback_name_1` varchar(20) DEFAULT NULL COMMENT '故障反馈人姓名_1',
  `feedback_content_2` varchar(255) DEFAULT NULL COMMENT '故障反馈内容_2',
  `feedback_id_2` char(5) DEFAULT NULL COMMENT '故障反馈人ID_2',
  `feedback_name_2` varchar(20) DEFAULT NULL COMMENT '故障反馈人姓名_2',
  `feedback_content_3` varchar(255) DEFAULT NULL COMMENT '故障反馈内容_3',
  `feedback_id_3` char(5) DEFAULT NULL COMMENT '故障反馈人ID_3',
  `feedback_name_3` varchar(20) DEFAULT NULL COMMENT '故障反馈人姓名_3',
  `feedback_content_4` varchar(255) DEFAULT NULL COMMENT '故障反馈内容_4',
  `feedback_id_4` char(5) DEFAULT NULL COMMENT '故障反馈人ID_4',
  `feedback_name_4` varchar(20) DEFAULT NULL COMMENT '故障反馈人姓名_4',
  `feedback_content_5` varchar(255) DEFAULT NULL COMMENT '故障反馈内容_5',
  `feedback_id_5` char(5) DEFAULT NULL COMMENT '故障反馈人ID_5',
  `feedback_name_5` varchar(20) DEFAULT NULL COMMENT '故障反馈人姓名_5',
  `fault_urgent` int(2) DEFAULT '0' COMMENT '紧急标识位',
  `feedback_time_1` varchar(255) DEFAULT NULL COMMENT '故障反馈时间1',
  `feedback_time_2` varchar(255) DEFAULT NULL COMMENT '故障反馈时间2',
  `feedback_time_3` varchar(255) DEFAULT NULL COMMENT '故障反馈时间3',
  `feedback_time_4` varchar(255) DEFAULT NULL COMMENT '故障反馈时间4',
  `feedback_time_5` varchar(255) DEFAULT NULL COMMENT '故障反馈时间5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=229 DEFAULT CHARSET=utf8;

#
# Structure for table "computer_problems_type"
#

CREATE TABLE `computer_problems_type` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(100) DEFAULT '' COMMENT '故障类型名称',
  `type_code` varchar(10) DEFAULT '' COMMENT '故障类型编码',
  `type_code2` varchar(10) DEFAULT NULL COMMENT '故障类型编码2（备用字段）',
  `type_code3` varchar(255) DEFAULT NULL COMMENT '故障类型编码3（备用字段）',
  `type_note` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

#
# Structure for table "engine_room_inspection"
#

CREATE TABLE `engine_room_inspection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` varchar(255) DEFAULT NULL,
  `emr` int(11) DEFAULT NULL,
  `his` int(11) DEFAULT NULL,
  `lis` int(11) DEFAULT NULL,
  `pacs` int(11) DEFAULT NULL,
  `xny` int(11) DEFAULT NULL,
  `oa` int(11) DEFAULT NULL,
  `yb` int(11) DEFAULT NULL,
  `qyw` int(11) DEFAULT NULL,
  `yy` int(11) DEFAULT NULL,
  `hiscc` int(11) DEFAULT NULL,
  `jk` int(11) DEFAULT NULL,
  `hx` int(11) DEFAULT NULL,
  `hj` int(11) DEFAULT NULL,
  `aqsb` int(11) DEFAULT NULL,
  `ups` int(11) DEFAULT NULL,
  `qtmh` int(11) DEFAULT NULL,
  `kt` int(11) DEFAULT NULL,
  `ycyy` varchar(255) DEFAULT NULL,
  `examiner` varchar(255) DEFAULT NULL,
  `userId` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `flag` int(2) DEFAULT '0' COMMENT '标志位，0为未审核，1为审核未通过，2为通过',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

#
# Structure for table "external_access"
#

CREATE TABLE `external_access` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cp_link_id` int(11) NOT NULL DEFAULT '0' COMMENT '电脑故障关联ID',
  `access_type` int(2) unsigned DEFAULT NULL COMMENT '申请类型',
  `dept_code` varchar(20) DEFAULT NULL COMMENT '申请部门编码',
  `dept` varchar(40) DEFAULT NULL COMMENT '申请部门名称',
  `access_address` varchar(255) DEFAULT NULL COMMENT '申请接入地址/工作内容',
  `contact_name` varchar(20) DEFAULT NULL COMMENT '联系人',
  `contact_tel` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `cable_type` int(2) unsigned DEFAULT NULL COMMENT '申请接入线路',
  `way_type` int(2) unsigned DEFAULT NULL COMMENT '申请接入方式',
  `lan_points` int(3) unsigned DEFAULT NULL COMMENT '局域网接入点数',
  `lan_equipment` varchar(80) DEFAULT NULL COMMENT '接入设备型号',
  `dedicated_room` int(2) unsigned DEFAULT NULL COMMENT '专用机房',
  `air_conditioning` int(2) unsigned DEFAULT NULL COMMENT '空调',
  `ups` int(2) unsigned DEFAULT NULL COMMENT 'UPS',
  `wiring` int(2) unsigned DEFAULT NULL COMMENT '布线系统',
  `open_website` varchar(255) DEFAULT NULL COMMENT '开通网站',
  `communication_tools` varchar(255) DEFAULT NULL COMMENT '开通通讯工具',
  `dept_principal` varchar(20) DEFAULT NULL COMMENT '科室负责人',
  `principal_tel` varchar(20) DEFAULT NULL COMMENT '负责人电话',
  `opinion` varchar(255) DEFAULT NULL COMMENT '信息科审核意见',
  `chief_dean` varchar(20) DEFAULT NULL COMMENT '主管院长',
  `other_1` varchar(255) DEFAULT NULL COMMENT '预留字段1',
  `other_2` varchar(255) DEFAULT NULL COMMENT '预留字段2',
  `other_3` varchar(255) DEFAULT NULL COMMENT '预留字段3',
  PRIMARY KEY (`id`),
  KEY `link_cp_id` (`cp_link_id`) COMMENT '故障关联索引',
  CONSTRAINT `link_cp_id` FOREIGN KEY (`cp_link_id`) REFERENCES `computer_problems` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Structure for table "intranet_access"
#

CREATE TABLE `intranet_access` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cp_link_id` int(11) NOT NULL DEFAULT '0' COMMENT '电脑故障关联ID',
  `access_type` int(2) unsigned DEFAULT NULL COMMENT '申请类型',
  `dept_code` varchar(20) DEFAULT NULL COMMENT '申请部门编码',
  `dept` varchar(40) DEFAULT NULL COMMENT '申请部门名称',
  `access_address` varchar(80) DEFAULT NULL COMMENT '申请接入地址',
  `contact_name` varchar(20) DEFAULT NULL COMMENT '联系人',
  `contact_tel` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `cable_type` int(2) unsigned DEFAULT NULL COMMENT '申请接入线路',
  `way_type` int(2) unsigned DEFAULT NULL COMMENT '申请接入方式',
  `lan_points` int(3) unsigned DEFAULT NULL COMMENT '局域网接入点数',
  `lan_equipment` varchar(80) DEFAULT NULL COMMENT '接入设备型号',
  `dedicated_room` int(2) unsigned DEFAULT NULL COMMENT '专用机房',
  `air_conditioning` int(2) unsigned DEFAULT NULL COMMENT '空调',
  `ups` int(2) unsigned DEFAULT NULL COMMENT 'UPS',
  `wiring` int(2) unsigned DEFAULT NULL COMMENT '布线系统',
  `cabinet` int(2) unsigned DEFAULT NULL COMMENT '机柜',
  `threaded_pipe` int(2) unsigned DEFAULT NULL COMMENT '穿线管道',
  `dept_principal` varchar(20) DEFAULT NULL COMMENT '科室负责人',
  `principal_tel` varchar(20) DEFAULT NULL COMMENT '负责人电话',
  `opinion` varchar(255) DEFAULT NULL COMMENT '信息科审核意见',
  `chief_dean` varchar(20) DEFAULT NULL COMMENT '主管院长',
  `other_1` varchar(255) DEFAULT NULL COMMENT '预留字段1',
  `other_2` varchar(255) DEFAULT NULL COMMENT '预留字段2',
  `other_3` varchar(255) DEFAULT NULL COMMENT '预留字段3',
  PRIMARY KEY (`id`),
  KEY `link_cp_id` (`cp_link_id`) COMMENT '故障关联索引',
  CONSTRAINT `link_cp_id_2` FOREIGN KEY (`cp_link_id`) REFERENCES `computer_problems` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Structure for table "material_application"
#

CREATE TABLE `material_application` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(255) DEFAULT NULL COMMENT '工号',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `dept` varchar(255) DEFAULT NULL COMMENT '部门',
  `departCode` varchar(255) DEFAULT NULL COMMENT '部门编码',
  `number` int(11) DEFAULT NULL COMMENT '数量',
  `brand` varchar(255) DEFAULT NULL COMMENT '品牌',
  `model` varchar(255) DEFAULT NULL COMMENT '型号',
  `judge` int(11) DEFAULT NULL COMMENT '单价',
  `total` int(11) DEFAULT NULL COMMENT '总价',
  `use_date` varchar(255) DEFAULT NULL COMMENT '安装时间',
  `applicant` varchar(255) DEFAULT NULL COMMENT '申请人',
  `reason` varchar(255) DEFAULT NULL COMMENT '申请理由',
  `bmYj` varchar(255) DEFAULT NULL COMMENT '申请科室意见',
  `xxkYj` varchar(255) DEFAULT NULL COMMENT '信息科意见',
  `flag` int(11) DEFAULT NULL COMMENT '状态',
  `leader` varchar(255) DEFAULT NULL COMMENT '负责人',
  `leader_name` varchar(255) DEFAULT NULL COMMENT '负责人姓名',
  `reback` varchar(255) DEFAULT NULL COMMENT '回复',
  `create_time` varchar(255) DEFAULT '' COMMENT '创建时间',
  `fault_urgent` int(1) NOT NULL DEFAULT '0' COMMENT '紧急标识位 0否1是',
  `group_visible` int(1) NOT NULL DEFAULT '0' COMMENT '物资组可见标识 0否1是',
  `high_approved` int(1) NOT NULL DEFAULT '0' COMMENT '院领导审核标识 0否1是',
  `approved_flag` int(1) NOT NULL DEFAULT '0' COMMENT '最终审批结果  0初1是2否',
  `high_leader_approved_1` int(1) NOT NULL DEFAULT '0' COMMENT '分管院长审核标识 0否1是',
  `high_leader_reback_1` varchar(255) DEFAULT NULL COMMENT '分管院长意见',
  `high_leader_id_1` char(5) DEFAULT NULL COMMENT '分管院长ID',
  `high_leader_name_1` varchar(20) DEFAULT NULL COMMENT '分管院长姓名',
  `high_leader_flag_1` int(1) NOT NULL DEFAULT '0' COMMENT '分管院长审批结果 0初1是2否',
  `high_leader_approved_2` int(1) NOT NULL DEFAULT '0' COMMENT '信息主管院长审核标识 0否1是',
  `high_leader_reback_2` varchar(255) DEFAULT NULL COMMENT '信息主管院长意见',
  `high_leader_id_2` char(5) DEFAULT NULL COMMENT '信息主管院长ID',
  `high_leader_name_2` varchar(20) DEFAULT NULL COMMENT '信息主管院长姓名',
  `high_leader_flag_2` int(1) NOT NULL DEFAULT '0' COMMENT '信息主管院长审批结果 0初1是2否',
  `high_leader_approved_3` int(1) NOT NULL DEFAULT '0' COMMENT '院长审核标识 0否1是',
  `high_leader_reback_3` varchar(255) DEFAULT NULL COMMENT '院长意见',
  `high_leader_id_3` char(5) DEFAULT NULL COMMENT '院长ID',
  `high_leader_name_3` varchar(20) DEFAULT NULL COMMENT '院长姓名',
  `high_leader_flag_3` int(1) NOT NULL DEFAULT '0' COMMENT '院长审批结果 0初1是2否',
  `feedback_content_1` varchar(255) DEFAULT NULL COMMENT '反馈内容1',
  `feedback_id_1` char(5) DEFAULT NULL COMMENT '反馈人1ID',
  `feedback_name_1` varchar(20) DEFAULT NULL COMMENT '反馈人1姓名',
  `feedback_content_2` varchar(255) DEFAULT NULL COMMENT '反馈内容2',
  `feedback_id_2` char(5) DEFAULT NULL COMMENT '反馈人2ID',
  `feedback_name_2` varchar(20) DEFAULT NULL COMMENT '反馈人2姓名',
  `feedback_content_3` varchar(255) DEFAULT NULL COMMENT '反馈内容3',
  `feedback_id_3` char(5) DEFAULT NULL COMMENT '反馈人3ID',
  `feedback_name_3` varchar(20) DEFAULT NULL COMMENT '反馈人3姓名',
  `feedback_content_4` varchar(255) DEFAULT NULL COMMENT '反馈内容4',
  `feedback_id_4` char(5) DEFAULT NULL COMMENT '反馈人4ID',
  `feedback_name_4` varchar(20) DEFAULT NULL COMMENT '反馈人4姓名',
  `feedback_content_5` varchar(255) DEFAULT NULL COMMENT '反馈内容5',
  `feedback_id_5` char(5) DEFAULT NULL COMMENT '反馈人5ID',
  `feedback_name_5` varchar(20) DEFAULT NULL COMMENT '反馈人5姓名',
  `feedback_time_1` varchar(255) DEFAULT NULL COMMENT '申购反馈时间1',
  `feedback_time_2` varchar(255) DEFAULT NULL COMMENT '申购反馈时间2',
  `feedback_time_3` varchar(255) DEFAULT NULL COMMENT '申购反馈时间3',
  `feedback_time_4` varchar(255) DEFAULT NULL COMMENT '申购反馈时间4',
  `feedback_time_5` varchar(255) DEFAULT NULL COMMENT '申购反馈时间5',
  `done_time` varchar(255) DEFAULT NULL COMMENT '申购处理完成时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

#
# Structure for table "material_application_type"
#

CREATE TABLE `material_application_type` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `material_name` varchar(100) DEFAULT '' COMMENT '物资名称',
  `material_code` varchar(10) DEFAULT '' COMMENT '物资编码',
  `material_code2` varchar(10) DEFAULT NULL COMMENT '物资编码2（备用字段）',
  `material_code3` varchar(255) DEFAULT NULL COMMENT '物资编码3（备用字段）',
  `material_note` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

#
# Structure for table "push_message"
#

CREATE TABLE `push_message` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `create_code` char(6) DEFAULT NULL COMMENT '创建标识位',
  `founder` char(5) DEFAULT '' COMMENT '创建人',
  `create_time` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `push_status` char(2) DEFAULT '' COMMENT '推送状态："0"为未发送,"1"为已发送',
  `push_way` char(2) DEFAULT NULL COMMENT '推送方式："0"为普通发送',
  `msg_type` char(2) DEFAULT '' COMMENT '消息类型："0"为电脑故障，"1"为物资申购，"2"为机房巡检',
  `msg_target` char(2) DEFAULT '' COMMENT '消息目标："0"为管理用户组，"1"为普通用户组, "2"为指定用户，"3"为多个用户组',
  `msg_content_1` varchar(255) DEFAULT NULL COMMENT '消息部分1',
  `msg_content_2` varchar(255) DEFAULT NULL COMMENT '消息部分2',
  `msg_content_3` varchar(255) DEFAULT NULL COMMENT '消息部分3',
  `push_time` char(20) DEFAULT NULL COMMENT '发送时间',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=379 DEFAULT CHARSET=utf8;

#
# Structure for table "push_message_template"
#

CREATE TABLE `push_message_template` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `content` varchar(255) DEFAULT NULL COMMENT '消息内容',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='个推消息模板';

#
# Structure for table "software_requirements"
#

CREATE TABLE `software_requirements` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cp_link_id` int(11) NOT NULL DEFAULT '0' COMMENT '电脑故障关联ID',
  `require_no` int(10) unsigned DEFAULT NULL COMMENT '编号',
  `dept_code` varchar(20) DEFAULT NULL COMMENT '申请部门编码',
  `dept` varchar(40) DEFAULT NULL COMMENT '申请部门名称',
  `applicant_name` varchar(20) DEFAULT NULL COMMENT '反馈人姓名',
  `applicant_id` varchar(20) DEFAULT NULL COMMENT '反馈人ID',
  `applicant_time` varchar(255) DEFAULT NULL COMMENT '反馈日期',
  `applicant_module` varchar(255) DEFAULT NULL COMMENT '软件模块名称',
  `require_type` int(3) DEFAULT NULL COMMENT '需求类别',
  `details` varchar(255) DEFAULT NULL COMMENT '详细内容',
  `proposer` varchar(20) DEFAULT NULL COMMENT '提出人',
  `handling_comments` varchar(255) DEFAULT NULL COMMENT '处理意见',
  `developer` varchar(100) DEFAULT NULL COMMENT '开发商代表',
  `acceptance_type` int(2) unsigned DEFAULT NULL COMMENT '验收结果',
  `acceptance_description` varchar(255) DEFAULT NULL COMMENT '验收说明',
  `management_leader` varchar(20) DEFAULT NULL COMMENT '管理组长',
  `hospital_leader` varchar(20) DEFAULT NULL COMMENT '信息科负责人',
  `other_1` varchar(255) DEFAULT NULL COMMENT '预留字段1',
  `other_2` varchar(255) DEFAULT NULL COMMENT '预留字段2',
  `other_3` varchar(255) DEFAULT NULL COMMENT '预留字段3',
  PRIMARY KEY (`id`),
  KEY `link_cp_id_3` (`cp_link_id`),
  CONSTRAINT `link_cp_id_3` FOREIGN KEY (`cp_link_id`) REFERENCES `computer_problems` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Structure for table "view_employee_mi_psd"
#

CREATE TABLE `view_employee_mi_psd` (
  `code` char(5) NOT NULL DEFAULT '',
  `name` char(32) NOT NULL DEFAULT '',
  `py_code` char(8) NOT NULL DEFAULT '',
  `d_code` char(8) NOT NULL DEFAULT '',
  `dept_code` char(7) NOT NULL DEFAULT '',
  `dept_name` char(32) NOT NULL DEFAULT '',
  `psd` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Structure for table "role"
#

CREATE TABLE `role` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `roleID` char(5) DEFAULT NULL,
  `real_name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `roleName` varchar(20) NOT NULL,
  `permissions` varchar(255) DEFAULT NULL COMMENT '权限',
  PRIMARY KEY (`Id`),
  KEY `roleID` (`roleID`),
  CONSTRAINT `role_ibfk_1` FOREIGN KEY (`roleID`) REFERENCES `view_employee_mi_psd` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

#
# Structure for table "push_id"
#

CREATE TABLE `push_id` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `code` char(5) NOT NULL DEFAULT '' COMMENT '工号',
  `client_id` varchar(50) NOT NULL DEFAULT '' COMMENT '该用户所分配的推送ID',
  PRIMARY KEY (`Id`),
  KEY `code` (`code`),
  CONSTRAINT `code` FOREIGN KEY (`code`) REFERENCES `view_employee_mi_psd` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
