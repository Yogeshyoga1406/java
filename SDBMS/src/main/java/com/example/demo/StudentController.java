package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
	
	@Autowired
	StudentImplementation stu;
	
	@RequestMapping("home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("add")
	public String add(HttpSession h,  Student s) {
		stu.addStu(s);
		h.setAttribute("addmsg", "Added Successfully....!");
		return "add.jsp";
	}
	
	@RequestMapping("delete")
	public String delete(HttpSession h,Integer id) {
		if(stu.deleteStu(id)!=null) {
			h.setAttribute("deletemsg", "Student details with id :"+id+" Deleted Successfully");
			return "delete.jsp";
		}
		else
			return "error.jsp";
	}
	
	@RequestMapping("get")
	public String get(HttpSession h,Integer id) {
		Student s=stu.getStu(id);
		if(s!=null) {
			h.setAttribute("getmsg", s);
			return "get.jsp";
		}
		else
			return "error.jsp";
	}

	@RequestMapping("update")
	public String update(HttpSession h,Student s) {
		if(stu.updateStu(s)!=null) {
			h.setAttribute("updatemsg", "Updated Successfully....!");
			return "update.jsp";
		}
		else
			return "error.jsp";
	}
}
