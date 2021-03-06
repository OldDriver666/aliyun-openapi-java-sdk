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
package com.aliyuncs.iot.model.v20170620;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryApplyStatusRequest extends RoaAcsRequest<QueryApplyStatusResponse> {
	
	public QueryApplyStatusRequest() {
		super("Iot", "2017-06-20", "QueryApplyStatus", "iot");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/queryApplyStatus/[ApplyId]");
		setMethod(MethodType.GET);
	}

	private Long applyId;

	public Long getApplyId() {
		return this.applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
		if(applyId != null){
			putPathParameter("ApplyId", applyId.toString());
		}
	}

	@Override
	public Class<QueryApplyStatusResponse> getResponseClass() {
		return QueryApplyStatusResponse.class;
	}

}
