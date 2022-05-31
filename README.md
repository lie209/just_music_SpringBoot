# 基于Vue和SpringBoot的在线音乐播放器的设计与实现



## 开发环境说明
- 前端开发：HBuilder X，Visual Studio Code
- 后端开发：IDEA 2022.1

## 基础设置搭建步骤
### 云数据库配置

- 申请云服务器，在服务器安装配置好MySql，保存用户名密码
- 使用Navicat连接云数据库，并创建`spring_db`
- 在`spring_db`运行如下sql语句，创建表
```
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `playlist`;
CREATE TABLE `playlist`  (
  `id` int(11) NOT NULL,
  `musicName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `musicId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
```

### 网易云api配置
- 在服务器配置好NodeJs环境以及Git环境
- 安装网易云api
```
$ git clone https://github.com/Binaryify/NeteaseCloudMusicApi.git

$ npm install
```
- 登录[网页版网易云音乐](https://music.163.com/)
- 找到域名为`music.163.com`的Cookie，获得其中的 **MUSIC_U** 字段
- 将字段填入api目录`/util/config.json`文件中的`anonymous_token`中
- 启动api并后台运行

### 项目配置
- 加载maven项目
- 在项目文件夹的`src/main/resources/config/application.yaml`中填入自己的数据库连接信息
- 将`src/main/resources/static/js/main.js`中`axios`请求的ip地址换为自己的云服务器地址
- 启动`MusicApplication`
- 浏览器输入`http://localhost`即可访问项目

