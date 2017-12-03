# 简介
这个项目是医院内部信息维护所使用的一个系统，目前而言只有信息维护功能。

# 使用技术
IOC容器：Spring

Web框架：SpringMVC

ORM框架：Mybatis

安全框架：Shiro

数据源：C3P0

日志：log4j

前端框架：Bootstrap

# 快速上手
### 1、运行环境和所需工具
* 编译器：IntelliJ IDEA
* 项目构建工具：Maven
* 数据库：Mysql
* JDK版本：jdk1.8
* Tomcat版本：Tomcat8.x
### 2、初始化项目
* 在你的Mysql中，创建一个数据库名称为 examination_system 的数据库，并导入我提供的 .sql 文件,
* 进入src/main/resources修改mysql.properties配置文件,把数据库登录名和密码，改为你本地的
* 使用 IntelliJ IDEA 导入项目，选择Maven项目选项，一路点击next就行，导入项目后，如果src目录等，都没显示出来，别急先使用Maven构建该项目
* 在 IntelliJ IDEA 中，配置我们的 Tomcat， 然后把使用Maven构建好的项目添加到Tomcat中
* 运行
![image](http://imgsrc.baidu.com/forum/pic/item/5a8d9e1c8701a18b1ea553e4942f07082938fead.jpg)
* 登录账户
  * 管理员账户：admin
  * 普通账户：1001
  * 密码均为：123
# 功能模块介绍
### 1、登录模块功能
使用Shiro权限管理框架，实现登录验证和登录信息的储存，根据不同的登录账户，分发权限角色，对不同页面url进行角色设置
### 2、管理员模块功能（未使用）