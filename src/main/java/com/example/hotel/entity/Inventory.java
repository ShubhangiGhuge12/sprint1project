package com.example.hotel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Inventory1")
public class Inventory {
	
		@Id
		private int inv_id;
		private int inv_num;
        private String inv_desc;
        private String inv_items;
        private String inv_type;
		public int getInv_id() {
			return inv_id;
		}
		public void setInv_id(int inv_id) {
			this.inv_id = inv_id;
		}
		public int getInv_num() {
			return inv_num;
		}
		public void setInv_num(int inv_num) {
			this.inv_num = inv_num;
		}
		public String getInv_desc() {
			return inv_desc;
		}
		public void setInv_desc(String inv_desc) {
			this.inv_desc = inv_desc;
		}
		public String getInv_items() {
			return inv_items;
		}
		public void setInv_items(String inv_items) {
			this.inv_items = inv_items;
		}
		public String getInv_type() {
			return inv_type;
		}
		public void setInv_type(String inv_type) {
			this.inv_type = inv_type;
		}
		
		
	}

