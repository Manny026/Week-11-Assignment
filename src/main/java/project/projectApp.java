package project;

import java.sql.Connection;

import project.dao.DbConnection;

public class projectApp {

	public static void main(String[] args) {
		 DbConnection.getConnection();

	}

}
