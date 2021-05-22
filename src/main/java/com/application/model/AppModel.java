package com.application.model;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="customerlog")
public class AppModel {
	
		@Id
		@Column(name="id")
		private String Id;
		@Column(name="name")
		private String name;
		@Column(name="logtype")
		private String logType;
		@Column(name="date")
		private String date;
		@Column(name="time")
		private LocalTime time;
		
		
		public AppModel (String id, String name, String logType, String date, LocalTime time) {
			super();
			Id = id;
			this.name = name;
			this.logType = logType;
			this.date = date;
			this.time = time;
		}


		public AppModel () {
			super();
			// TODO Auto-generated constructor stub
		}


		public String getId() {
			return Id;
		}


		public void setId(String id) {
			Id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getLogType() {
			return logType;
		}


		public void setLogType(String logType) {
			this.logType = logType;
		}


		public String getDate() {
			return date;
		}


		public void setDate(String date) {
			this.date = date;
		}


		public LocalTime getTime() {
			return time;
		}


		public void setTime(LocalTime time) {
			this.time = time;
		}


		@Override
		public String toString() {
			return "AppModel  [Id=" + Id + ", name=" + name + ", logType=" + logType + ", date=" + date + ", time=" + time
					+ "]";
		}

	

}
