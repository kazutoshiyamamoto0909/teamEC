package com.internousdev.i1810a.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PurchaseHistoryInfoDTO {
	
	private int id;
	//	購入履歴情報
	private String userId;
	private int productId;
	private int productCount;
	private int price;
	private int destinationId;
	private Date registDate;
	private Date updateDate;
	//	商品情報
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int categoryId;
	private String imageFileName;
	private String imageFilePath;
	private String releaseCompany;
	private Date releaseDate;
	//	宛先情報
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String email;
	private String telNumber;
	private String userAddress;
	//	その他
	private int subtotal;
}
