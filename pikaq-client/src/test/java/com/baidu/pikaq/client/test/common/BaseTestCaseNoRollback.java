/*
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.pikaq.client.test.common;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * 所有测试类的基类
 *
 * @author liaoqiqi
 * @version 2013-12-13
 */
@TestExecutionListeners(BaseTestBeforeClass.class)
@ContextConfiguration(locations = "classpath:**/applicationContextClient.xml")
@TransactionConfiguration(transactionManager = "onedbTransactionManagerTest", defaultRollback = false)
@ActiveProfiles({"db-test"})
public class BaseTestCaseNoRollback extends AbstractTestCase {

}