package com.ibm.sample;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.batch.api.BatchProperty;
import javax.batch.api.Batchlet;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;


@Dependent
public class LoggingPartitionedBatchlet implements Batchlet {

	
	@Inject
	@BatchProperty(name="partitionNumber")
	String partitionNumber;

	private static final Logger log = Logger.getLogger( LoggingPartitionedBatchlet.class.getName() );
	
    /**
     * Default constructor. 
     */
    public LoggingPartitionedBatchlet() {    }

	/**
     * @see Batchlet#stop()
     */
    public void stop() {
    }

	/**
     * @see Batchlet#process()
     */
    public String process() {
    	log.log(Level.INFO, "In partition:  "+partitionNumber);
			return null;
    }

}
