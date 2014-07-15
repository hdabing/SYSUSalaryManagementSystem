package com.sms.service;

import com.sms.entity.ProfessionalPaylevelSalary;
import com.sms.entity.ProfessionalPositionSalary;
import com.sms.entity.ProfessionalSalaryChange;

public interface IProfSalaryManageDao {
	public void addProfPaySal(ProfessionalPaylevelSalary profPaylevelSalary);//增加专业人员薪级工资映射
	public void modifyProfPaySal(ProfessionalPaylevelSalary profPaylevelSalary);//修改专业人员薪级工资映射
	public void deleteProfPaySal();//删除专业人员薪级工资映射
	public void setProfPaySalByPayLevel(Integer payLevel);//根据薪级设置专业人员薪级工资映射记录
	
	public void addProfPosSal(ProfessionalPositionSalary profPositionSalary);//增加专业人员职务映射
	public void modifyProfPosSal(ProfessionalPositionSalary profPositionSalary);//修改专业人员职务映射
	public void deleteProfPosSal();//删除专业人员职务映射
	public void setProfPosSalByLevel(Integer level);//根据级别设置专业人员职务工资映射记录
	
	public void addProfSalCha(ProfessionalSalaryChange profSalaryChange);//增加专业人员套改工资映射
	public void modifyProfSalCha(ProfessionalSalaryChange profSalaryChange);//修改专业人员套改工资映射
	public void deleteProfSalCha();//删除专业人员套改工资映射
	public void setProfSalChaByLevel(Integer level,Integer off,Integer cha);//根据级别和相应工作年限设置套改工资映射记录
	
	public void setAllManage(Integer level,Integer off,Integer cha);//设置所有私有成员
	
	public Integer getSalary();//获得专业人员工资
}
