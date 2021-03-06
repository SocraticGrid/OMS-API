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
package org.socraticgrid.hl7.services.orders.model.types.order;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import org.socraticgrid.hl7.services.orders.model.Order;
import org.socraticgrid.hl7.services.orders.model.types.orderdetail.MedicationOrderDetail;
import org.socraticgrid.hl7.services.orders.model.types.orderitems.MedicationOrderItem;

public class MedicationOrder extends Order implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MedicationOrderDetail orderDetail= new MedicationOrderDetail();
	
	private List<MedicationOrderItem>  items = new LinkedList<MedicationOrderItem>();
	/**
	 * Information relevant for the performance of an order.
	 */

	public MedicationOrderDetail getOrderDetails()
	{
		return orderDetail;
	}

	public void setOrderdetails(MedicationOrderDetail newVal) {

		orderDetail =  newVal;
	}

	
	public List<MedicationOrderItem> getOrdereditems() {
		return items;
	}

	
	public void setOrdereditems(List<MedicationOrderItem> newVal) {
		items=newVal;
	}

	
}
