-- 角色表
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id`        INT          NOT NULL AUTO_INCREMENT, -- 主键
  `role_code` VARCHAR(255) NOT NULL, -- 角色CODE
  `role_name` VARCHAR(255), -- 角色名称
  `role_desc` VARCHAR(255), -- 角色描述
  PRIMARY KEY (id)
);