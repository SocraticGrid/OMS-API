/* 
 * Copyright 2015 Cognitive Medical Systems, Inc (http://www.cognitivemedciine.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.socraticgrid.hl7.services.orders.model;

import java.io.Serializable;

public class OSServiceStatistics implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long noOfTransactions;
	private long operationPeriod;
	private long avgRespLatency;
	
	public OSServiceStatistics() {
		super(); 
	}

	public long getNoOfTransactions() {
		return noOfTransactions;
	}

	public void setNoOfTransactions(long noOfTransactions) {
		this.noOfTransactions = noOfTransactions;
	}

	public long getOperationPeriod() {
		return operationPeriod;
	}

	public void setOperationPeriod(long operationPeriod) {
		this.operationPeriod = operationPeriod;
	}

	public long getAvgRespLatency() {
		return avgRespLatency;
	}

	public void setAvgRespLatency(long avgRespLatency) {
		this.avgRespLatency = avgRespLatency;
	} 
}