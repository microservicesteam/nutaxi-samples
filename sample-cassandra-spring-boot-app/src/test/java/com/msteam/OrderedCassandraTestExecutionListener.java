package com.msteam;

import org.cassandraunit.spring.CassandraUnitDependencyInjectionTestExecutionListener;

public class OrderedCassandraTestExecutionListener extends CassandraUnitDependencyInjectionTestExecutionListener {

	@Override
	public int getOrder() {
		return HIGHEST_PRECEDENCE;
	}

}
