# [首页查询更多项目](https://github.com/GraduationProject-ssm) 包安装运行


# 11050ssm图书馆借阅管理系统程序 11050ssm1

![picture](https://raw.githubusercontent.com/GraduationProject-springboot/.github/main/img/wx.png)

### 点击播放视频 ▼
[![Watch the video](https://i.sstatic.net/Vp2cE.png)](https://www.bilibili.com/video/BV1Kp48e9EtU?p=94)


# 系统概述
进过系统的分析后，就开始记性系统的设计，系统设计包含总体设计和详细设计。总体设计只是一个大体的设计，经过了总体设计，我们能够划分出系统的一些东西，例如文件、文档、数据等。而且我们通过总体设计，大致可以划分出了程序的模块，以及功能。但是只是一个初步的分类，并没有真正的实现。

整体设计，只是一个初步设计，而且，对于一个项目，我们可以进行多个整体设计，通过对比，包括性能的对比、成本的对比、效益的对比，来最终确定一个最优的设计方案，选择优秀的整体设计可以降低开发成本，增加公司效益，从这一点来讲，整体设计还是非常重要的。

图书馆借阅管理系统工作原理图如图4-1所示：

![](/md/blog.012.png)

图4-1 系统工作原理图
## 4.2 系统结构设计
系统架构图属于系统设计阶段，系统架构图只是这个阶段一个产物，系统的总体架构决定了整个系统的模式，是系统的基础。图书馆借阅管理系统的整体结构设计如图4-2所示。

![](/md/blog.013.png)

图4-2 系统结构图
## 4.3数据库设计
数据库是计算机信息系统的基础。目前，电脑系统的关键与核心部分就是数据库。数据库开发的优劣对整个系统的质量和速度有着直接影响。
### 4.3.1 数据库设计原则
数据库的概念结构设计采用实体—联系（E-R）模型设计方法。E-R模型法的组成元素有：实体、属性、联系，E-R模型用E-R图表示，是提示用户工作环境中所涉及的事物，属性则是对实体特性的描述。在系统设计当中数据库起着决定性的因素。下面设计出这几个关键实体的实体—关系图。
### 4.3.2 数据库实体
数据模型中的实体（Entity），也称为实例，对应现实世界中可区别于其他对象的“事件”或“事物”。例如，公司中的每个员工，家里中的每个家具。

本系统的E-R图如下图所示：

1、图书馆信息实体图如图4-3所示：

![](/md/blog.014.png)

图4-3图书馆信息实体图

2、用户信息实体图如图4-4所示：

![](/md/blog.015.png)

`    `图4-4用户信息实体图

3、图书续借信息实体图如图4-5所示：

![](/md/blog.016.png)

`    `图4-5图书续借信息实体图

#########

### 4.3.3 数据库表设计
数据库的表信息属于设计的一部分，下面介绍数据库中的各个表的详细信息。

表4-1 allusers表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|int|11|NOT NULL|
|username|varchar|50|` `default NULL|
|pwd|varchar|50|` `default NULL|
|cx|varchar|50|` `default NULL|


表4-2 jiaonafajin表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|int|11|NOT NULL|
|addtime|varchar|50|default NULL|
|jieyuedanhao|varchar|50|default NULL|
|tushubianhao|varchar|50|default NULL|
|tushumingcheng|varchar|50|default NULL|
|fakuanshuoming|varchar|50|default NULL|
|fakuanjine|varchar|50|default NULL|
|fakuanriqi|varchar|50|default NULL|
|yonghuming|varchar|50|default NULL|
|xingming|varchar|50|default NULL|

表4-3：tushuguanxinxi表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|tushuguanmingcheng|varchar|50|default NULL|
|tupian|varchar|50|default NULL|
|jianguanshijian|varchar|50|default NULL|
|lianxidianhua|varchar|50|default NULL|
|dizhi|varchar|50|default NULL|
|tushuguanjieshao|varchar|50|default NULL|


表4-4：tushuxujie表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|jieyuedanhao|varchar|50|default NULL|
|tushubianhao|varchar|50|default NULL|
|tushumingcheng|varchar|50|default NULL|
|tushuguanmingcheng|varchar|50|default NULL|
|jieyueriqi|varchar|50|default NULL|
|yinghairiqi|varchar|50|default NULL|
|xujietianshu|varchar|50|default NULL|
|xujieriqi|varchar|50|default NULL|
|yonghuming|varchar|50|default NULL|
|xingming|varchar|50|default NULL|
|sfsh|varchar|50|default NULL|
|shhf|varchar|50|default NULL|

表4-5：yonghu表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|yonghuming|varchar|50|default NULL|
|mima|varchar|50|default NULL|
|xingming|varchar|50|default NULL|
|touxiang|varchar|50|default NULL|
|xingbie|varchar|50|default NULL|
|lianxidianhua|varchar|50|default NULL|
|shenfenzheng|varchar|50|default NULL|





# 5统详细设计
## 5.1前台首页功能模块
图书馆借阅管理系统，在系统首页可以查看首页、图书馆信息、图书信息、公告信息、留言反馈、我的、跳转到后台等内容，如图5-1所示。

![](/md/blog.017.png)

图5-1前台首页功能界面图



`    `用户注册，在用户注册页面可以填写用户名、密码、姓名、联系电话、身份证等详细内容进行注册，如图5-2所示。

![](/md/blog.018.png)

图5-2用户注册界面图

登录，在登录页面通过填写账号、密码等信息完成登录，如图5-3所示。图书馆信息页面通过填写图书馆名称、图片、建馆时间、联系电话、地址、图书馆介绍等信息进行提交操作，如图5-4所示。

![](/md/blog.019.png)

图5-3登录界面图

![](/md/blog.020.png)

图5-4图书馆信息界面图

## 5.2管理员功能模块
管理员登录，通过填写注册时输入的用户名、密码进行登录，如图5-5所示。

![](/md/blog.021.png)

图5-5管理员登录界面图

管理员登录进入图书馆借阅管理系统可以查看主页、个人中心、用户管理、图书馆信息管理、图书类型管理、图书信息管理、图书借阅管理、图书续借管理、图书归还管理、缴纳罚金管理、留言板管理、系统管理、留言管理等信息。

用户管理，在用户管理页面中可以通过填写用户名、密码、姓名、头像、性别、联系电话、身份证等内容进行修改、删除，如图5-6所示。还可以根据需要对图书馆信息管理进行详情，修改等详细操作，如图5-7所示。

![](/md/blog.022.png)

图5-6用户管理界面图

![](/md/blog.023.png)

图5-7图书馆信息管理界面图

图书类型管理，在图书类型管理页面中可以查看图书类型等信息，并可根据需要对已有图书类型管理进行修改或删除等操作，如图5-8所示。

![](/md/blog.024.png)

图5-8图书类型管理界面图

图书借阅管理，在图书借阅管理页面中可以查看借阅单号、图书编号、图书名称、图书馆名称、可借天数、可借数量、借阅日期、借阅天数、应还日期、借阅状态、用户名、姓名、身份证、是否审核、审核回复等信息，并可根据需要对已有图书借阅管理进行修改或删除等详细操作，如图5-9所示。

![](/md/blog.025.png)

图5-9图书借阅管理界面图

留言板管理，在留言板管理页面中可以查看用户名、留言内容、回复内容等内容，并且根据需要对已有留言板管理进行详情，修改或删除等详细操作，如图5-10所示。

![](/md/blog.026.png)

图5-10留言板管理界面图

图书续借管理，在图书续借管理页面中可以查看借阅单号、图书编号、图书名称、图书馆名称、借阅日期、应还日期、续借天数、续借日期、用户名、姓名、是否审核、审核回复等内容，并且根据需要对已有图书续借管理进行详情，修改或删除等详细操作，如图5-11所示。

![](/md/blog.027.png)

图5-11图书续借管理界面图

图书归还管理，在图书归还管理页面中可以查看借阅单号、图书编号、图书名称、可借天数、图书馆名称、借阅日期、归还日期、备注、用户名、姓名、是否审核、审核回复等内容，并且根据需要对已有图书归还管理进行详情，修改或删除等详细操作，如图5-12所示。

![](/md/blog.028.png)

图5-12图书归还管理界面图

## 5.3用户功能模块
用户登录进入图书馆借阅管理系统可以查看主页、个人中心、图书借阅管理、图书续借管理、图书归还管理、缴纳罚金管理、我的收藏管理等内容。

图书借阅管理，在图书借阅管理页面中通过填写借阅单号、图书编号、图书名称、图书馆名称、可借天数、可借数量、借阅日期、借阅天数、应还日期、借阅状态、用户名、姓名、身份证、是否审核、审核回复等信息，还可以根据需要对图书借阅管理进行修改、删除，如图5-13所示。

![](/md/blog.029.png)

图5-13图书借阅管理界面图

图书续借管理，在图书续借管理页面中可以查看借阅单号、图书编号、图书名称、图书馆名称、借阅日期、应还日期、续借天数、续借日期、用户名、姓名、是否审核、审核回复等信息，并且根据需要对已有图书续借管理进行详情、修改、删除等其他详细操作，如图5-14所示。

![](/md/blog.030.png)

图5-14图书续借管理界面图

图书归还管理，在图书归还管理页面中通过填写借阅单号、图书编号、图书名称、可借天数、图书馆名称、借阅日期、归还日期、备注、用户名、姓名、是否审核、审核回复等内容进行详情、修改、删除，如图5-15所示。

![](/md/blog.031.png)

图5-15图书归还管理界面图

我的收藏管理，在我的收藏管理页面中通过填写用户ID、收藏ID、表名、收藏名称、收藏图片等内容进行详情、修改、删除，如图5-16所示。

![](/md/blog.032.png)

图5-16我的收藏管理界面图












