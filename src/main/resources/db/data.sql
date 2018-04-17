-- 用户角色默认值
INSERT INTO `role` VALUES (1, 'Admin', '系统管理员', '系统管理员');
INSERT INTO `role` VALUES (2, 'Officer', '工长', '工长，访问台账，审核导出，查看记录');
INSERT INTO `role` VALUES (3, 'Safety', '安技员', '安技员，派发工具');
INSERT INTO `role` VALUES (4, 'Manage', '物资管理员', '物资管理员，使用工器具和材料有关功能');
INSERT INTO `role` VALUES (5, 'Worker', '领用人员', '领用人员');
INSERT INTO `role` VALUES (6, 'Guest', '访客', '访客人员，不能增删改');
