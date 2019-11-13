# 南宫乘风 #
# SpringBoot博客

#### 介绍
本博客由SpringBoot开发

#### 软件架构
软件架构说明
由SpringBoot开发




**个人博客功能：**

![](https://ws2.sinaimg.cn/large/006tKfTcgy1fk7m27hbn4j31ds0ycdnp.jpg)

**技术组合：**

*  后端：Spring Boot + JPA + thymeleaf模板
*  数据库：MySQL
*  前端UI：Semantic UI框架

**工具与环境：**

*  IDEA
*  Maven 3
*  JDK 8
*  Axure RP 8

**课程内容模块：**

*  需求分析与功能规划
*  页面设计与开发
*  技术框架搭建
*  后端管理功能实现
*  前端管理功能实现

**你能学得什么？**

*  基于Spring Boot的完整全栈式的开发套路
*  Semantic UI框架的使用
*  一套博客系统的源代码与设计

## 1、需求与功能

### 1.1 用户故事

用户故事是敏捷框架中的一种开发方法。可以帮助开发者转换视角，以用户的角度更好的把握需求，从而实现具有商业价值的功能。

>  用户故事最好是用户团队编写

**用户故事模板**：

-  As a (role of user), I want (some feature) so that (some business value).
-  作为一个(某个角色) 使用者，我可以做(某个功能) 事情，如此可以有(某个商业价值) 的好处

**关键点**：角色、功能、商业价值

**举例**：

-  作为一个招聘网站**注册用户**，我想**查看最近3天发布的招聘信息**，以便于**了解最新的招聘信息**。
-  作为公司，可以张贴新工作。



个人博客系统的用户故事：

角色：**普通访客**，**管理员（我）**

*  访客，可以分页查看所有的博客
*  访客，可以快速查看博客数最多的6个分类
*  访客，可以查看所有的分类
*  访客，可以查看某个分类下的博客列表
*  访客，可以快速查看标记博客最多的10个标签
*  访客，可以查看所有的标签
*  访客，可以查看某个标签下的博客列表
*  访客，可以根据年度时间线查看博客列表
*  访客，可以快速查看最新的推荐博客
*  访客，可以用关键字全局搜索博客
*  访客，可以查看单个博客内容
*  访客，可以对博客内容进行评论
*  访客，可以赞赏博客内容
*  访客，可以微信扫码阅读博客内容
*  访客，可以在首页扫描公众号二维码关注我
*  我，可以用户名和密码登录后台管理
*  我，可以管理博客
   *  我，可以发布新博客
   *  我，可以对博客进行分类
   *  我，可以对博客打标签
   *  我，可以修改博客
   *  我，可以删除博客
   *  我，可以根据标题，分类，标签查询博客
*  我，可以管理博客分类
   *  我，可以新增一个分类
   *  我，可以修改一个分类
   *  我，可以删除一个分类
   *  我，可以根据分类名称查询分类
*  我，可以管理标签
   *  我，可以新增一个标签
   *  我，可以修改一个标签
   *  我，可以删除一个标签
   *  我，可以根据名称查询标签

### 1.2 功能规划

![](https://ws2.sinaimg.cn/large/006tKfTcgy1fk7m27hbn4j31ds0ycdnp.jpg)

## 2、页面设计与开发

### 2.1 设计

**页面规划：**

前端展示：首页、详情页、分类、标签、归档、关于我

后台管理：模板页

### 2.2 页面开发



[Semantic UI官网](https://semantic-ui.com/)

[Semantic UI中文官网](http://www.semantic-ui.cn/)

[WebStorm下载与破解](https://imcoding.me/blogs/5)

[背景图片资源](https://www.toptal.com/designers/subtlepatterns/)

### 2.3 插件集成



[编辑器 Markdown](https://pandao.github.io/editor.md/)

[内容排版 typo.css](https://github.com/sofish/typo.css)

[动画 animate.css](https://daneden.github.io/animate.css/)

[代码高亮 prism](https://github.com/PrismJS/prism)

[目录生成 Tocbot](https://tscanlin.github.io/tocbot/)

[滚动侦测 waypoints](http://imakewebthings.com/waypoints/)

[平滑滚动 jquery.scrollTo](https://github.com/flesler/jquery.scrollTo)

[二维码生成 qrcode.js](https://davidshimjs.github.io/qrcodejs/)