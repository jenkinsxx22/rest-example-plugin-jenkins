package com.rest.example;

public class App {
	public static void main(String args[]) throws Exception {
		
		LogDataDao logdao = new LogDataDao();
		
		LogData log1 = new LogData(1,"fgqeqwesdfdsf","fggeret3312","mlkmkjihi3","uqebnsdbfhdsbf213");
		
		logdao.SaveLog(log1);
	}
}
