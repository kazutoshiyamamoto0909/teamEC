package com.internousdev.i1810a.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810a.dao.MCategoryDAO;
import com.internousdev.i1810a.dao.PurchaseHistoryInfoDAO;
import com.internousdev.i1810a.dto.MCategoryDTO;
import com.internousdev.i1810a.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware{
	private String categoryId;
	private Map<String, Object> session;

	public String execute() {

		String result = ERROR;

		List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
		List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDtoList = new ArrayList<PurchaseHistoryInfoDTO>();
		purchaseHistoryInfoDtoList = purchaseHistoryInfoDAO.getPurchaseHistoryList(String.valueOf(session.get("userId")));
		Iterator<PurchaseHistoryInfoDTO> iterator = purchaseHistoryInfoDtoList.iterator();
		if(!(iterator.hasNext())) {
			purchaseHistoryInfoDtoList = null;
		}
		session.put("purchaseHistoryInfoDtoList",purchaseHistoryInfoDtoList);

		if(!session.containsKey("mCategoryList")) {
			MCategoryDAO mCategoryDAO = new MCategoryDAO();
			mCategoryDtoList = mCategoryDAO.getMCategoryList();
			session.put("mCategoryDtoList",mCategoryDtoList);
		}

		result = SUCCESS;
		return result;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
