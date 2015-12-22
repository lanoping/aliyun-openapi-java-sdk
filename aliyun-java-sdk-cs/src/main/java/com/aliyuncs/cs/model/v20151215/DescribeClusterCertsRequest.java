/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterCertsRequest extends RoaAcsRequest<DescribeClusterCertsResponse> {
	
	public DescribeClusterCertsRequest() {
		super("CS", "2015-12-15", "DescribeClusterCerts");
		setUriPattern("/clusters/[ClusterId]/certs");
		setMethod(MethodType.GET);
	}

	private String clusterId;

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		putPathParameter("ClusterId", clusterId);
	}

	@Override
	public Class<DescribeClusterCertsResponse> getResponseClass() {
		return DescribeClusterCertsResponse.class;
	}

}