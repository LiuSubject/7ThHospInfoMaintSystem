ALTER TABLE computer_problems ADD feedback_content_1 VARCHAR(255) NULL COMMENT '反馈内容1';
ALTER TABLE computer_problems ADD feedback_id_1 CHAR (5) NULL COMMENT '反馈人1ID';
ALTER TABLE computer_problems ADD feedback_name_1 VARCHAR(20) NULL COMMENT '反馈人1姓名';

故障反馈内容_1
故障反馈人ID_1
故障反馈人姓名_1
computer_problems

CREATE TABLE `external_access` (
  `id` int(10) unsigned PRIMARY KEY AUTO_INCREMENT,
  `access_type` int(2) unsigned COMMENT '申请类型',
  `dept_code` varchar(20) DEFAULT NULL COMMENT '申请部门编码',
  `dept` varchar(40) DEFAULT NULL COMMENT '申请部门名称',
  `access_address` varchar(255) DEFAULT NULL COMMENT '申请接入地址/工作内容',
  `contact_name` varchar(20) DEFAULT NULL COMMENT '联系人',
  `contact_tel` varchar(20) DEFAULT NULL COMMENT '申请电话',
  `cable_type` int(2) unsigned COMMENT '申请接入线路',
  `way_type` int(2) unsigned COMMENT '申请接入方式',
  `lan_points` int(3) unsigned COMMENT '局域网接入点数',
  `lan_equipment` varchar(80) DEFAULT NULL COMMENT '接入设备型号',
  `dedicated_room` int(2) unsigned COMMENT '专用机房',
  `air_conditioning` int(2) unsigned COMMENT '空调',
  `ups` int(2) unsigned COMMENT 'UPS',
  `wiring` int(2) unsigned COMMENT '布线系统',
  `cabinet` int(2) unsigned COMMENT '机柜',
  `threaded_pipe` int(2) unsigned COMMENT '穿线管道',
  `dept_principal` varchar(20) DEFAULT NULL COMMENT '科室负责人',
  `principal_tel` varchar(20) DEFAULT NULL COMMENT '负责人电话',
  `opinion` varchar(255) DEFAULT NULL COMMENT '信息科审核意见',
  `chief_dean` varchar(20) DEFAULT NULL COMMENT '主管院长',
  `other_1` varchar(255) DEFAULT NULL COMMENT '预留字段1',
  `other_2` varchar(255) DEFAULT NULL COMMENT '预留字段2',
  `other_3` varchar(255) DEFAULT NULL COMMENT '预留字段3'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;

CREATE TABLE `external_access` (
  `id` int(10) unsigned PRIMARY KEY AUTO_INCREMENT,
  `access_type` int(2) unsigned COMMENT '申请类型',
  `dept_code` varchar(20) DEFAULT NULL COMMENT '申请部门编码',
  `dept` varchar(40) DEFAULT NULL COMMENT '申请部门名称',
  `access_address` varchar(255) DEFAULT NULL COMMENT '申请接入地址/工作内容',
  `contact_name` varchar(20) DEFAULT NULL COMMENT '联系人',
  `contact_tel` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `cable_type` int(2) unsigned COMMENT '申请接入线路',
  `way_type` int(2) unsigned COMMENT '申请接入方式',
  `lan_points` int(3) unsigned COMMENT '局域网接入点数',
  `lan_equipment` varchar(80) DEFAULT NULL COMMENT '接入设备型号',
  `dedicated_room` int(2) unsigned COMMENT '专用机房',
  `air_conditioning` int(2) unsigned COMMENT '空调',
  `ups` int(2) unsigned COMMENT 'UPS',
  `wiring` int(2) unsigned COMMENT '布线系统',
  `open_website` varchar(255) DEFAULT NULL COMMENT '开通网站',
  `communication_tools` varchar(255) DEFAULT NULL COMMENT '开通通讯工具',
  `dept_principal` varchar(20) DEFAULT NULL COMMENT '科室负责人',
  `principal_tel` varchar(20) DEFAULT NULL COMMENT '负责人电话',
  `opinion` varchar(255) DEFAULT NULL COMMENT '信息科审核意见',
  `chief_dean` varchar(20) DEFAULT NULL COMMENT '主管院长',
  `other_1` varchar(255) DEFAULT NULL COMMENT '预留字段1',
  `other_2` varchar(255) DEFAULT NULL COMMENT '预留字段2',
  `other_3` varchar(255) DEFAULT NULL COMMENT '预留字段3'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;

CREATE TABLE `software_requirements` (
  `id` int(10) unsigned PRIMARY KEY AUTO_INCREMENT,
  `require_no` int(10) unsigned COMMENT '编号',
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
  `developer` varchar(100) DEFAULT NULL COMMENT '开发商',
  `acceptance_type` int(2) unsigned COMMENT '验收结果',
  `acceptance_description` varchar(255) DEFAULT NULL COMMENT '验收说明',
  `management_leader` varchar(20) DEFAULT NULL COMMENT '管理组长',
  `hospital_leader` varchar(20) DEFAULT NULL COMMENT '信息科负责人',
  `other_1` varchar(255) DEFAULT NULL COMMENT '预留字段1',
  `other_2` varchar(255) DEFAULT NULL COMMENT '预留字段2',
  `other_3` varchar(255) DEFAULT NULL COMMENT '预留字段3'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;