-- ----------------------------
-- Records of application
-- ----------------------------
INSERT INTO `application` VALUES (1, 'test', '测试', 1, 0, NULL, 'AuroraPush', 0, NULL, NULL, '2020-04-02 12:29:41', NULL, 0, '');
INSERT INTO `application` VALUES (2, 'test_template', '测试模板', 1, 1, 'hello', 'AuroraPush', 0, NULL, NULL, '2020-04-02 12:30:49', NULL, 1, '');
INSERT INTO `application` VALUES (3, 'order_unpaid_push', '订单未支付Push', 1, 1, 'unpaid', 'AuroraPush', 0, NULL, NULL, '2020-04-02 12:45:03', NULL, 1, '');
INSERT INTO `application` VALUES (4, 'mychat_push', '私信push', 1, 1, 'mychat', 'AuroraPush', 0, NULL, NULL, '2020-04-02 12:46:06', NULL, 1, '');

-- ----------------------------
-- Records of provider
-- ----------------------------
INSERT INTO `provider` VALUES (1, 'AuroraPush', '极光push', 'auroraPush', '2020-03-26 15:03:46', '2020-04-02 12:20:36', 0.70, '9109986c59e13f6fddb7c776', '96d88544074c95c8e22820b0', '', '备注');
INSERT INTO `provider` VALUES (2, 'HuaXinSMS', '华信SMS', 'huaXinSMS', '2020-04-07 06:04:09', '2020-04-07 06:05:30', 0.70, 'KA00077', 'D8075F17D9F261039A4D7744CEB472A1', 'https://dx.ipyy.net/smsJson.aspx', '');

-- ----------------------------
-- Records of template
-- ----------------------------
INSERT INTO `template` VALUES (1, '未支付提示', 'unpaid', '您有一笔订单尚未支付，快去获取TA的服务哦', '2020-04-02 12:22:21', NULL, '');
INSERT INTO `template` VALUES (2, '接单提示', 'order', '您收到一笔{0}元的新订单，请尽快接单', '2020-04-02 12:23:34', NULL, '');
INSERT INTO `template` VALUES (3, '订单评价', 'order_evaluate', '您的订单已完成，对TA的服务还满意吗？来发表评价吧。', '2020-04-02 12:25:19', NULL, '');
INSERT INTO `template` VALUES (4, '私信提示', 'mychat', '有{0}个小姐姐/小哥哥和您搭话了哦，快去回复TA吧', '2020-04-02 12:27:36', NULL, '');
INSERT INTO `template` VALUES (5, '打招呼', 'hello', '您好！！！', '2020-04-02 12:31:04', NULL, '');