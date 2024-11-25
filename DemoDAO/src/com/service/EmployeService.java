package com.service;

import com.dao.EmployeDAO;

public class EmployeService {
	// Method to create a table through DAO
	public void CreateTAble() throws Exception {
		EmployeDAO ed= new EmployeDAO();
		ed.CreateTable();
		System.out.println("This is service");
	}
	// Method to insert data through DAO`
	public void InsertData()throws Exception{
		EmployeDAO ed= new EmployeDAO();
		ed.InsertData();
	}
	// Method to update data through DAO
    public void UpdateData() throws Exception {
        EmployeDAO ed = new EmployeDAO();
        ed.UpdateData();
        System.out.println("Data update service executed");
    }
    // Method to delete data through DAO
    public void DeleteData() throws Exception {
        EmployeDAO ed = new EmployeDAO();
        ed.DeleteData();
        System.out.println("Data deletion service executed");
    }
    // Method to fetch and display data through DAO
    public void FetchData() throws Exception {
        EmployeDAO ed = new EmployeDAO();
        ed.FetchData();
        System.out.println("Data fetch service executed");
    }
}