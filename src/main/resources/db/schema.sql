-- 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id`         INT(11)      NOT NULL AUTO_INCREMENT, -- 主键
  `login_name` VARCHAR(255) NOT NULL, -- 登录名
  `password`   VARCHAR(255) NOT NULL, -- 密码
  `user_name`  VARCHAR(255), -- 用户姓名
  `user_num`   VARCHAR(255), -- 用户工号
  `phone_num`  VARCHAR(255), -- 联系电话
  PRIMARY KEY (id)
);

-- 角色表
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id`        INT          NOT NULL AUTO_INCREMENT, -- 主键
  `role_code` VARCHAR(255) NOT NULL, -- 角色CODE
  `role_name` VARCHAR(255), -- 角色名称
  `role_desc` VARCHAR(255), -- 角色描述
  PRIMARY KEY (id)
);

-- 用户角色关系表
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id`      INT NOT NULL AUTO_INCREMENT, -- 主键
  `user_id` INT NOT NULL, -- 用户主键
  `role_id` INT NOT NULL, -- 角色主键
  PRIMARY KEY (id)
);
