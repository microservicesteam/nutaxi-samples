package com.msteam;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.context.TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS;

import org.cassandraunit.spring.CassandraDataSet;
import org.cassandraunit.spring.EmbeddedCassandra;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.IntegrationTestPropertiesListener;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners(mergeMode = MERGE_WITH_DEFAULTS, listeners = {
		IntegrationTestPropertiesListener.class,
		OrderedCassandraTestExecutionListener.class })
@SpringApplicationConfiguration(SampleCassandraProjectApplication.class)
@IntegrationTest({
		"spring.data.cassandra.port=9142",
		"spring.data.cassandra.contact-points=localhost"
})
@CassandraDataSet(keyspace = "mykeyspace", value = "data/test_data.cql")
@EmbeddedCassandra(timeout = 60000)
public class SampleCassandraProjectApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	public void contextLoads() {
		assertNotNull(context);
	}

}
